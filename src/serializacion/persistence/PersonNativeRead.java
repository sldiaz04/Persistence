package serializacion.persistence;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import serializacion.model.Person;

public class PersonNativeRead {
    private final File file;

    public PersonNativeRead(File file) {
        this.file = file;
    }
    public Person read() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Object object = ois.readObject();
        is.close();
        ois.close();
        return (Person) object;
    }
}
