package day2.tut;

import java.util.Scanner;

/*
 * // Ex:  read shellName from user.
        "bash"====> profileName = "bashrc"
	"ksh" or "sh" ====> profileName= "shrc"
	"psh"===> profileName="winrc"
	default stmt===> profilename = /etc/profile

	display shellnamme and profilename to the console

(1) try with Switch case
(2) "    "  if..elseif...else
 */
public class SwitchIfElseEx {

	public static void main(String args[]) { // command line arg java f1 "10"," 20", "30", "40"
	
		Scanner in = new Scanner(System.in);
		
		String shellName = in.next();
		
		String profileName;
		
		switch(shellName) {
		
		case "bash":
			profileName ="bashrc";
			break;
			

		case "sh":
		case "ksh":
			profileName ="shrc";
			break;
			

		case "psh":
			profileName ="winrc";
			break;
			

		default :
			profileName ="/etc/profile";
		}
		
		System.out.println("Switch :" + shellName + "\t" + profileName);
		
		System.out.println("========================================");
		
		if(shellName.equals("bash"))
			profileName = "bashrc";
		else if(shellName.equals("ksh") || shellName.equals("sh"))
			profileName = " shrc";
		else if( shellName.equals("psh"))
			profileName = "winrc";
		else
			profileName = "/etc/profile";
		
		System.out.println("If ..Else if .. Else : "+ shellName + "\t" + profileName);
	}

}
