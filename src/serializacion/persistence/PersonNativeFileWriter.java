package serializacion.persistence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import serializacion.model.Person;

public class PersonNativeFileWriter {
    
    private final File file;

    public PersonNativeFileWriter(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }
    public void write(Person person) throws IOException{
        FileOutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new  ObjectOutputStream(os);
        oos.writeObject(person);
        oos.flush();
        oos.close();
        os.close();
    }
}
