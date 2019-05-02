package com.AnaMartinez.Wincom.autocomplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autocomplete {
    private static final int MAXIMUM_SUGGESTIONS = 4;
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

    public List<String> getAutocompleteSuggestions(String s) {
        List<String> suggestions = new ArrayList<>();
        if(s != null) {
            if (!s.equals("")) {
                //both strings are turned to lowercase to make the comparison case insensitive.
                s.toLowerCase();
                boolean finish = false;
                int i = 0;
                while (!finish && (i < keywords.size())) {
                    String keyword = keywords.get(i).toLowerCase();
                    if (s.charAt(0) < keyword.charAt(0)) finish = true;
                    else if (keyword.startsWith(s)) {
                        //the saved suggestion is the keyword orginial stored, to retrieve any uppercase Letter.
                        suggestions.add(keywords.get(i));
                        if(suggestions.size() == MAXIMUM_SUGGESTIONS) finish = true;
                    }
                    i++;
                }
            }
        }
        return suggestions;
    }
}
