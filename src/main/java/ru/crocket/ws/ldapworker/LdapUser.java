package ru.crocket.ws.ldapworker;

import com.unboundid.ldap.sdk.Attribute;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 11.11.13
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
public class LdapUser extends LdapEntityClass {

    private String sn;
    private String login;
    private String name;
    private String givenName;
    private String fullName;

    public LdapUser(String login, String name, String givenName, String fullName) {
        super.dn = Config.getProperty("ldap.dn");
        super.cn = login;
        this.sn = login;
        this.login = login;
        this.name = name;
        this.givenName = givenName;
        this.fullName = fullName;
    }

    @Override
    public Attribute[] getAttributes(){
        Attribute[] attributes = {
                new Attribute("dn", dn),
                new Attribute("cn", cn),
                new Attribute("sn", sn),
                new Attribute("login", login),
                new Attribute("name", name),
                new Attribute("givenName", givenName),
                new Attribute("fullName", fullName)
        };
        return attributes;
    }
}
