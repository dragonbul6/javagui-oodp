package guioodp;

public abstract class account {
	private String id;
	private int pw;
	private boolean checking;
	
	public boolean isChecking() {
		return checking;
	}

	public void setChecking(boolean checking) {
		this.checking = checking;
	}

	public account(String id, int pw) {
		
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public String checkacc(){
		
		return "";
	}
	
}

class student01 extends account{
	
	public student01(String id, int pw) {
		super(id, pw);
	}

	
	String id01 = "student01";
	int pw01 = 1111;
	
	public String checkacc(){
		String msg;
		
		if(super.getPw() != pw01){
			msg = "Please re-enter password : student01";
		}else{
			msg = "Welcome student01..";
			super.setChecking(true);
			
		}
		
		return msg;
	}
	
}

class student02 extends account{

	public student02(String id, int pw) {
		super(id, pw);
	}

	String id02 = "student02";
	int pw02 = 2222;
	
	public String checkacc(){
		String msg;
		
		if(super.getPw() != pw02){
			msg = "Please re-enter password : student02";
		}else{
			msg = "Welcome student02..";
			super.setChecking(true);
		}
		
		return msg;
	}	
}

class student03 extends account{

	public student03(String id, int pw) {
		super(id, pw);
	}

	String id03 = "student03";
	int pw03 = 3333;
	
	public String checkacc(){
		String msg;
		
		if(super.getPw() != pw03){
			msg = "Please re-enter password : student03";
		}else{
			msg = "Welcome student03..";
			super.setChecking(true);
		}
		
		return msg;
	}	
}