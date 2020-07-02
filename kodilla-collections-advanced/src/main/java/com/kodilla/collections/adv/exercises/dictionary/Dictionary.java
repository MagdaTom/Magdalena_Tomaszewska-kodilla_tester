package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public int size(){
        return dictionary.size();
    }

    public void adddWord(String polishword, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishword, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishword, englishWords);

    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for(EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())){
            if(englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }
}
