package hangman.model;
public interface GameScore {
    
    /**
     * Calculate the game score 
     * @pre correctCount and incorrectCount  must be positives
     * @param correctLetter correct Count of letters 
     * @param incorrectLetter Incorrect Count of letters
     * @throws Exception if param are negatives
     * @return Score get 
     */
    public int calculateScore(int correctLetter, int incorrectLetter) throws HangManException;
}