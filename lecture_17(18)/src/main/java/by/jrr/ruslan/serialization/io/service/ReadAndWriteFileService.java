package by.jrr.ruslan.serialization.io.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import static by.jrr.ruslan.serialization.io.service.FileService.loaderTextFile;

public class ReadAndWriteFileService {
    public static void readFileAsBytes()   throws IOException {
        InputStream input = new FileInputStream(loaderTextFile);
        int byteOfData = input.read();
        while ( byteOfData !=-1) {
            System.out.print(byteOfData);
            byteOfData = input.read();
        };
         input.close();
    }
}
