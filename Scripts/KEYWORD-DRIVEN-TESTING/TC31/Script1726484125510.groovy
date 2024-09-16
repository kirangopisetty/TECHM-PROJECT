import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://stqatools.com/demo/Register.php')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('REGISTRATION-OR/SUBMIT'), 5)

WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-READING'))

readingStatus = WebUI.verifyElementChecked(findTestObject('REGISTRATION-OR/HOBBIES-READING'), 2)

if (readingStatus == true) {
    WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'))

    travelStatus = WebUI.verifyElementChecked(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'), 2)
}

if (travelStatus == true) {
    WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-MUSIC'))

    musicStatus = WebUI.verifyElementChecked(findTestObject('REGISTRATION-OR/HOBBIES-MUSIC'), 2)
}

if (musicStatus == true) {
    WebUI.uncheck(findTestObject('REGISTRATION-OR/HOBBIES-READING'))
	readingStatus2 = WebUI.verifyElementNotChecked(findTestObject('REGISTRATION-OR/HOBBIES-READING'), 2)
}

if (readingStatus2==true) {

    WebUI.uncheck(findTestObject('REGISTRATION-OR/HOBBIES-MUSIC'))
	musicStatus2 = WebUI.verifyElementNotChecked(findTestObject('REGISTRATION-OR/HOBBIES-MUSIC'), 2)
}

if (musicStatus2==true) {
    WebUI.uncheck(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'))
	travelStatus2 = WebUI.verifyElementNotChecked(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'), 2)
}

if (travelStatus2==true) {
	println("All the checkboxes are properly selected and then deselected");
	WebUI.closeBrowser()
}