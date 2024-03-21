package com.ead.authuser.validation;

import com.ead.authuser.validation.impl.UsernameConstraintImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD}) // utilizacao da anotacao me metodos e campos
@Retention(RetentionPolicy.RUNTIME) // ocorrer em tempo de execucao
public @interface UsernameConstraint {
    String message() default "Invalid username"; // mensagem quando ocorrer erro
    Class<?>[] groups() default {}; // grupo de validação
    Class<? extends Payload>[] payload() default {}; // nivel que ira ocorrer o erro
}
