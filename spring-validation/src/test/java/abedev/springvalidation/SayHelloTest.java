package abedev.springvalidation;

import abedev.springvalidation.helper.SayHello;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SayHelloTest {

      @Autowired
      SayHello sayHello;

      @Test
      void SuccessHello() {
            String message = sayHello.yourGreeting("eko");
            Assertions.assertEquals("helloeko",message);

      }

      @Test
      void failedHello() {
            Assertions.assertThrows(ConstraintViolationException.class,() -> {
                  sayHello.yourGreeting("");
            });
      }
}
