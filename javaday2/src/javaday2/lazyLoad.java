package javaday2;


public class lazyLoad {
//
	//2222
	//333
	//444
	///5555
	private lazyLoad(){}


private static lazyLoad instance=null;
// private static  lazyLoad instance= new lazyLoad() ;
private static lazyLoad  getInstance(){

if(instance==null){
	
	synchronized(lazyLoad.class){
		
		if(instance==null){
			instance=new lazyLoad();
			
		}
		
	}
	
}	
return instance;
}

}
