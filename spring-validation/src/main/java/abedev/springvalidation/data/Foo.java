package abedev.springvalidation.data;

import abedev.springvalidation.validation.Palindrome;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {

      @Palindrome
      private String bar;

}
