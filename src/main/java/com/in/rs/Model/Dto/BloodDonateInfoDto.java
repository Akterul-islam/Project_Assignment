package com.in.rs.Model.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class BloodDonateInfoDto {
    private Long id;
    private String placeName;
    private Date createdDate;
}
