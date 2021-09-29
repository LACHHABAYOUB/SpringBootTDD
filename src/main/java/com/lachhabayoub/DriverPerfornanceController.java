package com.lachhabayoub;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // simplify the creation of RESTful web services
@RequestMapping("/dp") //maps HTTP requests to handler methods of MVC and REST controllers
public class DriverPerfornanceController {

    @GetMapping("/{id}")
    public ResponseEntity<DriverPerformance> getDriverDetails (@PathVariable String id) throws Exception {
        return new ResponseEntity<>( HttpStatus.OK);
    }
}