package predifinedClasses.StringClass;

public class StringBuffer1 {

	public static void main(String[] args) {
		/**
		 * Mutable
		 * Thread safe
		 * Object created only using new keyword
		 */
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Original StringBuffer value:"+sb);
		sb.append("Java");
		System.out.println(sb);
		sb.insert(5,"Pune");
		System.out.println(sb);
		
		sb.replace(1,3,"XXX");
		System.out.println(sb);
		
		sb.delete(1,4);
		System.out.println(sb);
		
		StringBuffer s1 = new StringBuffer("Banglore is known for IT ");
		s1.reverse();
		System.out.println(s1);
		System.out.println("****************************************");
		
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());
		
		s2.append("Hello");
		
		System.out.println("First word:"+s2);
		
		System.out.println(s2.capacity());
		
		s2.append("Java is my favorite langauge");
		
		System.out.println("2nd word:");
		
		System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		s2.append("I am from automation area");  
		
		System.out.println("3rd Word: "+s2);
		
		System.out.println(s2.capacity());//now (34*2)+2=70 i.e (oldcapacity*2)+2
	}

}
