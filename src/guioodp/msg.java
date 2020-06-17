package guioodp;

public abstract class msg {
	public String ms(){
		return "";
	}
}

class msg1 extends msg{
	public String ms(){
		return "Object has cleaned";
	}
}

class check extends msg{
	public String ms(){
		return "Please re-enter password";
	}
	
}