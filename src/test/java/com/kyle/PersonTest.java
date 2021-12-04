package com.kyle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person person = new Person("kyle",56f,1.63f);
        Assertions.assertEquals((56f/(1.63f*1.63f)),person.bmi());
    }
}
