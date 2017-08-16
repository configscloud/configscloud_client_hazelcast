package configs.cloud.client.exceptions;

public class NotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public NotFoundException(){
		super();
	}
	
	public NotFoundException(String message){
		super(message);		
	}


}