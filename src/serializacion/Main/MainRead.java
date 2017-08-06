package serializacion.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import serializacion.model.Person;
import serializacion.persistence.PersonJsonFileReader;
import serializacion.persistence.PersonNativeRead;

public class MainRead {
    
    public static void main(String [] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        
        //Deserializacion nativa
        Person sergioRecuperado;
        sergioRecuperado = new PersonNativeRead(new File("sergio.person")).read();
        System.out.println("Nombre de la persona es: " + sergioRecuperado.getName() + " y la fecha de  nacimiento es :"
                + sergioRecuperado.getBirthday());
        
        //Deserializacion Json
        sergioRecuperado = new PersonJsonFileReader(new File("santos.json")).read();
        System.out.println("Nombre de la persona es: " + sergioRecuperado.getName() + " y la fecha de  nacimiento es :"
                + sergioRecuperado.getBirthday());
    }
}
