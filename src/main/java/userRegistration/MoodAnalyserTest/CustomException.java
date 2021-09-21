package userRegistration.MoodAnalyserTest;

public class CustomException extends Exception{
public ExceptionType type;
	
	public enum ExceptionType {
        ENTERED_NULL,
        ENTERED_EMPTY
    }
	
		public CustomException(ExceptionType type, String message) {
			super(message);
			this.type=type;
		}
}
	

