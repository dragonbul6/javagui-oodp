package guioodp;

public class accountadmin {
	private String name;
	private String status;
	private int cost;
	
	
	public accountadmin(String name, String status, int cost) {
		
		this.name = name;
		this.status = status;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString(){ 
		return "Name : "+this.name+" |     Status : "+this.status+" |     Cost : "+this.cost+"\n";
	}
	
}
