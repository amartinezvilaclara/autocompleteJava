package com.AnaMartinez.Wincom.autocomplete.tests;

import com.AnaMartinez.Wincom.autocomplete.Autocomplete;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AutocompleteTest {

    @Test
    public void theAutocompleteHasAKeywordsDataStructureObject(){
        Autocomplete autocomplete = new Autocomplete();
        assertNotNull(autocomplete.getKeywords());
    }

    @Test
    public void theAutocompleteHasAnInitializedListOfKeyWords(){
        Autocomplete autocomplete = new Autocomplete();
        List<String> keywordList = autocomplete.getKeywords();
        assertNotEquals(0,keywordList.size());
    }

    @Test
    public void theListOfKeywordsIsSorted(){
        Autocomplete autocomplete = new Autocomplete();
        List<String> keywordList = autocomplete.getKeywords();
        assertEquals("Bowl",keywordList.get(0));
        System.out.println("Ordered kewords: " + keywordList);
    }

    @Test
    public void theAutocompletionReturnsTheSuggestionsGivenAnInput(){
        Autocomplete autocomplete = new Autocomplete();
        List<String> suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("a");
        assertEquals(0,suggestedAutocompletions.size());

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("b");
        assertEquals(1,suggestedAutocompletions.size());

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("project");
        assertEquals(2,suggestedAutocompletions.size());

    }

    @Test
    public void theAutocompletionReturns0WhenTheInputIsAnEmptyString(){
        Autocomplete autocomplete = new Autocomplete();
        List<String> suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("");
        assertEquals(0,suggestedAutocompletions.size());
    }

    @Test
    public void theAutocompletionReturns0WhenTheInputIsANullString(){
        Autocomplete autocomplete = new Autocomplete();
        List<String> suggestedAutocompletions = autocomplete.getAutocompleteSuggestions(null);
        assertEquals(0,suggestedAutocompletions.size());
    }

    @Test
    public void theAutocompletionReturnsAMaximumOf4Suggestions(){
        Autocomplete autocomplete = new Autocomplete();
        List<String> suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("p");
        assertEquals(4,suggestedAutocompletions.size());
        System.out.println("example 1, search for \"p\": " + suggestedAutocompletions);

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("pr");
        assertEquals(4,suggestedAutocompletions.size());
        System.out.println("example 2, search for \"pr\": " + suggestedAutocompletions);

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("pro");
        assertEquals(4,suggestedAutocompletions.size());
        System.out.println("example 3, search for \"pro\": " + suggestedAutocompletions);

        suggestedAutocompletions = autocomplete.getAutocompleteSuggestions("prog");
        assertEquals(4,suggestedAutocompletions.size());
        System.out.println("example 4, search for \"prog\": " + suggestedAutocompletions);
    }
}

