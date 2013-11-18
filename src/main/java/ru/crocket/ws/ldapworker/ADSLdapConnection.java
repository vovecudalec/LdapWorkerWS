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
public class ADSLdapConnection implements Connections{
//    private static LDAPConnection instance;
    private static LDAPConnection connection;


    public ADSLdapConnection(String servername, int port, String user, String password) {
        try {
            connection = new LDAPConnection(servername, port, user, password);
        } catch (LDAPException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Override
    public void readEntity() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeEntity(LdapEntityClass ldapEntity) {
        try {
            connection.add(ldapEntity.dn, ldapEntity.getAttributes());
        } catch (LDAPException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
