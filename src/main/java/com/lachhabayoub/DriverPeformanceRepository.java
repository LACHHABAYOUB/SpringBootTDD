package com.lachhabayoub;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
// The Spring @Repository annotation is a specialization of the @Component annotation which indicates that an annotated
// class is a “Repository”, which can be used as a mechanism for
// encapsulating storage, retrieval, and search behavior which emulates a collection of objects.


public interface DriverPeformanceRepository extends JpaRepository<DriverPerformance, Long> {

    @Query("Select dp from DriverPerformance dp where dp.driverId= :driverId")
    List<DriverPerformance> getDriverPerformanceList(String driverId);


}
