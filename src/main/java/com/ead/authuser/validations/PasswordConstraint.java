package com.ead.authuser.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {

    String message() default """
            Invalid password! Password must contain at least one digit (0-9),
            at least one lowercase Latin character [a-z], at least one uppercase character [A-Z],
            at least one special character like !@#$, a length of at least 6 characters and max 20""";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
