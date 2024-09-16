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

WebUI.openBrowser('https://computer-database.gatling.io/computers')

WebUI.maximizeWindow()

WebUI.doubleClick(findTestObject('COMPUTERS_OR/ADD-COMPUTER'))

rightPage = WebUI.verifyTextPresent('Add a computer', false)

if (rightPage==true) {

WebUI.setText(findTestObject('COMPUTERS_OR/COMPUTER-NAME-TEXTBOX'), 'MahindraComputers')

WebUI.setMaskedText(findTestObject('COMPUTERS_OR/INTRODUCED-DATE'), '2024-07-01')

WebUI.setEncryptedText(findTestObject('COMPUTERS_OR/DISCONTINUED-DATE'), 'Tik1NH8xcK7NKuqtYlA7mQ==')

WebUI.selectOptionByIndex(findTestObject('COMPUTERS_OR/COMPANY_DROPDOWN'), 5)

WebUI.enhancedClick(findTestObject('COMPUTERS_OR/CREATE-COMPUTER-BUTTON'))

WebUI.verifyTextPresent('Done ! Computer', false)

WebUI.verifyTextPresent('has been created', false)

WebUI.deleteAllCookies();

WebUI.closeBrowser();
}

else {
	WebUI.closeBrowser();
}