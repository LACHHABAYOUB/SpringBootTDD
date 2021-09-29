package com.lachhabayoub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //used with classes that provide some business functionalities

public class DriverPerfornanceService {

    @Autowired //enables us to inject the object dependency implicitly.
    private DriverPeformanceRepository driverPeformanceRepository;

    public DriverPerfornaceDTO getDriverPerformance(String driverId) {
        List<DriverPerformance> driverperformanceList = driverPeformanceRepository.getDriverPerformanceList(driverId);

        int minutes = 0;
        int events = 0;

        for (DriverPerformance driverPerformance : driverperformanceList) {
            minutes += driverPerformance.getMinute();
            events += driverPerformance.getEvents();
        }

        return new DriverPerfornaceDTO(driverId,minutes,events);

//        return DriverPerfornaceDTO
//                .builder()
//                .driverId(driverId)
//                .minute(minutes)
//                .events(events)
//                .build();
    }

}
