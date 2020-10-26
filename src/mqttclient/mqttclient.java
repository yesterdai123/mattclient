package mqttclient;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class mqttclient {
	public static void main(String args[]) {
		
		GUI mygui=new GUI();
		mygui.init();
		System.out.println(2.0+"2");
	}

}
class MyClient{
	
	private static MqttClient mqttClient;
	
	public static void Connect() {
		try {
			mqttClient=new MqttClient("tcp://183.230.40.39:6002", "629703524",new MemoryPersistence());
			MqttConnectOptions MyOption=new MqttConnectOptions();
			MyOption.setCleanSession(true);
			MyOption.setKeepAliveInterval(10);
			MyOption.setConnectionTimeout(20);
			MyOption.setUserName("372148");
			MyOption.setPassword("12345678".toCharArray());
			mqttClient.connect(MyOption);
		}catch(Exception e) {
			System.out.println("Error Message:"+e.getMessage());
		}
	}
	public static void disconnect() {
		try {
			mqttClient.disconnect();
		}catch(Exception e) {
			System.out.println("Error Message:"+e.getMessage());
		}
	}
}
