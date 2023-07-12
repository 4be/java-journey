package abedev.springvalidation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class SayHello {

      public String yourGreeting(@NotBlank String value){
            return "hello" + value;
      }
}
