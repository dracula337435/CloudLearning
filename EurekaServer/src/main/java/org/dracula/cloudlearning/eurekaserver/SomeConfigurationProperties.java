package org.dracula.cloudlearning.eurekaserver;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dk
 */
@ConfigurationProperties("some-prefix")
public class SomeConfigurationProperties {

    private String ip;

    private String user;

    private String pswd;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
