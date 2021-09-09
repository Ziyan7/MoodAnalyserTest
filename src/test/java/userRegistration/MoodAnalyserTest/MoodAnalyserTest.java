package userRegistration.MoodAnalyserTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	//testing method to return sad message
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = moodAnalyser.analyseMood("This is Sad Message");
		assertEquals("SAD", message);
	}
	@Test
	//testing method to return happy message
	public void givenMessage_WhenNotSAd_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message =moodAnalyser.analyseMood("This is Happy Message");
		assertEquals("Happy",message);
	}
}
