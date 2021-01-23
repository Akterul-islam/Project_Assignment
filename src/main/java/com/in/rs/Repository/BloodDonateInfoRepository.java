package com.in.rs.Repository;

import com.in.rs.Model.Entity.BloodDonateInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodDonateInfoRepository extends JpaRepository<BloodDonateInfo, Long> {
}
