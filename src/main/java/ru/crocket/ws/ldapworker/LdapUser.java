package ru.crocket.ws.ldapworker;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 11.11.13
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
public class LdapUser extends LdapInstance {

    private String sn;
    private String login;
    private String name;
    private String givenName;
    private String fullName;

    public LdapUser(String sn, String login, String name, String givenName, String fullName) {
        super.dn = Config.getProperty("ldap.dn");
        super.cn = login;
        this.sn = sn;
        this.login = login;
        this.name = name;
        this.givenName = givenName;
        this.fullName = fullName;
    }

    @Override
    public boolean save() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean create() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
