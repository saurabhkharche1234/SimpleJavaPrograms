//Program to get IP address of the system

package Special_Programs;
import java.net.InetAddress;
public class IP_Address {

	public static void main(String[] args)throws Exception
	{
	InetAddress IP = InetAddress.getLocalHost();
	System.out.println("IP Address of this system is:"+ IP.getHostAddress());
	}

}
