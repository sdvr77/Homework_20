package ru.learnup.homework20;

import org.springframework.stereotype.Service;

import java.util.ResourceBundle;
import java.util.Scanner;

@Service
public class Game {
    private Analyzer analyzer;
    private Generator generator;

    public Game (Analyzer analyzer, Generator generator) {
        this.analyzer = analyzer;
        this.generator = generator;
    }

    public void doGame(ResourceBundle resource) {
        int randomVar = generator.doGenerateVar();
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        analyzer.doAnalyze(var, randomVar, resource);
    }
}
