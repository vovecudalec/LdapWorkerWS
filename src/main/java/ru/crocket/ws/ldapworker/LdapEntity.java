package ru.crocket.ws.ldapworker;

import com.unboundid.ldap.sdk.Attribute;
import com.unboundid.ldap.sdk.LDAPConnection;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 11.11.13
 * Time: 22:46
 * To change this template use File | Settings | File Templates.
 */
public interface LdapEntity {
    public abstract Attribute[] getAttributes();
}
