package abedev.springvalidation.helper;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ISayHello {

      String yourGreeting(@NotBlank String name);
}
