package test.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Chuvychin on 19.04.2015.
 */
@Entity
@Table(name ="CATS")

public class Cat extends Animal {
    private String fuckingTestCat;

    public Cat() {
    }

    public String getFuckingTestCat() {
        return fuckingTestCat;
    }

    public void setFuckingTestCat(String fuckingTestCat) {
        this.fuckingTestCat = fuckingTestCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "fuckingTestCat='" + fuckingTestCat + '\'' +
                '}';
    }
}
