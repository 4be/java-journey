package abedev.springvalidation.validation;

import abedev.springvalidation.helper.StringHelper;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PalindromeValidator implements ConstraintValidator<Palindrome,String> {

      @Autowired
      private StringHelper helper;


      @Override
      public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
            return helper.isPalindrome(value);
      }
}
