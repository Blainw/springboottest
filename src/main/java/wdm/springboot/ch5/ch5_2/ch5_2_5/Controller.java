package wdm.springboot.ch5.ch5_2.ch5_2_5;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping ("/getpet")
    public Pet getPet(Pet pet){
        return pet;
    }

}
