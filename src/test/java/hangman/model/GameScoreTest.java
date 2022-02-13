package hangman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.*;
import hangman.model.*;

public class GameScoreTest {
    @Test
    public void Case1GeneralOriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(-1, 1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }
    @Test
    public void Case2GeneralOriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }


    @Test
    public void Case3GeneralOriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    public void Case1OriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 5);
        assertEquals(50, result);
        }
        catch(HangManException e){
            fail();
           }
    }

    @Test
    public void Case2OriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 12);
        assertEquals(0, result);
        }
        catch(HangManException e){
            fail();
           }
    }

    @Test
    public void Case3OriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(4, 5);
        assertEquals(50, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    public void Case1GeneralPowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(-1, 1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    public void Case2GeneralPowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }
    
    @Test
    public void Case3GeneralPowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    public void Case1PowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(2, 4);
        assertEquals(0, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    public void Case2PowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(3, 4);
        assertEquals(93, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    public void Case3PowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(4, 2);
        assertEquals(500, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    public void Case1GeneralBonusScore(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(-1, 1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    public void Case2GeneralBonusScore(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);
        }
    }
    
    @Test
    public void Case3GeneralBonusScore(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    public void Case1BonusScore(){
        try{
        BonusScore score = new BonusScore();
        int result = score.calculateScore(4, 2);
        assertEquals(30, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    public void Case2BonusScore(){
        try{
        BonusScore score = new BonusScore();
        int result = score.calculateScore(4, 9);
        assertEquals(0, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    

   

}