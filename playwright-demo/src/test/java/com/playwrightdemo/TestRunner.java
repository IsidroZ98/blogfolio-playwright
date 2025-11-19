package com.playwrightdemo;

import com.microsoft.playwright.*;
import com.microsoft.playwright.APIRequest.NewContextOptions;
import com.microsoft.playwright.options.AriaRole;

import java.util.Map;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
public class TestRunner {
    protected static Playwright playwright;
    protected static Browser browser;
    protected Page page;
    protected static APIRequestContext apiRequest;
    protected BrowserContext browserContext;


    @BeforeAll
    static void setupBeforeClass(){
        playwright = Playwright.create();

        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        
        /*browserContext = browser.newContext(new Browser.NewContextOptions()
        .setUserAgent("playwright-java-test")
        .setExtraHTTPHeaders(Map.of("ngrok-skip-browser-warning", "true")
        ));
        */
        //page = browser.newPage();
        //page = browserContext.newPage();
        
        apiRequest = playwright.request().newContext(new NewContextOptions().setBaseURL("https://rush-pvc-generate-derived.trycloudflare.com/"));
        
    }
    @BeforeEach
    void beforeEach(){
        browserContext = browser.newContext(new Browser.NewContextOptions()
        .setUserAgent("playwright-java-test")
        .setExtraHTTPHeaders(Map.of("ngrok-skip-browser-warning", "true")
        ));
        page = browserContext.newPage();

    }
    @AfterAll
    public static void tearDownAfterClass(){
        // check sequence
        //page.close();
        browser.close();
        apiRequest.dispose();
        playwright.close();
        //browserContext.close();
        
    }
    @AfterEach
    void afterEach(){
        browserContext.close();
    }
    protected void bypassNgrokWarning(){
        Locator visitBtn = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Visit Site"));

        if (visitBtn.isVisible()) {
            visitBtn.click();
            page.waitForLoadState();
        }
    }

}