package model;

public class Task {
      
	private boolean isCompleted;
	private String item;
	
	// Constructer
	public Task (String item , boolean isCompleted) 
	{
		this.isCompleted = isCompleted;
		this.item = item;
	}
	
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
}
