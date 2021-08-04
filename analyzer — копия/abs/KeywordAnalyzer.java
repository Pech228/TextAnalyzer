package com.company.analyzer.abs;

import com.company.analyzer.TextAnalyzer;
import com.company.model.Label;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    @Override
    public Label processText(String text) {
        String keywords[] = getKeywords();
        for(String word: keywords){
            if (text.contains(word)){
                return getLabel();
            }
        }
        return Label.OK;
    }
}