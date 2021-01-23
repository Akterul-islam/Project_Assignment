package com.in.rs.Controller;

import com.in.rs.Model.Dto.BloodDonateInfoDto;
import com.in.rs.Model.Entity.BloodDonateInfo;
import com.in.rs.Service.BloodDonateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "blood.donate")
public class BloodDonateInfoController {

    @Autowired
    BloodDonateInfoService bloodDonateInfoService;

    @PostMapping(value = "/createBloodEvent")
    public BloodDonateInfo createBloodEvent(@RequestBody BloodDonateInfoDto bloodDonateInfoDto) {
        return bloodDonateInfoService.createBloodEvent(bloodDonateInfoDto);
    }
}
