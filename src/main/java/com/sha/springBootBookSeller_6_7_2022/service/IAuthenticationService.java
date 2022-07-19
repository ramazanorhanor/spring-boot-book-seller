package com.sha.springBootBookSeller_6_7_2022.service;

import com.sha.springBootBookSeller_6_7_2022.model.User;

public interface IAuthenticationService {

    User signInAndReturnJWT(User signInRequest);
}
