package serializacion.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable{
    
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    
}
