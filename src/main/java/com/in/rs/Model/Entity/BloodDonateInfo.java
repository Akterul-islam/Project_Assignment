package com.in.rs.Model.Entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blood_donate_info")
@EntityListeners(AuditingEntityListener.class)
@Data
public class BloodDonateInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placeName;
    private Date createdDate;
}
