package ru.crocket.ws.ldapworker;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 15.11.13
 * Time: 0:38
 * To change this template use File | Settings | File Templates.
 */
public class ADSLdapConnection {
    private static ADSLdapConnection instance;
    private static LDAPConnection connection;
    private String servername;
    private Integer port;
    private String user;
    private String password;

    private ADSLdapConnection() {
        try {
            connection = new LDAPConnection(servername, port, user, password);
        } catch (LDAPException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static LDAPConnection getInstance() {
        if (instance == null) {
            new ADSLdapConnection();
        }
        return instance;
    }

}
