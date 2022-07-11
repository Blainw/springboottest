package wdm.springboot.ch5.ch5_2.ch5_2_5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {

    private String breed;
    private String  name;
    private Integer age;

}
