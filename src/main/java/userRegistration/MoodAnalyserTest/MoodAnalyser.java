package userRegistration.MoodAnalyserTest;

/*
 * @param contains the message 
 * based on the condition happy or sad is returned
 */
public class MoodAnalyser {
	String message;
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood() {
	
			if(message.contains("Sad"))
				return "SAD";
			else 
				return "Happy";
		}
	
}
