package hangman.model;
public class BonusScore implements GameScore{
    @Override
    public int calculateScore(int correctLetter, int incorrectLetter) throws HangManException{
        if (correctLetter < 0 || incorrectLetter < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER);
        }
        int correctPoints, incorrectPoints;
        correctPoints = correctLetter * 10;
        incorrectPoints =  incorrectLetter * 5;
        return (correctPoints-incorrectPoints>0)?correctPoints-incorrectPoints:0;
    }
}