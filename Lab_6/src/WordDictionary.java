import java.util.HashMap;

public class WordDictionary{

    private HashMap<String, String> wordMap;

    public WordDictionary(){
        wordMap = new HashMap<>();
    }

    public void addWord(String wordsLine){
        String[] words = wordsLine.split(" - ");
        wordMap.put(words[0], words[1]);
    }

    public void addWordList(String wordsLines){
        String[] wordsLinesArr = wordsLines.split("\n");
        String[] words;
        for (String wordLine : wordsLinesArr) {
            words = wordLine.split(" - ");
            wordMap.put(words[0], words[1]);
        }
    }

    public void translate(String keyWord){
        String translation = wordMap.get(keyWord);
        if(translation == null){
            System.out.println("Такого слова в словнику немає.");
        }
        else{
            System.out.println(wordMap.get(keyWord));
        }
    }

    public void translateForPhrase(String keyWord){
        String translation = wordMap.get(keyWord);
        if(translation == null){
            System.out.print(" - ");
        }
        else{
            System.out.print(wordMap.get(keyWord) + " ");
        }
    }

    public void translateWords(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            translateForPhrase(word);
        }
        System.out.println();
    }
}
