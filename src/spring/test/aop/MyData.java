package spring.test.aop;

public class MyData {
	public String data;

	public void saveData(String data) {
		System.out.println("Saving the data: " + data);
		this.data = data;
	}

	public String getData() {
		System.out.println("Get the data: " + this.data);
		return this.data;
	}
	
	public void concatData(String data) {
		this.data.concat(data);
	}
}
