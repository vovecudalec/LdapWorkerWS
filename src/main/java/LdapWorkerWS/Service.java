
package LdapWorkerWS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import ru.crocket.ws.ldapworker.ADSLdapConnection;
import ru.crocket.ws.ldapworker.LdapUser;

import javax.jws.WebService;

@WebService(endpointInterface = "LdapWorkerWS.LdapWorker")
public class Service implements LdapWorker {

//    public void setAdsLdapConnection(ADSLdapConnection adsLdapConnection) {
//        this.adsLdapConnection = adsLdapConnection;
//    }

    ADSLdapConnection adsLdapConnection;

    public String createUser(String login, String name, String givenName, String fullName) {

        ContextLoaderListener.getCurrentWebApplicationContext();
        ApplicationContext factory = new FileSystemXmlApplicationContext("D:\\repos\\LdapWorkerWS\\src\\main\\java\\ru\\crocket\\ws\\ldapworker\\beans.xml");


        adsLdapConnection = (ADSLdapConnection) factory.getBean("connector");
        LdapUser user = (LdapUser) factory.getBean("ldapuser");
//        LdapUser user = new LdapUser(login, name, givenName, fullName);

        adsLdapConnection.writeEntity(user);

        return null;
    }

}

