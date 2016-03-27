-secmgr command line argument or SECMGR=true

    <extensions>
        <extension module="org.wildfly.extension.security.manager"/>
    </extensions>

        <subsystem xmlns="urn:jboss:domain:security-manager:1.0">
            <deployment-permissions>
                <maximum-set>
                    <permission class="java.security.AllPermission"/>
                </maximum-set>
            </deployment-permissions>
        </subsystem>
        
```
[org.jboss.as] (MSC service thread 1-6) WFLYSRV0235: Security Manager is enabled
```