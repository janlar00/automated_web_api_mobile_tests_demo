package ch.demo.mobile.tests;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.AppiumBy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiTests extends BaseTest{

    @Test
    @Tag("Mobile")
    void checkOpenedArticleIsCorrect(){

        /*step("Continue", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });*/

        step("Type search article", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Migros Bank");
        });

        step("Check content", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));

        /*step("Choose page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
            Selenide.back();
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
        });

        step("Verify opened page", () ->
            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Migros Bank")));*/
    }

    @Disabled
    @Test
    void firstMigrosBankAppTest(){

        /*step("Continue", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });*/

        step("Install app", () -> {
            $(AppiumBy.id("cm.aptoide.pt:id/positive_button")).click();
            $(AppiumBy.id("android:id/button1")).click();
            $(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
            Thread.sleep(5000);
            /*$(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Migros Bank");*/
        });

        /*step("Check content", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));*/

        /*step("Choose page", () -> {
            //$(AppiumBy.id("cm.aptoide.pt:id/positive_button")).click();
            //Selenide.back();
            //$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
        });*/

        /*step("Verify opened page", () ->
            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Migros Bank")));*/
    }

}
