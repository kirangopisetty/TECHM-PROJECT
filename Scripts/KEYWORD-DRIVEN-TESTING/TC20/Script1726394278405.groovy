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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToMaskedUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('HEALTHCARE-OR/UN'), un)

WebUI.setText(findTestObject('HEALTHCARE-OR/PWD'), pwd)

WebUI.click(findTestObject('HEALTHCARE-OR/LOGIN BUTTON'))

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('HEALTHCARE-OR/FACILITY'), facility, false)

WebUI.check(findTestObject('HEALTHCARE-OR/HOSPITAL_ADMISSION'))

WebUI.click(findTestObject('HEALTHCARE-OR/MEDICAID'))

WebUI.setText(findTestObject('HEALTHCARE-OR/DATE'), date)

WebUI.setText(findTestObject('HEALTHCARE-OR/COMMENT'), comment)

WebUI.takeScreenshot()

WebUI.click(findTestObject('HEALTHCARE-OR/BOOK_APPT_BUTTON'))

WebUI.takeScreenshot()

apptStatus = WebUI.verifyTextPresent('Appointment Confirmation', false)

if (apptStatus == true) {
    WebUI.click(findTestObject('HEALTHCARE-OR/MENU'))
    WebUI.click(findTestObject('HEALTHCARE-OR/LOGOUT'))
	WebUI.closeBrowser()
} else {
    WebUI.closeBrowser()
}

