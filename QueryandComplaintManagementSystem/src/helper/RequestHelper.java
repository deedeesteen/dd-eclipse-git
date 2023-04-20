package helper;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class RequestHelper {
	
	public static Object sendRequest(Object obj) throws UnknownHostException, IOException, ClassNotFoundException {
		Socket soc = new Socket("localhost",8081);
		ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
		ObjectInputStream in = new ObjectInputStream(soc.getInputStream());
		
		out.writeObject(obj);
		return in.readObject();
	}
}
