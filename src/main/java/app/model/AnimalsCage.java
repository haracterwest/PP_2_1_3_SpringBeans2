package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AnimalsCage {

    private Animal animal;

    @Autowired
    @Qualifier("timer")
    Timer time = new Timer();


    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }


public Timer getTimer(){
        return this.time;
}

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }
}
