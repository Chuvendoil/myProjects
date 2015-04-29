package test.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Chuvychin on 19.04.2015.
 */
@Entity
@Table (name = "DOGS")

public class Dog extends Animal{
    private String fuckingTestDog;

    public Dog() {
    }

    public String getFuckingTestDog() {
        return fuckingTestDog;
    }

    public void setFuckingTestDog(String fuckingTestDog) {
        this.fuckingTestDog = fuckingTestDog;
    }
}
