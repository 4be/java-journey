package abedev.springvalidation;
import abedev.springvalidation.data.Foo;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class PalindromeTest {

      @Autowired
      private Validator validator;

      @Test
      void palindromeValid() {
            Set<ConstraintViolation<Foo>> violationSet = validator.validate(new Foo("kodok"));
            Assertions.assertTrue(violationSet.isEmpty());
      }

      @Test
      void palindromeInvalid() {
            Set<ConstraintViolation<Foo>> violationSet = validator.validate(new Foo("fajar"));
            Assertions.assertFalse(violationSet.isEmpty());
            Assertions.assertEquals(1,violationSet.size());
      }
}
