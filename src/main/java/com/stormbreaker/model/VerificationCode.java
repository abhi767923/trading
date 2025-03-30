package com.stormbreaker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    @OneToOne
    private User user;

    private String email;

    private String mobile;

    private String verificationCode;
}
