package lv.javaguru.homework.lesson9.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyTest{

    private UniqueWordVocabulary uniqueWordVocabulary;

    @BeforeEach
    void setUp() {
        uniqueWordVocabulary = new UniqueWordVocabulary();
    }

    @Test
    void shouldAddWordThatIsNotNull() {
        uniqueWordVocabulary.addWord("word");

        assertEquals(1, uniqueWordVocabulary.getUniqueWords());
    }

    @Test
    void shouldNotAddNull() {
        uniqueWordVocabulary.addWord(null);

        assertEquals(0, uniqueWordVocabulary.getUniqueWords());
    }

    @Test
    void shouldGetUniqueWordCount() {
        uniqueWordVocabulary.addWord("apple");
        uniqueWordVocabulary.addWord("banana");
        uniqueWordVocabulary.addWord("apple");
        uniqueWordVocabulary.addWord("pear");
        uniqueWordVocabulary.addWord("apple");

        assertEquals(3, uniqueWordVocabulary.getUniqueWords());
    }
}