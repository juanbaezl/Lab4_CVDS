package hangman.model;
public class BonusScore implements GameScore{
    @Override
    public int CalculateScore(int correctLetter, int incorrectLetter) throws HangManException{
        if (correctLetter < 0 || incorrectLetter < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER)
        }
        int correctPoints, incorrectPoints;
        correctPoints, incorrectPoints = correctLetter * 10, incorrectLetter * 5;
        return (correctPoints-incorrectPoints>0)?correctPoints-incorrectPoints:0;
    }
}