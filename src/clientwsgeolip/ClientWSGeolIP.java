package clientwsgeolip;

import java.io.*;
import javax.xml.parsers.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class ClientWSGeolIP {

    public static void main(String[] args) throws Exception{
        URL uri = new URL("http://www.webservicex.net/geoipservice.asmx/GetGeoIP?IPAddress=10.110.1.2");
        //HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
        //connection.setRequestMethod("GET");
        //InputStreamReader input = new InputStreamReader(connection.getInputStream());
        
        Scanner scan = new Scanner(uri.openStream());
        String source = new String();
        while(scan.hasNext()) source += scan.nextLine();
                    
        /*try(BufferedReader reader = new BufferedReader(input)){
            String line = reader.readLine();
            
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }*/
        
        Serializer serializer = new Persister();
        GeoIP geoip = new GeoIP();
        serializer.read(geoip, source);
        System.out.println("ReturnCode: " + geoip.getReturnCode());
    }
}
