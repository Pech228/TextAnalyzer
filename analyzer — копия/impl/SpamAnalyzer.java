package com.company.analyzer.impl;

import com.company.analyzer.TextAnalyzer;
import com.company.analyzer.abs.KeywordAnalyzer;
import com.company.model.Label;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keyWords;


    @Override
    protected String[] getKeywords() {
        return keyWords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }



    public SpamAnalyzer(String[] keyWords) {
        this.keyWords = keyWords;
    }

}
