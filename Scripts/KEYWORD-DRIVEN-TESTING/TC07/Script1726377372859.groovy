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

WebUI.setText(findTestObject('REGISTRATION-OR/NAME'), 'Tech Mahindra')

WebUI.setText(findTestObject('REGISTRATION-OR/ADDRESS'), 'Pune')

WebUI.click(findTestObject('REGISTRATION-OR/GENDER-FEMALE'))

WebUI.scrollToElement(findTestObject('REGISTRATION-OR/SUBMIT'), 5)

WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-READING'))

WebUI.selectOptionByValue(findTestObject('REGISTRATION-OR/CITY-DROPDOWN'), 'Delhi', false)

WebUI.setText(findTestObject('REGISTRATION-OR/DOB'), '18-09-2024')

WebUI.click(findTestObject('REGISTRATION-OR/SUBMIT'))

errorMsg = WebUI.verifyTextPresent('Country is required', false)

if (errorMsg==true) {
	println("When country is not selected, the error message is received correctly & hence TC=PASSED")
	WebUI.closeBrowser()
}
else {
	println("When country is not selected, the error message is not received correctly & hence TC=FAILED")
}

