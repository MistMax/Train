import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C://MyProject/ip.txt");
            int i;
            String resultIp = "";
            while ((i=fis.read())!=-1){ 
                if(i == 13) continue; 
                else if(i == 10){ 
                    String[] resultIpArray = resultIp.split(":"); 
                    String ip = resultIpArray[0]; 
                    int port = Integer.parseInt(resultIpArray[1]); 
                    checkProxy(ip, port); 
                    resultIp = "";
                }else if(i == 9){ 
                    resultIp += ":"; 
                }else{
                    resultIp += (char) i; 
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void checkProxy(String ip, int port){
        System.out.println("Пробуем подключиться через прокси - "+ip +":"+ port);
        try{
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            System.out.println("Получен ответ, наш ip: "+response);
            rd.close();
            FileOutputStream fos = new FileOutputStream("C://MyProject/workingIP.txt",true);
            byte[] buffer = (ip+":"+port+"\n").getBytes();
            fos.write(buffer);
            fos.close();
        }catch (IOException e){
            System.out.println("Нерабочий ip: "+ip+":"+port);
        }
    }
}
