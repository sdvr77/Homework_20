package ru.learnup.homework20;

import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

@Component
public class Analyzer {
    public void doAnalyze(int var, int randomVar, ResourceBundle resource) {

        if (randomVar > var) {
            System.out.println(resource.getString("more"));
        }
        if (randomVar < var) {
            System.out.println(resource.getString("small"));
        }
        if (randomVar == var) {
            System.out.println(resource.getString("true") + randomVar);
        }
    }
}
