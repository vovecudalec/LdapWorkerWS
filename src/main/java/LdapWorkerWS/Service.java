
package LdapWorkerWS;

import ru.crocket.ws.ldapworker.LdapOperations;
import ru.crocket.ws.ldapworker.LdapUser;

import javax.jws.WebService;

@WebService(endpointInterface = "LdapWorkerWS.LdapWorker")
public class Service implements LdapWorker {

    @Override
    public String createUser(String login, String name, String givenName, String fullName) {

        LdapUser user = new LdapUser(login, name, givenName, fullName);

        LdapOperations.writeInstance(user);

        return null;
    }

}

