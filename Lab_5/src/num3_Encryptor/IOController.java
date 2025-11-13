package num3_Encryptor;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class IOController {

    char key;

    public IOController(char key){
        this.key = key;
    }
    
    protected void encryptSymbols(String symbolsString, String pathToFile) throws IOException{
        int[] symbolsAscii = symbolsString.chars().toArray();
        try(WriterFilter filter = new WriterFilter(new FileWriter(pathToFile), key)){
            for (int c : symbolsAscii) {
                filter.write(c);
            }
        }
    }

    protected String decryptSymbols(String pathToFile) throws IOException{
        try(ReaderFilter filter = new ReaderFilter(new FileReader(pathToFile), key)){
            
            ArrayList<Character> symbols = new ArrayList<Character>();
            int symbolAscii = filter.read();
            
            while(symbolAscii > -1){
                symbols.add((char)symbolAscii);
                symbolAscii = filter.read();
            }
            return symbols.stream().map(String::valueOf).collect(Collectors.joining());
        }
    }
}
