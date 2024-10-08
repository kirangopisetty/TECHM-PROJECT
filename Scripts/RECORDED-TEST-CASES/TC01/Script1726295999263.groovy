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

'This keyword opens an empty browser when the URL is not specified'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.techmahindra.com/')

WebUI.click(findTestObject('Object Repository/Page_Tech Mahindra  Scale at Speed/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Page_Tech Mahindra  Scale at Speed/a_About Us'))

WebUI.click(findTestObject('Object Repository/Page_About Us Tech Mahindra Overview/a_Capabilities'))

WebUI.click(findTestObject('Object Repository/Page_What We Do Our Services and Capabiliti_62e4f6/a_Industries'))

WebUI.click(findTestObject('Object Repository/Page_Who We Serve Industries  Tech Mahindra/a_Insights'))

WebUI.click(findTestObject('Object Repository/Page_Resources and Insights  Tech Mahindra/a_Careers'))

WebUI.click(findTestObject('Object Repository/Page_Tech Mahindra People and Careers/a_Contact Us'))

'This keyword will close the browser opened by Katalon Studio for test execution'
WebUI.closeBrowser()

