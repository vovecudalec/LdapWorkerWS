package ru.crocket.ws.ldapworker;

import com.unboundid.ldap.sdk.Attribute;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPResult;
import com.unboundid.ldif.LDIFException;

import java.util.Collection;
import java.util.logging.Logger;


/**
 * Created with IntellijJ IDEA.
 * User: Администратор
 * Date: 09.11.13
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public class LdapOperations {

    private static LDAPConnection connection;
    private static Logger log;

//    public String readLdapUsers(String cnSubstring) {
//
//        try {
//            SearchControls constraints = new SearchControls();
//            constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
//            NamingEnumeration results;
//
//            results = context.search(Config.getProperty("ldap.dn"), "(cn=" + cnSubstring + ")", constraints);
//
//            while (results != null && results.hasMore()) {
//                SearchResult sr = (SearchResult) results.next();
//                Attributes attributes = sr.getAttributes();
//                System.out.println(sr.getName() + attributes.toString());
//            }
//        } catch (NamingException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "String";
//    }

    public static void writeInstance(LdapInstance instance){

        Attribute[] attributes = instance.getAttributes();

        try {
//            LDAPResult result = connection.add((String)Config.getProperty("ldap.server.address"), String.valueOf(attributes));
            LDAPResult ldapResult = connection.add(Config.getProperty("ldap.server.address"), attributes);
            log.info(ldapResult.getDiagnosticMessage());
        } catch (LDAPException e) {
            log.warning("error: " + e.getMessage());
        }
    }

//    private DirContext getDirContext(String ldapadress) {
//
//        try {
//            Hashtable env = new Hashtable();
//            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//            env.put(Context.PROVIDER_URL, "ldap://" + ldapadress);
//            DirContext ctx = new InitialDirContext(env);
//            return ctx;
//        } catch (NamingException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return null;
//    }

    private String getLdapUser() {
        return "";
    }

    private void openLdapConnection(){
        try {
            connection = new LDAPConnection("server.example.com", 389,
                    "uid=john.doe,ou=People,dc=example,dc=com", "password");
        } catch (LDAPException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
    private void closeLdapConnection() {

    }
}
