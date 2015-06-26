package spring.test.aop;

public class MyLogging {

	public void beforeSaveData() {
		System.out.println("The Data is going to be saved");
	}

	public void afterSaveData() {
		System.out.println("The Data has been saved");
	}
	
	public void beforeGetData() {
		System.out.println("Ready to get the data");
	}
	
	public void afterGetData() {
		System.out.println("The data has been got");
	}

	public void afterReturningAdvice(Object returnValue) {
		System.out.println(String.format(
				"The return value is: %s ", returnValue.toString()));
	}

	public void throwingAdvice(NullPointerException ex) {
		System.out.println(String.format(
				"Throw exception is: %s", ex.getMessage()));
	}

}
