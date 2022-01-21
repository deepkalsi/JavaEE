package com.globomatics.bike.utils;


import org.junit.Test;

import static org.junit.Assert.assertThat;

public class EmailValidatorTest {

    @Test
    public void validateEmail() {
        EmailValidator emailValidator = new EmailValidator();
        //Given
        String email = "deepak@gmail.com";

        //when
       boolean isValid = emailValidator.test(email);

       //then




    }
}
