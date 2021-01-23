package com.in.rs.Model.Entity;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String mobileNo;
    private String alternateMobile;
    private String bloodGroup;
    private String religion;
    private String weight;
    private String presentUnion;
    private String postOffice;
    private String policeStation;
    private String district;
    @OneToOne
    UserType userType;
}
