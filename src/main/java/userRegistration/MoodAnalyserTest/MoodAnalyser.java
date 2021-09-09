package userRegistration.MoodAnalyserTest;

/*
 * @param contains the message 
 * based on the condition happy or sad is returned
 */
public class MoodAnalyser {
	

	public String analyseMood(String message) {
	
			if(message.contains("Sad"))
				return "SAD";
			else 
				return "Happy";
		}
	
}
