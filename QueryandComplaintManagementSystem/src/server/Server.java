package server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;



public class Server {
	private ServerSocket server;
	private Thread serverThread;
	private ServerStatus status;

	public Server() {
	}
	
	public void startServer() {		
				
        try {
        	status = ServerStatus.RUNNING;
        	
        	server = new ServerSocket(8081);
			server.setReuseAddress(true);
			System.out.println("Server is now running....");
			while (true) {
            	Socket client = server.accept();
	  
            	ClientHandler clientSock = new ClientHandler(client);
  
            	new Thread(clientSock).start();
            }
		} catch (SocketException e) {
			e.printStackTrace();
			try {
				stopServer();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				stopServer();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} 
        
	}
	
	public void stopServer() throws IOException {
    	if(this.server!=null) {
    		status = ServerStatus.STOPED;
    		this.server.close();
    	}
    }
	
	// ClientHandler class
    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;
        
        // Constructor
        public ClientHandler(Socket socket)
        {
            this.clientSocket = socket;
        }
  
        public void run()
        {
            ObjectOutputStream out = null;
            ObjectInputStream in = null;
            
            try {
                
                out = new ObjectOutputStream(this.clientSocket.getOutputStream());
                in = new ObjectInputStream(this.clientSocket.getInputStream());
                
                Login user = (Login) in.readObject();
                
                if(user.getUserType() == UserType.STUDENT) {
                	
                }else if(user.getUserType() == UserType.SUPERVISOR) {
                	
                }else if(user.getUserType() == UserType.ADVISOR) {
                	
                }
                
                System.out.println(user);
                
                out.writeObject("Successful");
                
                this.closeStreams(out, in);
            }
            catch (IOException e) {
            }catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (Exception e) {
			}
            
        }
        
        private void closeStreams(ObjectOutputStream out, ObjectInputStream in) throws IOException {
        	if(out != null && in!=null) {
        		out.close();
            	in.close();
        	}
        }
    }

	public Thread getServerThread() {
		return serverThread;
	}
	
	public ServerStatus getStatus() {
		return status;
	}
}
