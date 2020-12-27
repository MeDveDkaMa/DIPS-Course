//package started;
//
//import com.google.common.net.HostAndPort;
//import com.orbitz.consul.AgentClient;
//import com.orbitz.consul.Consul;
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
//public class Lab1Lifecycle3 {
//
//    void onStart(@Observes StartupEvent ev) throws SocketException, UnknownHostException {
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
//
//        Registration service = ImmutableRegistration.builder()
//                .id(serviceId)
//                .name("myService23")
//                .port(8080)
//                .address(ip)
//                .check(Registration.RegCheck.ttl(3L)) // registers with a TTL of 3 seconds
//                .tags(Collections.singletonList("tag2"))
//                .meta(Collections.singletonMap("version", "1.0"))
//                .build();
//        agentClient.register(service);
//    }
//
//
//}
