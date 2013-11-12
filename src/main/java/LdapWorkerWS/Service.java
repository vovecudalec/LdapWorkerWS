
package LdapWorkerWS;

import javax.jws.WebService;

@WebService(endpointInterface = "LdapWorkerWS.LdapWorker")
public class Service implements LdapWorker {

    @Override
    public String createUser(String login, String name, String givenName, String fullName) {


        return null;
    }

}

