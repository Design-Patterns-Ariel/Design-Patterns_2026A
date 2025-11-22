
package Week02.Exception;
public class PointException extends Exception{
	private static final long serialVersionUID = 1L;

	public PointException() {
		super("TWO POINT");
	}

	public PointException(String error) {
		super(error);
	}


	public void printError(){

	}
	public String getError(){

		return "Eroor point";
	}
}
