package by.jrr.ruslan.serialization.io.service;

import java.io.File;
import java.time.Instant;
import java.util.stream.Stream;

import static by.jrr.ruslan.serialization.Apps.l;
import static by.jrr.ruslan.serialization.Apps.log;
import static java.util.stream.Collectors.joining;

public class FileService {

    public static final String resources =
            Stream.of("src", "main", "resources")
                    .collect(joining(l, ".".concat(l), l));
    public static final String loaderTextFile = resources.concat("loader.txt");


    public static void baseSyntax() {

        File file = new File(resources.concat("loader.txt"));
        log.info("is exists " + file.exists());
        log.info("Length " + file.length());
        log.info("lastModified " + Instant.ofEpochMilli(file.lastModified()));
        log.info("canWrite " + file.canWrite());
        file.setWritable(false);
        log.info("canWrite " + file.canWrite());
    }

    public static void createDirectory(String directory) {
        File dir = new File(resources.concat(directory));
        dir.mkdir();
    }

    public static void listDirectory(String path) {
        File file = new File(path);
        printDir(file, 0);
    }

    private static void printDir(File file, int tabs) {
        StringBuffer tab = new StringBuffer();
        for (int i = 0; i<tabs;  i++){
            tab.append("\t");
        }

        log.info(new String(tab.append(file.getName())));

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (file != null) {
                tabs++;
                for (File f : files) printDir(f, tabs);
            }
        }
    }
}

