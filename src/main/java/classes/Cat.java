package classes;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private String colour;
    private LocalDateTime dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(colour, cat.colour) && Objects.equals(dateOfBirth, cat.dateOfBirth);
    }

    public void setDateOfBirth(LocalDateTime now) {
        this.dateOfBirth = now;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }
}
