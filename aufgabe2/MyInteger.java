package aufgabe2;

public class MyInteger {

		//erzeugen wir zwei Variabl mit schlüssel wort static und es soll konstant sein
		//die Integer zahlen sind diese
	
		public static float Max_value=2147483647;
		public static float Min_value=-2147483646;
		
		//private Objekt Variabl,der heißt value von Typ int.wie deklariere ich das?
		//das ist Objekt variabl ,bedeutet ohne static
		private int value;
		
	public MyInteger(int value)
	{
		this.value=value;
	}
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value=parseInt(s);
	}
		
		/* Eine statische Methode parseInt(String s), die den übergebenen String s als int-Zahl zurückgibt,
		 *  wenn s einer Zahl entspricht.
		Wenn nicht, wirft die Methode eine IllegalArgumentException*/
		static String removeLeadingzeros(String s) {
			while (s.charAt(0)=='0') {
				s=s.substring(1);
			}
			return s;
			
		}
		static boolean charIsDigit(char c) {
			return (c=='0' || c=='1' || c=='2' || c=='3'||
					c=='4' || c=='5' || c=='6' || c=='7' ||
					c=='8' || c=='9' );
		}
		static boolean inputIsNumber(String s) {
			for(int i=0; i<s.length() ; i++) {
				if(!charIsDigit(s.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		static int charToInt(char c) {
			
		int charAsciiValue=c;
		int intValue=charAsciiValue-48;
		return intValue;
		}
		public static int parseInt(String s) throws IllegalArgumentException {
			//string leer war ,, Null bedeutet leere Eingabe
			if( s.length()==0) throw new IllegalArgumentException("leere Eingabe");
			//boolean deklarieren
			//wir möchten wissen .ob es positive oder negative Zahl war
			boolean negativ=false;
			 if(s.charAt(0)=='+') {
				 s=s.substring(1);
			 }
			 else if( s.charAt(0)=='-') {
				 s=s.substring(1);
				 negativ=true;
			 }
			 //die wert von string,ob + ist oder- . null war oder nicht
			 if( s.length()==0) throw new IllegalArgumentException("Eingabe ist nur +/- -> keine Zahl");
		s=removeLeadingzeros(s);
		if(!inputIsNumber(s))throw new IllegalArgumentException("Eingabe ist keine Zahl"); 
		int zahl =0;
		int exponent=1;
		for(int i=s.length()-1; i>=0 ; i--) {
			zahl=zahl+charToInt(s.charAt(i))*exponent;
			exponent*=10;
		}
		if(negativ) return-zahl;
		else return zahl;
			
		}
		int intValue() {
			return this.value;
		}
		//gleich wollen wir als double haben
		double doubleValue() {
			return this.value;
		}
		static MyInteger valueOf(String s) throws IllegalArgumentException{
			return new MyInteger(s);
		}
		static MyInteger valueOf(int value) {
			return new MyInteger(value);
		}
		@Override
		public int hashCode() {
			
			return this.value;
		}
		@Override
		public String toString() {
			return "MyInteger [value=" + value + "]";
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyInteger other = (MyInteger) obj;
			if (value != other.value)
				return false;
			return true;
		}
		public String eqluas(MyInteger mi2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}


