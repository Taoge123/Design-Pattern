public interface Flys{
	String fly();
}
/*
 * The interface is implemented by many other subclasses that allow for 
 * many types of flying without effecting Aniaml, or Flys
 * 
 * Classes that implement new Flys interface subclasses can allow other classes
 * to use that code eliminating code duplication 
 * 
 * It's decoupling : encapsulating the concept that varies 
 * 
 * */

class ItFlys implements Flys{
	
	public String fly() {
		
		return "Flying High";
		
	}
	
}


class CantFly implements Flys{
	
	public String fly() {
		
		return "I can't fly";
		
	}

}




