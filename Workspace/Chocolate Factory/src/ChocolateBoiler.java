public	class	ChocolateBoiler	{
	

private static	boolean empty;
private	static boolean boiled;

public	ChocolateBoiler()	{

	empty	=	true;
	boiled	=	false;
}



public static void	fill()	{

	if (empty = true){
		System.out.println("The boiler is empty and starting to fill");
		empty = false;
	}
	else {
		System.out.println("The boiler is Full!! Please drain befor filling");
		}
		
}


//	To	drain	the	boiler,	it	must	be	full	(none	empty)	and	also	boiled.	Once	it	is	drained	we	set
//	empty	flag	back	to	true
public	static void	drain()	{
	if (boiled == true && empty == false){
		System.out.println("The chocolate is ready, Now draining");
		boiled = false;
		empty = true;		
	}
	else if(boiled == false){
		System.out.println("The mixture has not bee boiled yet");
		}
	else if(empty == true){
		System.out.println("The boiler is already empty.");
		}
				
		
}




public static	void	boil()	{
	
	if (empty ==false && boiled == false){
		System.out.println("Now boiling");	
		boiled = true;
		empty = false;
	}
	else if( empty = true){
		System.out.println("The boiler is empty!");
	}
	else if(boiled = true){
		System.out.println("The mixture has alredy been boiled");
	}
}




public boolean isEmpty()	{
return	empty;
}


public	boolean isBoiled()	{
return	boiled;
}

}