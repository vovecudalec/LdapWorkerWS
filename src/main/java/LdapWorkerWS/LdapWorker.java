package LdapWorkerWS;

import javax.jws.WebService;

@WebService
public interface LdapWorker {
    String createUser(String text, String name, String givenName, String fullName);
}

