package serializacion.Main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import serializacion.model.Person;
import serializacion.persistence.PersonJsonFileWriter;
import serializacion.persistence.PersonNativeFileWriter;

public class MainWrite {
    
    public static void main(String [] args) throws IOException{
        Person sergio = new Person("Sergio", LocalDate.of(1990, 02, 4));
        File file = new File("sergio.person");
        
        //Serializacion nativa
        PersonNativeFileWriter person = new PersonNativeFileWriter(file);
        person.write(sergio);
        
        //Serializacion Json
        new PersonJsonFileWriter(new File("santos.json")).write(sergio);
        System.out.println("Person saved");
    }
}
