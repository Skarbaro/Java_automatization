import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClass {
    public String getInfo(){
        return "This text of class!.";
    }
}

public class NewServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1> HELLO, " + name + " " + surname + " </h1>");
        pw.println("</html>");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
        dispatcher.forward(request, response);
    }
}

class Bicycle {

  // state or field
  private int gear = 9;

  // behavior or method
  public void braking() {
    logger.log("Working of Braking");
  }
}

public class TestASClient {
	public static void main(String[] args) throws InterruptedException {	
		try(Socket socket = new Socket("localhost", 3345);	
				BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
				DataInputStream ois = new DataInputStream(socket.getInputStream());	)
		{
			System.out.println("Client connected to socket.");
			logger.log();
			logger.log("Client writing channel = oos & reading channel = ois initialized.");	
				while(!socket.isOutputShutdown()){					
					if(br.ready()){					
			logger.log("Client start writing in channel...");
			Thread.sleep(100);
			String clientCommand = br.readLine();			
			oos.writeUTF(clientCommand);
			oos.flush();
			logger.log("Clien sent message " + clientCommand + " to server.");
			Thread.sleep(100);		
			if(clientCommand.equalsIgnoreCase("quit")){			
				logger.log("Client kill connections");
				Thread.sleep(2000);				
				if(ois.available()!=0)		{	
					logger.log("reading...");
					String in = ois.readUTF();
					logger.log(in);
							}			
				break;				
			}		
			logger.log("Client wrote & start waiting for data from server...");			
			Thread.sleep(2000);		
			if(ois.available()!=0)		{									
			logger.log("reading...");
			String in = ois.readUTF();
			logger.log(in);
					}			
				}
			}

			logger.log("Closing connections & channels on clentSide - DONE.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}