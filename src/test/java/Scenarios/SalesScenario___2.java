package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenario___2 extends OpenPage {


    @DisplayName("Scenario 2")
    @Test
    void ScenarioTwo() {


                try {
                    Thread.sleep(2000);
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

        Elements.MixandMacthcurrentRecordName().sendKeys("PARSLEY 4 for £4.00");
        Elements.MixandMatchquantity().sendKeys("4");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£4.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("PARSLEY");
        ElementsJS.pointVegMenuPARSLEY();

        Elements.SAVEmm().click();

                try {
                    Thread.sleep(2000);
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


        Elements.create().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.MixandMacthcurrentRecordName().sendKeys("PARSLEY 5 for £5.00");
        Elements.MixandMatchquantity().sendKeys("5");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£5.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("PARSLEY");
        ElementsJS.pointVegMenuPARSLEY();

        Elements.SAVEmm().click();

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



        Elements.create().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.MixandMacthcurrentRecordName().sendKeys("PARSLEY 6 for £6.00");
        Elements.MixandMatchquantity().sendKeys("6");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£6.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("PARSLEY");
        ElementsJS.pointVegMenuPARSLEY();

        Elements.SAVEmm().click();

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


        Elements.create().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.MixandMacthcurrentRecordName().sendKeys("PARSLEY 7 for £7.00");
        Elements.MixandMatchquantity().sendKeys("7");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£7.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("PARSLEY");
        ElementsJS.pointVegMenuPARSLEY();

        Elements.SAVEmm().click();

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


        Elements.create().click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.MixandMacthcurrentRecordName().sendKeys("PARSLEY 8 for £9.00");
        Elements.MixandMatchquantity().sendKeys("8");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£9.00");
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


        ElementsJS.pointVegMenu();
        ElementsJS.pointVEGMenuP();

        ElementsJS.pointVegMenuPARSLEY();
        ElementsJS.pointVegMenuPARSLEY();
        ElementsJS.pointVegMenuPARSLEY();

        assertEquals("3", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£3.60", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.fiveScreen().click();
        Elements.xScreen().click();

        ElementsJS.pointVegMenuPARSLEY();


        assertEquals("8", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.60", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£9.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.cScreen().click();

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cash5Screen().click();

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cash2Screen().click();

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cash2Screen().click();

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        Elements.cScreen().click();



    }
}
