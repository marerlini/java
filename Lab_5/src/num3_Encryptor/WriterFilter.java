package num3_Encryptor;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterFilter extends FilterWriter{
    
    char key;
    
    public WriterFilter(Writer writer, char key){
        super(writer);
        this.key = key;
    }

    @Override
    public void write(int c) throws IOException{
        c += key;
        super.write(c);
    }
}
