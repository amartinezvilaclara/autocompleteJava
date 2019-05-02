package com.AnaMartinez.Wincom.autocomplete;

import java.util.List;

public class Main {

    public static void main (String[] args){

        Autocomplete autocomplete = new Autocomplete();

        List<String> suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("p");
        System.out.println("example 1, search for \"p\": " + suggestedAutocompletions);

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("pr");
        System.out.println("example 2, search for \"pr\": " + suggestedAutocompletions);

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("pro");
        System.out.println("example 3, search for \"pro\": " + suggestedAutocompletions);

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("prog");
        System.out.println("example 4, search for \"prog\": " + suggestedAutocompletions);

        
    }
}
