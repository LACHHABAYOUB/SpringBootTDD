package com.lachhabayoub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //used with classes that provide some business functionalities
public class DriverService {
    @Autowired //enables you to inject the object dependency implicitly.

    private DriverRepository driversRepository;

//    public List<Driver> getDriverList() {
//        List<Driver> drivers = driversRepository.getAllDrivers();
//
//        StringBuilder sb = new StringBuilder();
//        for(Driver d: drivers){
//            sb.append(d.getSsn());
//            sb.replace(0,5,"xxxxx");
//            d.setSsn(sb.toString());
//        }
//        return drivers;
//
//    }



    public List<Driver> getDriverList() {
        List<Driver> drivers = driversRepository.getAllDrivers().stream().map(x ->
                {
                    x.setSsn("xxxxx" + x.getSsn().substring(5,9));
                    return x;
                }
        ).collect(Collectors.toList());


        return drivers;

    }



}

