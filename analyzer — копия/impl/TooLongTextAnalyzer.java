package com.company.analyzer.impl;

import com.company.analyzer.TextAnalyzer;
import com.company.model.Label;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    @Override
    public Label processText(String text) {
        if(text.length()>maxLength){
            return Label.TOO_LONG;
        }
        return Label.OK;
    }

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }
}