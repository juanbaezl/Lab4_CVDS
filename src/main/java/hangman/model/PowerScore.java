package hangman.model;
import java.lang.Math;

public class PowerScore implements GameScore{

    @Override
    public int calculateScore(int correctLetter, int incorrectLetter) throws HangManException{
        if (correctLetter < 0 || incorrectLetter < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER);
        }
        int correctPoints, incorrectPoints, score;
        correctPoints = (correctLetter==0)?0:(int)Math.pow(5, correctLetter);
        incorrectPoints =  8*incorrectLetter;
        score = correctPoints - incorrectPoints;
        return (score > 500)?500:(score<0)?0:score;
    }    
}