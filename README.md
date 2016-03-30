Java EE SecurityManager Sample
==============================

A sample application on how to use a Java SecurityManager in a Java EE application.

The important part is the [META-INF/permissions.xml](https://github.com/marschall/ee-security-manager-sample/blob/master/ee-security-manager-sample-ear/src/main/application/META-INF/permissions.xml) file.

If you want to run this application with [WildFly](http://wildfly.org) you first need to make sure you have the security manager subsystem enabled in your configuration file (eg. `standalone.xml`).

```xml
<extensions>
  <extension module="org.wildfly.extension.security.manager"/>
</extensions>

<subsystem xmlns="urn:jboss:domain:security-manager:1.0">
  <!-- ... -->
</subsystem>
```

Then you need to start WildFly with the `-secmgr` command line argument or set the `SECMGR=true` environment variable.

Look for the following line in the log output
```
[org.jboss.as] (MSC service thread 1-6) WFLYSRV0235: Security Manager is enabled
```

The application is then available under http://127.0.0.1:8080/security-manager

The application itself is portable and should run on any Java EE compliant application server.

Links
-----

 * [All About Security Managers](http://word-bits.flurg.com/presentations/security-manager/index.html)
