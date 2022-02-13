package hangman.model;
public class OriginalScore implements GameScore{
    @Override
    public int CalculateScore(int correctLetter, int incorrectLetter) throws HangManException{
        if (correctLetter < 0 || incorrectLetter < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER)
        }
        return (incorrectLetter<10)?100-incorrectLetter*10:0;
    }
}