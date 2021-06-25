package src.java;

public class AddTwoNumbers {
	
	private final Thread rxThreadd;
    private final TCPConnectionListener eventListener;
    private final BufferedReader in;
	
	private int abr;
	
	const totallyNotAPrivateKey = // NOT OK
	`-----BEGIN RSA PRIVATE KEY-----
	MIICXQIBAAKBgQC/tzdtXKXcX6F3v3hR6+uYyZpIeXhhLflJkY2eILLQfAnwKlT5
	xIHW5QZcHQV9sCyZ8qSdPGif7PwgMbButMbByiZhCSugUFb6vjVqoktmslYF4LKH
	iDgvmlwuJW0TvynxBLzDCwrRP+gpRT8wuAortWAx/03POTw7Mzi2cIPNsQIDAQAB
	AoGAMHCrqY9CPTdQhgAz94cDpTwzJmLCvtMt7J/BR5X9eF4O6MbZZ652HAUMIVQX
	4hUUf+VmIHB2AwqO/ddwO9ijaz04BslOSy/iYevHGlH65q4587NSlFWjvILMIQCM
	GBjfzJIxlLHVhjc2cFnyAE5YWjF/OMnJN0OhP9pxmCP/iM0CQQDxmQndQLdnV7+6
	8SvBHE8bg1LE8/BzTt68U3aWwiBjrHMFgzr//7Za4VF7h4ilFgmbh0F3sYz+C8iO
	0JrBRPeLAkEAyyTwnv/pgqTS/wuxIHUxRBpbdk3YvILAthNrGQg5uzA7eSeFu7Mv
	GtEkXsaqCDbdehgarFfNN8PB6OMRIbsXMwJBAOjhH8UJ0L/osYO9XPO0GfznRS1c
	Bnbfm4vk1/bSAO6TF/xEVubU0i4f6q8sIecfqvskEVMS7lkjeptPMR0DIakCQE+7
	uQH/Wizf+r0GXshplyOu4LVHisk63N7aMlAJ7XbuUHmWLKRmiReSfR8CBNzig/2X
	FmkMsUyw9hwte5zsrQcCQQCrOkZvzUj9j1HKG+32EJ2E4kisJZmAgF9GI+z6oxpi
	Exped5tp8EWytCjRwKhOcc0068SgaqhKvyyUWpbx32VQ
	-----END RSA PRIVATE KEY-----`

   public TCPConnection(final TCPConnectionListener eventListener, Socket socket) throws IOException {
        this.eventListener = eventListener;
		this.socket = socket; 
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
        rxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eventListener.onConnectionReady(TCPConnection.this);
                    while (!rxThread.isInterrupted()) {
                        eventListener.onReceiveString(TCPConnection.this, in.readLine());
                    }
                } catch (IOException e) {
                    eventListener.onException(TCPConnection.this, e);
                } finally {
                    eventListener.onDisconnect(TCPConnection.this);
                }
            }
        });
        rxThread.start();
    }
	
	public static void main(String[] args) {
      int num1 = 5;
	  int num2 = 15;;
	  int dif;
	  
	  private int numlm num2m;
	  
      dif = num1 - num2;
      System.out.println("Sum of these numbers: " + dif);
   }  
	
}