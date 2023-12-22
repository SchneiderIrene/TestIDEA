package prac;

public class ToUpperCaseChecker implements WordChecker{
    @Override
    public boolean checkWord(String word) {
        return word.length()==3;
    }

    @Override
    public String transformWord(String word) {
        return word.toUpperCase();
    }
}
