package userRegistration.MoodAnalyserTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyserTest {
	
	@Test
	//TestCase 1
	//testing method to return sad message
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad Mood");
		String message;
		try {
			message = moodAnalyser.analyseMood();
			assertEquals("SAD", message);
		} catch (CustomException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	//TestCase 2
	//testing method to return happy message
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a Happy Mood");
		String message;
		try {
			message = moodAnalyser.analyseMood();
			assertEquals("HAPPY",message);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	 @Test
		public void givenNullMoodShouldHandleException()  {
			MoodAnalyser moodAnalyser = new MoodAnalyser(null);
			try {
				moodAnalyser.analyseMood();
				
			} catch (CustomException e) {
				assertEquals("Please enter sad or happy", e.getMessage());
			}
		}
	    
	    /**
	     * @method to handle exception when empty message is passed
	     */
	    @Test
		public void givenEmptyMoodShouldHandleException()  {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			try {
				moodAnalyser.analyseMood();
				
			} catch (CustomException e) {
				assertEquals("Please enter non empty message", e.getMessage());
			}
		}
	

}
