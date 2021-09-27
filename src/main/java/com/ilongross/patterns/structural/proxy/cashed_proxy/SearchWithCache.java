package com.ilongross.patterns.structural.proxy.cashed_proxy;

import java.util.LinkedList;
import java.util.List;

public class SearchWithCache implements Search{

    private final Search search;
    private final List<String> alreadyFoundPhrases = new LinkedList<>();


    public SearchWithCache(Search search) {
        this.search = search;
    }

    @Override
    public boolean find(String phrase) throws InterruptedException {

        if(alreadyFoundPhrases.contains(phrase)) {
            return true;
        }

        boolean found = search.find(phrase);
        if(found) {
            alreadyFoundPhrases.add(phrase);
        }

        return found;
    }
}
