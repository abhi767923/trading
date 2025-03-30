package com.stormbreaker.service;

import com.stormbreaker.model.VerificationCode;

public interface VerificationCodeService {
    VerificationCode sendVerificationCode(VerificationCode verificationCode);

    VerificationCode getVerificationCodeById(Long id);

    VerificationCode getVerificationCodeByUser(Long userId);

    void deleteVerificationCodeById(VerificationCode verificationCode);
}
