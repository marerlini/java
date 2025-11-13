package num3_Encryptor;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderFilter extends FilterReader{
    
    char key;

    public ReaderFilter(Reader reader, char key){
        super(reader);
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int symbolAscii = super.read();
        symbolAscii -= key;
        return symbolAscii;
    }

}
