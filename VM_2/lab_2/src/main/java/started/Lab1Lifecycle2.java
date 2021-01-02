//package started;
//
//import com.google.common.net.HostAndPort;
//import com.orbitz.consul.AgentClient;
//import com.orbitz.consul.Consul;
//import com.orbitz.consul.NotRegisteredException;
//import com.orbitz.consul.model.agent.ImmutableRegistration;
//import com.orbitz.consul.model.agent.Registration;
//import io.quarkus.runtime.StartupEvent;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.event.Observes;
//import java.net.DatagramSocket;
//import java.net.InetAddress;
//import java.net.SocketException;
//import java.net.UnknownHostException;
//import java.util.Collections;
//
//@ApplicationScoped
//public class Lab1Lifecycle2 {
//
//    void onStart(@Observes StartupEvent ev) throws SocketException, UnknownHostException, NotRegisteredException {
//
//        Consul consulClient = Consul.builder().withHostAndPort(HostAndPort.fromParts("192.168.122.19", 8500)).build();
//        AgentClient agentClient = consulClient.agentClient();
//
//        String serviceId = "1";
//        String ip;
//
//        try (final DatagramSocket socket = new DatagramSocket()) {
//            socket.connect(InetAddress.getByName("8.8.8.8"), 10003);
//            ip = socket.getLocalAddress().getHostAddress();
//        }
//
//        consulClient.healthClient().getHealthyServiceInstances(serviceId).getResponse();
//
//        Registration service = ImmutableRegistration.builder()
//                .id(serviceId)
//                .name("web")
//                .address(ip)
//                .port(8080)
//                .putMeta("version","1")
//                .build();
//        agentClient.register(service);
//    }
//
//
//}
