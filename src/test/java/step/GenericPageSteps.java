package step;

import net.thucydides.core.annotations.Step;
import pages.GenericPage;
import pages.Header;
import pages.HomePage;

public class GenericPageSteps {

    GenericPage genericPage;
    Header header;
    HomePage homePage;

    @Step
    public void waitForPageToLoad() {
        genericPage.waitForPageToLoad();
    }

    @Step
    public void checkTextIsPresentInPage(String text) {
        genericPage.checkTextIsPresentInPage(text);
    }

    @Step
    public void checkTextIsNotPresentInPage(String text) {
        genericPage.checkTextIsNotPresentInPage(text);
    }

    @Step
    public void elementWithIdShouldBePresent(String id) {
        genericPage.elementWithIdShouldBePresent(id);
    }

    @Step
    public void clearSession() {
        genericPage.clearSession();
    }

    @Step
    public void navigateAwayFromVtmAndGoBack() {
        genericPage.navigateAwayFromVtmAndGoBack();
    }

    @Step
    public void refreshPage() {
        genericPage.refreshPage();
    }

    @Step
    public void clearSessionStorage() {
        genericPage.clearSessionStorage();
    }

    @Step
    public void checkTextIsPresentInHyperlink(String text) {
        genericPage.checkTextIsPresentInHyperlink(text);
    }

    @Step
    public void checkTextIsPresentInHyperlinkInElement(String text, String locator) {
        genericPage.checkTextIsPresentInHyperlinkInElement(text, locator);
    }

    @Step
    public void goBackToSearchPage() {
        header.goBackToHomePage();
        homePage.goToSearchTechRecordPage();
    }

    @Step
    public void goBackToCreatePage() {
        header.goBackToHomePage();
        homePage.goToCreateTechRecordPage();
    }

    @Step
    public void checkTextIsPresentInButton(String text) {
        genericPage.checkTextIsPresentInButton(text);
    }

    @Step
    public void clickButton(String text) {
        genericPage.clickButton(text);
    }

    @Step
    public void clickLink(String text) {
        genericPage.clickLink(text);
    }

    @Step
    public void clickLinkInElement(String text, String locator) {
        genericPage.clickLinkInElement(text, locator);
    }

    @Step
    public void headerErrorContains(String text) {
        genericPage.headerErrorContains(text);
    }

    @Step
    public void headerErrorNotContains(String text) {
        genericPage.headerErrorNotContains(text);
    }

    @Step
    public void goBackToPreviousPage() {
        genericPage.goBackToPreviousPage();
    }

    @Step
    public void checkPageUrl(String url) {
        genericPage.checkPageUrl(url);
    }

    @Step
    public void checkSignOutScreenNotPresent() {
        genericPage.checkSignOutScreenNotPresent();
    }

    @Step
    public void setValueForField(String field, String value) {
        genericPage.setValueForField(field, value);
    }

    @Step
    public void checkValueForField(String field, String value) {
        genericPage.checkValueForField(field, value);
    }

    @Step
    public void checkFieldEditable(String field) {
        genericPage.checkFieldEditable(field);
    }
}
