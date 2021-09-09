package userRegistration.MoodAnalyserTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
	//TestCase 1
	//testing method to return sad message
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String message = moodAnalyser.analyseMood();
		assertEquals("Happy", message);
	}
	@Test
	//TestCase 2
	//testing method to return happy message
	public void givenMessage_WhenHappy_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a Happy Mood");
		String message =moodAnalyser.analyseMood();
		assertEquals("Sad",message);
	}
}
