package net.energy.exception;

/**
 * MongoDB语句和数据绑定会产生此异常
 * 
 * @author wuqh
 * 
 */
public class IllegalMongoShellException extends DataAccessException {
	private static final long serialVersionUID = 8178116413686990095L;

	public IllegalMongoShellException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalMongoShellException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalMongoShellException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalMongoShellException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
