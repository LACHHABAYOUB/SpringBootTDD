package com.lachhabayoub;

import lombok.Builder;
import lombok.Data;

@Builder //useful mechanism for using the Builder pattern without writing boilerplate code
@Data //Generates getters and setters for all fields

public class DriverPerfornaceDTO {
    private String driverId;
    private int minute;
    private int events;
}
