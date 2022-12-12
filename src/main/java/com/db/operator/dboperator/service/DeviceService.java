package com.db.operator.dboperator.service;

import com.db.operator.dboperator.model.Device;

import java.util.List;

public interface DeviceService {

    List<Device> fetchAllDevices();

    void saveDevice(Device device);
}
