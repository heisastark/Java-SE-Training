package day3.tut;

public class StringEx {

	public static void main(String[] args) {

		
		String s="Welcome";
		 //       0123456
		
		System.out.println(s.indexOf("l"));
		s.length();
		String newStr= s.concat("hello");
		System.out.println(newStr); //s+"hello"
		s= s.replace("o", "u");
		
		System.out.println(s);
		String[] strArray="host01:192.168.1.2:log-02.log".split(":");
		System.out.println(strArray[0] +"\t" + strArray[1] +"\t" +  strArray[2]);
		/*
		 * interface=etho
		 * onboot=dhcp
		 * IpAddress=192.3.4.8
		 */
		System.out.println(s.substring(3));// 
		
		System.out.println(s.substring(3,5));
	}

}
