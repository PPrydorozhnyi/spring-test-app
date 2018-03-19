package springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by drake on 19/03/18.
 *
 * @author P.Pridorozhny
 */
//helper class with rules
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //parameters

    // default course code
    //could be multiple strings(String[])
    String value() default "COU";

    // default error message
    String message() default "Wrong course code";

    //default groups
    //can group related constraints
    Class<?>[] groups() default { };

    //provide custom detais about validation failure(severity level, error code etc)
    Class<? extends Payload>[] payload() default { };
}
