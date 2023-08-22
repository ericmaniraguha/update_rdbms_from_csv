package com.csv_to_rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.csv.CSVFormat;
import org.springframework.transaction.annotation.Transactional;

import com.csv_to_rdbms.entity.DataEntity;
import com.csv_to_rdbms.repository.DataRepository;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;


@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataRepository dataRepository;

    @Override
    @Transactional
    public void updateDataFromCSV() {
        try {
            Reader in = new FileReader(new File("data.csv"));
            CSVFormat.RFC4180.builder()
                .setAllowMissingColumnNames(true)
                .setHeader("SubjectId", "AgeMonths", "Gender", "HeightInches", "WeightLbs", "LegLengthInches", "SpeedMetersPerSec", "Group")
                .setSkipHeaderRecord(true).build().parse(in).forEach(record -> {
                    DataEntity data = new DataEntity();
                    try {
                        data.setSubjectId(Integer.parseInt(record.get("SubjectId")));
                        data.setAgeMonths(Integer.parseInt(record.get("AgeMonths")));
                        data.setGender(record.get("Gender"));
                        data.setHeightInches(Double.parseDouble(record.get("HeightInches")));
                        data.setWeightLbs(Double.parseDouble(record.get("WeightLbs")));
                        data.setLegLengthInches(Double.parseDouble(record.get("LegLengthInches")));
                        data.setSpeedMetersPerSec(Double.parseDouble(record.get("SpeedMetersPerSec")));
                        data.setGroup(record.get("Group"));
                        dataRepository.save(data);
                    } catch (NumberFormatException e) {
                        // Handle invalid number format
                        System.out.println("Error parsing numeric value. Skipping record.");
                    } catch (Exception e) {
                        // Handle other exceptions
                        System.out.println("An error occurred while processing the record. Skipping.");
                    }
                });
        } catch (Exception e) {
            // Handle file or IO errors
            System.out.println("An error occurred while reading the CSV file.");
            e.printStackTrace();
        }
    }

    // Other methods and dependencies...
}
