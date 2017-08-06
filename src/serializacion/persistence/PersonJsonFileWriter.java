package serializacion.persistence;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import serializacion.model.Person;

public class PersonJsonFileWriter {
    
    private final File file;

    public PersonJsonFileWriter(File file) {
        this.file = file;
    }
    
    public void write(Person person) throws IOException{
        FileWriter fr = new FileWriter(file);
        fr.write(new GsonBuilder().create().toJson(person));
        fr.close();
    }
}
