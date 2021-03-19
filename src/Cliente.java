import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String [] args){
	
		try {		
		Socket clientSocket = new Socket ("192.168.1.101", 3345);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        outToServer.writeBytes("el Mensaje que viaja por Internet YANLIMeNG \n"  + '\n');
		clientSocket.close();
		} catch (UnknownHostException e){
		e.printStackTrace();		
        }catch (IOException e){
	    e.printStackTrace();	
}	
}	
}
