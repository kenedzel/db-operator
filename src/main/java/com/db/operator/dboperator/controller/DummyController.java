package com.db.operator.dboperator.controller;

import com.db.operator.dboperator.model.Device;
import com.db.operator.dboperator.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DummyController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping(value = "/device")
    public ResponseEntity<List<Device>> fetchAllDevices() {
        return new ResponseEntity<>(deviceService.fetchAllDevices(), HttpStatus.OK);
    }

    @PostMapping(value = "/device")
    public ResponseEntity<?> saveDevice(@RequestBody Device device) {
        deviceService.saveDevice(device);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
