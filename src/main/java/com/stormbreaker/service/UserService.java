package com.stormbreaker.service;

import com.stormbreaker.domain.VerificationType;
import com.stormbreaker.model.User;
public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;
    public User findUserProfileByEmail(String email) throws Exception;
    public User findUserById(Long userId) throws Exception;

    public User enableTwoFactorAuthentication(VerificationType verificationType, String sendTo, User user);

    User updateUserProfile(User user, String newPassword);

}
