package com.company;

import com.company.analyzer.TextAnalyzer;
import com.company.model.Label;

public class Main {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
    }
}