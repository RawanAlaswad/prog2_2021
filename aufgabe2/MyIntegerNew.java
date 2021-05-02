package aufgabe2;

public class MyIntegerNew {
	public static void main (String[]args) {
		MyInteger mi1=null, mi2=null;
try
{
        mi1= new MyInteger("5");
        System.out.println("mi1:" + mi1.intValue());
}
        catch (IllegalArgumentException e){
        	
            System.out.println("mi1:"+ e.getMessage());

        }

	try
	{
	         mi2= new MyInteger("5");
	        System.out.println("mi2:" + mi1.intValue());
	}
	        catch (IllegalArgumentException e){
	        	
	            System.out.println("mi2:"+ e.getMessage());

	        }
	System.out.println("mi1 eqluas mi2?:" +mi1.eqluas(mi2));
	System.out.println("mi1 doubleValue :" +mi1.doubleValue());
	System.out.println("mi1 hashCode :" +mi1.hashCode());


	}
}