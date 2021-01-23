package com.in.rs.Model.Dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String mobileNo;
    private String alternateMobile;
    private String bloodGroup;
    private String religion;
    private String weight;
    private String union;
    private String postOffice;
    private String policeStation;
    private String district;
    private Long userTypeId;
}
