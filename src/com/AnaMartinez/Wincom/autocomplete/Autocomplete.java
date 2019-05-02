package com.AnaMartinez.Wincom.autocomplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autocomplete {
    private List<String> keywords;

    public Autocomplete() {
        keywords = new ArrayList<>();
        Collections.addAll(keywords,"Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline",
                "Press democrat", "Progressive", "Project runway", "Proactive", "Programming", "Progeria",
                "Progesterone", "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank", "Bowl", "Owl",
                "River", "Phone", "Kayak", "Stamps", "Reprobe");

        Collections.sort(keywords);
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public int getAutocompleteSuggestions(String typedString, String[] autocompletionSuggestions){
        return 0;
    }
}
