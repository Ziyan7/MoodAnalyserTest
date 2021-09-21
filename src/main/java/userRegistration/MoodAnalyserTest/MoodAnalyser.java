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
		this.message="";
	}
	
	public String analyseMood() throws CustomException{
		
	try {
		if (message.length() ==0)
            throw new CustomException(CustomException.ExceptionType.ENTERED_EMPTY, "Please enter non empty message");
		else if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
		}
	catch(NullPointerException ex) {
		throw new CustomException(CustomException.ExceptionType.ENTERED_NULL, "Please enter sad or happy");
	}
	}
	
	
}
