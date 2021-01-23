package com.in.rs.Service;


import com.in.rs.Model.Dto.BloodDonateInfoDto;
import com.in.rs.Model.Entity.BloodDonateInfo;
import com.in.rs.Repository.BloodDonateInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BloodDonateInfoService {
    @Autowired
    BloodDonateInfoRepository bloodDonateInfoRepository;

    public BloodDonateInfo createBloodEvent(BloodDonateInfoDto bloodDonateInfoDto) {
        BloodDonateInfo bloodDonateInfo = new BloodDonateInfo();
        bloodDonateInfo.setPlaceName(bloodDonateInfoDto.getPlaceName());
        bloodDonateInfo.setCreatedDate(bloodDonateInfoDto.getCreatedDate());
        return bloodDonateInfoRepository.save(bloodDonateInfo);
    }
}
