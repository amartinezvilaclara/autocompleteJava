package com.AnaMartinez.Wincom.autocomplete.tests;

import com.AnaMartinez.Wincom.autocomplete.Autocomplete;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AutocompleteTest {

    @Before
    public void setUp() throws Exception {
    }

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
        System.out.println("kewords: " + keywordList);
    }

    @Test
    public void theAutocompletionReturnTheNumberOfSuggestions(){
        Autocomplete autocomplete = new Autocomplete();
        String [] suggestedAutocompletions = new String[4];
        int numberOfSuggestions = autocomplete.getAutocompleteSuggestions("a", suggestedAutocompletions);
        assertEquals(0, numberOfSuggestions);
    }

}

