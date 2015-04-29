package test.domain;

import javax.persistence.*;

/**
 * Created by Chuvychin on 19.04.2015.
 */
@Entity
@Table (name = "ANIMALS")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn (name = "TYPE")
public abstract class Animal {

    @SequenceGenerator(name = "sequence", sequenceName = "SEQ_EMPLOYEES_ID",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Id
    @Column (name = "TYPE")
    private Long type;

    private String name;
    private String color;
    private String voice;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
