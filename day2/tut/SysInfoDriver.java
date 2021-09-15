package day2.tut;

/*
 * Ex:-

1.Create a class for SysInfo (hostName , Ipaddres)
2. create 3 SysInfo instances for the class and initialize them
3. display the SysInfo instance details.
 */

class SysInfo{
	String hostName;
	String ipAddress;
}
public class SysInfoDriver {

	public static void main(String[] args) {
	
		SysInfo i1 = new SysInfo();
		i1.hostName= "Host01";
		i1.ipAddress = "120.1.3.4";
		
		SysInfo i2 = new SysInfo();
		i2.hostName= "Host02";
		i2.ipAddress = "162.1.3.0";
		
		SysInfo i3 = new SysInfo();
		i3.hostName= "Host03";
		i3.ipAddress = "192.168.3.8";
		
		SysInfo[] sysInfoList = new SysInfo[] {i1,i2,i3};
		for( SysInfo i : sysInfoList) {
			System.out.println("\nMy System Details\n===========");
			System.out.println("HostName : " + i.hostName);
			System.out.println("IpAdddress : " + i.ipAddress);
		}
	}

}
