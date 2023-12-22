package prac;

public class Word {

    public String transform (String sentence, WordChecker wordChecker){
        String[]words = sentence.split(" ");
        for (int i = 0; i<words.length; i++ ){
            if(wordChecker.checkWord(words[i])){
                words[i] = wordChecker.transformWord(words[i]);
            }
        }
        return String.join(" ", words);
    }



    public String [] letterReplace(String string) {

        String [] words =  string.split(" ");
        String [] newWords = new String[words.length];

        for (int i = 0; i< words.length; i++){
            if(words[i].length()==3){
                newWords[i] = words[i].toUpperCase();
            }

            if(words[i].length()==4) {
                newWords[i] = words[i].toLowerCase();
            }

            if(words[i].length()==5) {
               newWords[i] = "*****";
            }

            }

        return newWords;
    }





}
