import java.io.*;
import java.net.*;
 
public class echoServer {
    public static void main(String args[]) {
        // ソケットや入出力用のストリームの宣言
        ServerSocket echoServer = null;
        String line;
        BufferedReader is;
        PrintStream os;
        Socket clientSocket = null;
 
        // ポート9999番を開く
        try {
            echoServer = new ServerSocket(9999);
        }
        catch (IOException e) {
            System.out.println(e);
        }
 
        // クライアントからの要求を受けるソケットを開く 
        try {
            clientSocket = echoServer.accept();
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            os = new PrintStream(clientSocket.getOutputStream());
 
            // クライアントからのメッセージを待ち、受け取ったメッセージをそのまま返す
                os.println("34.82579"); 
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

