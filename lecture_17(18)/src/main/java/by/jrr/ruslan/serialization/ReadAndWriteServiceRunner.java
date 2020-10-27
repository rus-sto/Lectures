package by.jrr.ruslan.serialization;

import by.jrr.ruslan.serialization.io.service.ReadAndWriteFileService;

import java.io.IOException;

public class ReadAndWriteServiceRunner {
    public static void main(String[] args) throws IOException {
        ReadAndWriteFileService.readFileAsBytes();
    }
}
