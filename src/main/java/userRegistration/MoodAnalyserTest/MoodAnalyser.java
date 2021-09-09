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
	public MoodAnalyser() {
		
	}
	
	public String analyseMood() {
		
	try {
			if(message.contains("Sad"))
				return "SAD";
			else if (message.contains("Happy"))
				return "Sad";
			else
				return "Happy";
		}
	catch(NullPointerException ex) {
		return "Happy";
	}
	
	}
	
	
}
