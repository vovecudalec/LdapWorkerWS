package ru.crocket.ws.ldapworker;

import com.unboundid.ldap.sdk.Attribute;

public abstract class LdapEntityClass implements LdapEntity {

    protected String cn;
    protected String dn;

    @Override
    public abstract Attribute[] getAttributes();

}
