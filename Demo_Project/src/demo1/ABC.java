package demo1;

public class ABC {
	
	 private static ABC obj;
	 
	 private ABC(){
		 
	 }
	 
	 public static ABC getInstance(){
		 if(obj == null){
			 synchronized(ABC.class){
				 if(obj == null)
					 obj = new ABC();
			 }
		 }
		 return obj;
		
	 }

}
