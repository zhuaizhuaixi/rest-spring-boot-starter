package com.zzx.restspringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zzx
 * @date 2019-05-21
 */
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    private String prefix = "a";
    private String suffix;
    private String enabled;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}