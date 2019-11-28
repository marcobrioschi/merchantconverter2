package biz.brioschi.merchantconverter;

import biz.brioschi.merchantconverter.shell.MerchantShell;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final String EXIT = "exit";

    private static MerchantShell shell = new MerchantShell();

    // TODO create a converter class
    public static void main(String args[]) {
        if (args.length == 0) {     // Interactive input
            interactiveConsoleInput();
            System.out.println("Have a nice day :-)");
        } else {                    // Parse each file
            for (String fileName : args) {
                parseFileContent(fileName);
            }
        }
    }

    private static void interactiveConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.printf("> ");
            line = scanner.nextLine();
            if (!EXIT.equals(line)) {
                parseString(line);
            };
        } while (!EXIT.equals(line));
    }

    private static void parseFileContent(String fileName) {
        try {
            List<String> lines = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).collect(Collectors.toList());
            for (String line : lines) {
                System.out.printf("> %s\n", line);
                parseString(line);
            }
        } catch (IOException e) {
            System.out.printf("Error on reading file %s: %s\n", fileName, e.getMessage());
        };
    }

    private static void parseString(String content) {
        Optional<String> result = shell.parseLine(content);
        if (result.isPresent()) {
            System.out.println(result.get());
        }
    }

}
