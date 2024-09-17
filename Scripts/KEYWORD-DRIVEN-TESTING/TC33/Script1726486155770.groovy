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

WebUI.enableSmartWait()

WebUI.setText(findTestObject('REGISTRATION-OR/NAME'), 'Tech Mahindra')

WebUI.setText(findTestObject('REGISTRATION-OR/ADDRESS'), 'Pune')

WebUI.clearText(findTestObject('REGISTRATION-OR/NAME'))

WebUI.clearText(findTestObject('REGISTRATION-OR/ADDRESS'))

addressHeight = WebUI.getElementHeight(findTestObject('REGISTRATION-OR/ADDRESS'))

heightStatus = WebUI.verifyEqual(addressHeight, 44)

if (heightStatus == true) {
    println('The height of address textbox is as per the requirements document & hence TC=PASSED')
} else {
    println('The height of address textbox is not as per the requirements document & hence TC=FAILED')
}

addressWidth = WebUI.getElementWidth(findTestObject('REGISTRATION-OR/ADDRESS'))

widthStatus = WebUI.verifyEqual(addressWidth, 500)

if (widthStatus==true) {
	println('The width of address textbox is as per the requirements document & hence TC=PASSED')
}
else {
	println('The width of address textbox is not as per the requirements document & hence TC=FAILED')
	
}

println('The height of address textbox is ' + addressHeight)

println('The width of address textbox is ' + addressWidth)

WebUI.disableSmartWait()

WebUI.closeBrowser()

