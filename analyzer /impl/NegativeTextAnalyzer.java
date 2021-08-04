package com.company.analyzer.impl;

import com.company.analyzer.TextAnalyzer;
import com.company.analyzer.abs.KeywordAnalyzer;
import com.company.model.Label;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private  String[] KeyWords={":(", "=(",":|"};
    @Override
    protected String[] getKeywords() {
        return KeyWords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}