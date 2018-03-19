package springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by drake on 19/03/18.
 *
 * @author P.Pridorozhny
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String coursePrefix;

   public void initialize(CourseCode constraint) {
       coursePrefix = constraint.value();
   }

   public boolean isValid(String code,
                          //additional error messages
                          ConstraintValidatorContext context) {

       boolean result;

       result = code == null || code.startsWith(coursePrefix);

       return result;
   }
}
