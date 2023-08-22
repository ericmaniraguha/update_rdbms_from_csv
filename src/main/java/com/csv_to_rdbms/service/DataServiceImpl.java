package com.csv_to_rdbms.service;

import java.io.FileReader;
import java.io.Reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.apache.commons.csv.CSVFormat;

import com.csv_to_rdbms.entity.DataEntity;
import com.csv_to_rdbms.repository.DataRepository;

import jakarta.transaction.Transactional;

// ...
import java.io.File;

// ...

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataRepository dataRepository;

    @Override
    @Transactional
    public void updateDataFromCSV() {
        // Using FileReader to read the CSV file as a character stream
        try (Reader in = new FileReader(new File("data.csv"))) {
            // Defining the CSV format with headers and desired options
            CSVFormat.RFC4180.builder()
                .setAllowMissingColumnNames(true) // Allow missing column names in the CSV
                .setHeader("SubjectId", "AgeMonths", "Gender", "HeightInches", "WeightLbs", "LegLengthInches", "SpeedMetersPerSec", "Group") // Set CSV header names
                .setSkipHeaderRecord(true) // Skip the first line (header) while parsing
                .build()
                .parse(in) // Parse the CSV data
                .forEach(record -> {
                    // Create a DataEntity object for each CSV record
                    DataEntity data = new DataEntity();
                    // Extract data from CSV record and set them in the DataEntity object
                    data.setSubjectId(Integer.parseInt(record.get("SubjectId")));
                    data.setAgeMonths(Integer.parseInt(record.get("AgeMonths")));
                    data.setGender(record.get("Gender"));
                    data.setHeightInches(Double.parseDouble(record.get("HeightInches")));
                    data.setWeightLbs(Double.parseDouble(record.get("WeightLbs")));
                    data.setLegLengthInches(Double.parseDouble(record.get("LegLengthInches")));
                    data.setSpeedMetersPerSec(Double.parseDouble(record.get("SpeedMetersPerSec")));
                    data.setGroup(record.get("Group"));
                    // Save the DataEntity object to the repository
                    dataRepository.save(data);
                });
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception
        }
    }

    // Other methods and dependencies...
}
