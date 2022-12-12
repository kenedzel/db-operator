package com.db.operator.dboperator.service.impl;

import com.db.operator.dboperator.service.DeviceService;
import com.db.operator.dboperator.model.Device;
import com.db.operator.dboperator.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceRepository deviceRepository;

    @Override
    public List<Device> fetchAllDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public void saveDevice(Device device) {
        deviceRepository.save(device);
    }
}
