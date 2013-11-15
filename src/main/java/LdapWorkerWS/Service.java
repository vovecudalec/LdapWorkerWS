
package LdapWorkerWS;

import ru.crocket.ws.ldapworker.ADSLdapConnection;
import ru.crocket.ws.ldapworker.LdapUser;

import javax.jws.WebService;

@WebService(endpointInterface = "LdapWorkerWS.LdapWorker")
public class Service implements LdapWorker {

    public void setAdsLdapConnection(ADSLdapConnection adsLdapConnection) {
        this.adsLdapConnection = adsLdapConnection;
    }

    ADSLdapConnection adsLdapConnection;

    public String createUser(String login, String name, String givenName, String fullName) {



        LdapUser user = new LdapUser(login, name, givenName, fullName);

        adsLdapConnection.writeEntity(user);

        return null;
    }

}

