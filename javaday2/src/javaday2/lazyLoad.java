package javaday2;

public class lazyLoad {
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
