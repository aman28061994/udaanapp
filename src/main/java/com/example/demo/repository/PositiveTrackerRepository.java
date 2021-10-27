package com.example.demo.repository;

import com.example.demo.models.PositiveTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositiveTrackerRepository extends JpaRepository<com.example.demo.models.PositiveTracker,Integer> {
    public PositiveTracker save(PositiveTracker positiveTracker);
    public List<PositiveTracker> findPositiveTrackerByPincode(Integer pincode);
}
