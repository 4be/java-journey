package abedev.springvalidation.helper;

import org.springframework.stereotype.Component;

@Component
public class SayHello implements ISayHello{

      public String yourGreeting(String value){
            return "hello" + value;
      }
}
