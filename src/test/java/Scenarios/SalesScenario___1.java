package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario___1 extends OpenPage {


    @DisplayName("Scenario 1")
    @Test

    void ScenarioOne() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the price of the product.");
        Elements.sevenPopUp().click();
        Elements.twoPopUp().click();
        assertEquals("72", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the price of the product is not closed.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cigaretteOrTobaccoNo().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the price of the product.");

        Elements.twoPopUp().click();
        Elements.ninePopUp().click();
        Elements.twoPopUp().click();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        assertEquals("292", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the price of the product is not closed.");


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("??0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("??3.64", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.suspend().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        Elements.homeMode().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.management().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.mixAndMatch().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.create().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.MixandMacthcurrentRecordName().sendKeys("PARSLEY 3 for ??3.00");
        Elements.MixandMatchquantity().sendKeys("3");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("??3.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("PARSLEY");
        ElementsJS.pointVegMenuPARSLEY();

        Elements.SAVEmm().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.homeModeBack().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



        Elements.resume().click();

                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.threePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("136", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        assertEquals("3", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("??0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("??4.84", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");



        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.threePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("136", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        assertEquals("4", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("??0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("??6.04", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");



        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.threePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("136", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        assertEquals("5", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("??0.60", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("??6.64", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not pop up.\n");
        Elements.StartcardtransactionYes().click();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not close.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cScreen().click();


        Elements.homeMode().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.management().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.mixAndMatch().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.MixandMacthfirst().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.DELETEmm().click();
        assertEquals("block", Elements.deleteAreYouSure().getCssValue("display"));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.deleteAreYouSureYES().click();
        assertEquals("none", Elements.deleteAreYouSure().getCssValue("display"));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.homeModeBack().click();


    }

}