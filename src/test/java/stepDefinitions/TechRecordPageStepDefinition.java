package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import step.TechRecordPageSteps;

import java.util.List;
import java.util.Map;

public class TechRecordPageStepDefinition {

    @Steps
    TechRecordPageSteps techRecordPageSteps;

    @Then("^hgv tech record fields should have values$")
    public void hgvTechRecordFieldShouldHaveValue(DataTable dt) throws ComparisonFailure {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for (Map<String, String> stringStringMap : list) {
            try {
                Assert.assertEquals(stringStringMap.get("Value"), techRecordPageSteps.getValueForTechRecordField(stringStringMap.get("Field")));
            } catch (ComparisonFailure e) {
                throw new ComparisonFailure("Value for field " + stringStringMap.get("Field") + " is not the expected one", stringStringMap.get("Value"), techRecordPageSteps.getValueForTechRecordField(stringStringMap.get("Field")));
            }
        }
    }

    @Then("^trl tech record fields should have values$")
    public void trlTechRecordFieldShouldHaveValue(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            try {
                Assert.assertEquals(techRecordPageSteps.getValueForTechRecordField(list.get(i).get("Field")), list.get(i).get("Value"));
            }
            catch (ComparisonFailure e) {
                throw new ComparisonFailure("Expected value for field " + list.get(i).get("Field") + " was not found", list.get(i).get("Value"), techRecordPageSteps.getValueForTechRecordField(list.get(i).get("Field")));
            }
        }
    }

    @Then("^I open all sections$")
    public void iOpenAllSections() {
        techRecordPageSteps.openAllSections();
    }

    @Then("^I close all sections$")
    public void iCloAllSections() {
        techRecordPageSteps.closeAllSections();
    }

    @When("^I open \"([^\"]*)\" section$")
    public void iOpenSection(String arg0) throws Throwable {
        techRecordPageSteps.openSection(arg0);
    }

    @When("^I close \"([^\"]*)\" section$")
    public void iCloseSection(String arg0) throws Throwable {
        techRecordPageSteps.closeSection(arg0);
    }

    @When("^I click the change technical record button$")
    public void iClickChangeTechnicalRecordButton() {
        techRecordPageSteps.editTechRecordDetails();
    }

    @When("^I click the save technical record button$")
    public void iClickSaveTechnicalRecordButton() {
        techRecordPageSteps.saveTechRecordDetails();
    }

    @When("^I select \"([^\"]*)\" dangerous good$")
    public void iSelectDangerousGood(String arg0) throws Throwable {
        techRecordPageSteps.selectDangerousGoodCheckbox(arg0);
    }

    @When("^I deselect \"([^\"]*)\" dangerous good$")
    public void iDeselectDangerousGood(String arg0) throws Throwable {
        techRecordPageSteps.deselectDangerousGoodCheckbox(arg0);
    }

    @When("^I select \"([^\"]*)\" from tank statement$")
    public void iSelectFromTankStatement(String arg0) {
        techRecordPageSteps.iSelectFromTankStatement(arg0);
    }

    @Then("^I should see \"([^\"]*)\" statement field$")
    public void iShouldSeeStatementField(String arg0) {
        techRecordPageSteps.iShouldSeeStatementField(arg0);
    }

    @Then("^I should not see statement fields$")
    public void iShouldNotSeeStatementFields() {
        techRecordPageSteps.iShouldNotSeeStatementFields();
    }

    @Then("^I should see \"([^\"]*)\" product list field$")
    public void iShouldSeeProductListField(String arg0) {
        techRecordPageSteps.iShouldSeeProductListField(arg0);
    }

    @Then("^I should not see product list fields$")
    public void iShouldNotSeeProductListFields() {
        techRecordPageSteps.iShouldNotSeeProductListFields();
    }

    @When("^I select \"([^\"]*)\" vehicle type$")
    public void iSelectVehicleType(String arg0) {
        techRecordPageSteps.iSelectVehicleType(arg0);
    }

    @When("^I select \"([^\"]*)\" from battery list applicable$")
    public void iSelectFromBatteryListApplicable(String arg0) {
        techRecordPageSteps.iSelectFromBatteryListApplicable(arg0);
    }

    @Then("^I should see \"([^\"]*)\" battery list field$")
    public void iShouldSeeBatteryListField(String arg0) {
        techRecordPageSteps.iShouldSeeBatteryListField(arg0);
    }

    @Then("^I should not see battery list fields$")
    public void iShouldNotSeeBatteryListFields() {
        techRecordPageSteps.iShouldNotSeeBatteryListFields();
    }

    @When("^I select \"([^\"]*)\" checkbox$")
    public void iSelectCheckbox(String arg0) {
        techRecordPageSteps.iSelectCheckbox(arg0);
    }

    @When("^I deselect \"([^\"]*)\" checkbox$")
    public void iDeselectCheckbox(String arg0) {
        techRecordPageSteps.iDeselectCheckbox(arg0);
    }

    @Then("^I should see \"([^\"]*)\" manufacturer brake declaration field$")
    public void iShouldSeeManufacturerBrakeDeclarationField(String arg0) {
        techRecordPageSteps.iShouldSeeManufacturerBrakeDeclarationField(arg0);
    }

    @Then("^I should not see \"([^\"]*)\" manufacturer brake declaration field$")
    public void iShouldNotSeeManufacturerBrakeDeclarationField(String arg0) {
        techRecordPageSteps.iShouldNotSeeManufacturerBrakeDeclarationField(arg0);
    }

    @Then("^I should see \"([^\"]*)\" brake endurance field$")
    public void iShouldSeeBrakeEnduranceField(String arg0) {
        techRecordPageSteps.iShouldSeeBrakeEndurance(arg0);
    }

    @Then("^I should not see \"([^\"]*)\" brake endurance field$")
    public void iShouldNotSeeBrakeEnduranceField(String arg0) {
        techRecordPageSteps.iShouldNotSeeBrakeEndurance(arg0);
    }

    @When("^I click \"([^\"]*)\" link$")
    public void iClickLink(String arg0) throws Throwable {
        techRecordPageSteps.iClickLink(arg0);
    }

    @When("^I select \"([^\"]*)\" custom dangerous good$")
    public void iSelectCustomDangerousGood(String arg0) {
        techRecordPageSteps.iSelectCustomDangerousGoodCheckbox(arg0);
    }

    @When("^I deselect \"([^\"]*)\" custom dangerous good$")
    public void iDeselectCustomDangerousGood(String arg0) {
        techRecordPageSteps.iDeselectCustomDangerousGoodCheckbox(arg0);
    }

    @When("^I input \"([^\"]*)\" custom dangerous good$")
    public void iInputCustomDangerousGood(String arg0) {
        techRecordPageSteps.iInputCustomDangerousGood(arg0);
    }

    @When("^I input \"([^\"]*)\" custom guidance note$")
    public void iInputCustomGuidanceNote(String arg0) {
        techRecordPageSteps.iInputCustomGuidanceNote(arg0);
    }

    @When("^I select \"([^\"]*)\" custom guidance note$")
    public void iSelectCustomGuidanceNote(String arg0) {
        techRecordPageSteps.iSelectCustomGuidanceNoteCheckbox(arg0);
    }

    @When("^I deselect \"([^\"]*)\" custom guidance note$")
    public void iDeselectCustomGuidanceNote(String arg0) {
        techRecordPageSteps.iDeselectCustomGuidanceNoteCheckbox(arg0);
    }

    @When("^I input \"([^\"]*)\" as new UN number$")
    public void iInputNewUnNumber(String arg0) {
        techRecordPageSteps.iInputNewUnNumber(arg0);
    }

    @When("^I input \"([^\"]*)\" for the \"([^\"]*)\" UN number$")
    public void iInputTheUnNumber(String unNumber, String ordinal) {
        techRecordPageSteps.iInputForTheUnNumber(unNumber, ordinal);
    }

    @And("^I should see the subsequent inspection fields$")
    public void iShouldSeeTheSubsequentInspectionFields() {
        techRecordPageSteps.iShouldSeeTheSubsequentInspectionFields();
    }

    @Then("^I should see \"([^\"]*)\" section heading$")
    public void iShouldSeeSectionHeading(String arg0) {
        techRecordPageSteps.iShouldSeeSectionHeading(arg0);
    }
}
