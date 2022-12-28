package ch.adesso.demo.webtests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:local.properties"
})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://adesso.ch")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("104.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remoteDriverUrl")
    @DefaultValue("")
    String remoteDriverUrl();

    /*@Key("browserMobileView")
    @DefaultValue("")
    String browserMobileView();
    */

    @Key("videoStorage")
    @DefaultValue("")
    String videoStorage();

    @Key("holdBrowserOpen")
    @DefaultValue("false")
    String holdBrowserOpen();

    @Key("timeout")
    @DefaultValue("4000")
    String timeout();
}
