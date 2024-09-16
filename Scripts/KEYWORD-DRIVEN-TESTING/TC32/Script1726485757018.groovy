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

isUSpresent = WebUI.verifyOptionPresentByLabel(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'United States of America', 
    false, 2)

if (isUSpresent==true) {
WebUI.selectOptionByLabel(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'United States of America', false)
}
countrySelection = WebUI.verifyOptionSelectedByLabel(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'United States of America', 
    false, 3)

if (countrySelection == true) {
    WebUI.selectOptionByValue(findTestObject('REGISTRATION-OR/CITY-DROPDOWN'), 'New York', false)
}

WebUI.selectOptionByLabel(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'United Kingdom', false)

countrySelection2 = WebUI.verifyOptionSelectedByLabel(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'United Kingdom', 
    false, 4)

if (countrySelection2 == true) {
    WebUI.selectOptionByValue(findTestObject('REGISTRATION-OR/CITY-DROPDOWN'), 'London', false)
}

