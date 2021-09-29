package com.lachhabayoub;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.mockito.Mockito.when;

// Automatic validation of framework usage, as well as an automatic initMocks()
@RunWith(MockitoJUnitRunner.class)

public class DriverPerformanceTest {
    //     while doing unit testing using junit you will come across places where you want to mock classes.
    //     Mocking is done when you invoke methods of a class that has external communication like database calls or rest calls

    @Mock
    private DriverPeformanceRepository driverPeformanceRepository;

    // allow us to inject mocked dependencies in the annotated class mocked object.
    @InjectMocks
    private DriverPerfornanceService driverPerfornanceService;

    @Test
    public void getDriverPerformanceTest() {
        //given
        DriverPerformance Dp1 = DriverPerformance.builder().driverId("1").minute(120).events(1212).build();
        DriverPerformance Dp2 = DriverPerformance.builder().driverId("1").minute(150).events(1505).build();
        List<DriverPerformance> perf = Lists.newArrayList(Dp1, Dp2);

        when(driverPeformanceRepository.getDriverPerformanceList("1"))
                .thenReturn(perf);

        //when
        DriverPerfornaceDTO dto = driverPerfornanceService.getDriverPerformance("1");

        //then

         assertEquals(270, dto.getMinute());
         assertEquals(2717, dto.getEvents());

//        Assert.assertEquals(270, dto.getMinute());
//        Assert.assertEquals(2717, dto.getEvents());
    }
}
