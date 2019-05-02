package com.AnaMartinez.Wincom.autocomplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autocomplete {
    public static final int MAXIMUM_SUGGESTIONS = 4;
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

    /**
     * Function that searches the keywords for suggested autocompletions given a string.
     *
     * @param s input string
     * @return List of Strings, containing the keywords suggested (up to MAXIMUM_SUGGESTIONS)
     */
    public List<String> getAutocompleteSuggestions(String s) {
        /*The algorithm compares the string and keyword in lowercase (to make it case insensitive).
        * The loop goes through the keywords list and exits at the end of the list, when the first letter of the
        * keyword is bigger than the first char of the input string, or when the maximum number of suggestions has ben found.
        * The stored suggestions are case sensitive.*/
        List<String> suggestions = new ArrayList<>();
        if(s != null) {
            if (!s.equals("")) {
                s.toLowerCase();
                boolean finish = false;
                int i = 0;
                while (!finish && (i < keywords.size())) {
                    String keyword = keywords.get(i).toLowerCase();
                    if (s.charAt(0) < keyword.charAt(0)) finish = true;
                    else if (keyword.startsWith(s)) {
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
