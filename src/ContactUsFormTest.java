import org.junit.Assert;
import org.junit.Test;

public class ContactUsFormTest {

    @Test
    public void ContactUsTestPos() throws InterruptedException {
        MethodsForContactUsFormTests positiveTest = new MethodsForContactUsFormTests();

        //page load
        positiveTest.webPageLoad();

        //select lithuanian language
        positiveTest.clickLtButton();
        positiveTest.setSleep(1000);

        //setting field values
        positiveTest.setTopicSelect(1);
        positiveTest.setMessageInput("This is test message for test automatization task.");
        positiveTest.setNameInput("Vardenis");
        positiveTest.setSurnameInput("Pavardenis");
        positiveTest.setPhonenrInput("+37067878784");
        positiveTest.setEmailInput("test@test.com");
        positiveTest.clickRadioButton();

        //clicking submit button
        positiveTest.clickSubmitButton();

        //assert
        Assert.assertNotNull(positiveTest.checkAciuKadKreipiatesPasMusTextArea());

        positiveTest.quitDriver();
    }

    @Test
    public void ContactUsTestNeg() throws InterruptedException
    {
        MethodsForContactUsFormTests positiveTest = new MethodsForContactUsFormTests();

        //load
        positiveTest.webPageLoad();

        //select lithuanian language
        positiveTest.clickLtButton();
        positiveTest.setSleep(1000);

        //setting field values
        positiveTest.setTopicSelect(1);
        positiveTest.setMessageInput("This is test message for test automatization task.");
        positiveTest.setNameInput("V");
        positiveTest.setSurnameInput("P");
        positiveTest.setPhonenrInput("+370678545454545645645645645645646456464654564645646464");
        positiveTest.setEmailInput("test");

        //clicking submit button
        positiveTest.clickSubmitButton();

        //assert
        Assert.assertFalse(positiveTest.setSubmitButtonIsClickable());

        positiveTest.quitDriver();
    }
}
