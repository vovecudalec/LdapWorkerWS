package ru.crocket.ws.ldapworker;

import com.unboundid.ldap.sdk.Attribute;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 15.11.13
 * Time: 0:44
 * To change this template use File | Settings | File Templates.
 */
public interface Connections {
    public void writeEntity(LdapEntityClass ldapEntity);
    public void readEntity();
}
