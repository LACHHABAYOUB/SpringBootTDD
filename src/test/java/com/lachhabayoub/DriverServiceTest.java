package com.lachhabayoub;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

// Automatic validation of framework usage, as well as an automatic initMocks()
@RunWith(MockitoJUnitRunner.class)

public class DriverServiceTest {

    //     while doing unit testing using junit you will come across places where you want to mock classes.
    //     Mocking is done when you invoke methods of a class that has external communication like database calls or rest calls

    @Mock
    private DriverRepository driverRepository;

    // allow us to inject mocked dependencies in the annotated class mocked object.
    @InjectMocks
    private DriverService driverService;

    @Test
    public void getdriversSSN_hashFirstFiveDigits_withxxxxx_returnSsn() {

        //given
        Driver d1 = Driver.builder().id(123L).ssn("123456789").active(true).build();
        List<Driver> drivers = Lists.newArrayList(d1);


        when(driverRepository.getAllDrivers()).thenReturn(drivers);

        //when
        driverService.getDriverList();

        //then
        assertEquals("Hashing first 5 digits and compare with actual one","xxxxx6789", d1.getSsn());
    }

}
