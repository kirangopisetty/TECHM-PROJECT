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

WebUI.navigateToUrl('https://mindmajix.com/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 7300)

WebUI.setText(findTestObject('MINDMAJIX_OR/NAME'), 'John Abrahim')

WebUI.setText(findTestObject('MINDMAJIX_OR/COURSE'), 'Java')

WebUI.setText(findTestObject('MINDMAJIX_OR/EMAIL2'), 'john@outlook.com')

WebUI.setText(findTestObject('MINDMAJIX_OR/PHONE'), '9849012345')

WebUI.setText(findTestObject('MINDMAJIX_OR/MESSAGE'), 'Interested to learn Java course')

WebUI.switchToFrame(findTestObject('MINDMAJIX_OR/IFRAME-CAPTCHA'), 5)

WebUI.check(findTestObject('MINDMAJIX_OR/CAPTCHA'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('MINDMAJIX_OR/SUBMIT'))

WebUI.verifyTextPresent('Thanks for choosing us', false)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

