package ru.crocket.ws.ldapworker;

/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 11.11.13
 * Time: 22:46
 * To change this template use File | Settings | File Templates.
 */
public abstract class LdapInstance {
    protected String cn;
    protected String dn;
    public abstract boolean save();
    public abstract boolean create();
}
