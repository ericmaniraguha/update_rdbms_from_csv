package com.csv_to_rdbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csv_to_rdbms.service.DataService;

@RestController
@RequestMapping("/rdbms")
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/update-data")
    public ResponseEntity<String> updateData() {
        dataService.updateDataFromCSV();
        return ResponseEntity.ok("Data updated successfully");
    }
}
