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

WebUI.setText(findTestObject('REGISTRATION-OR/NAME'), 'TECH MAHINDRA')

WebUI.clearText(findTestObject('REGISTRATION-OR/NAME'))

WebUI.setText(findTestObject('REGISTRATION-OR/NAME'), 'Tech Mahindra')

WebUI.focus(findTestObject('REGISTRATION-OR/ADDRESS'))

WebUI.setText(findTestObject('REGISTRATION-OR/ADDRESS'), 'Pune')

WebUI.click(findTestObject('REGISTRATION-OR/GENDER-FEMALE'))

WebUI.click(findTestObject('REGISTRATION-OR/GENDER-MALE'))

WebUI.click(findTestObject('REGISTRATION-OR/GENDER-FEMALE'))

WebUI.click(findTestObject('REGISTRATION-OR/GENDER-MALE'))

WebUI.scrollToElement(findTestObject('REGISTRATION-OR/SUBMIT'), 5)

WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-READING'))

WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'))

WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-MUSIC'))

WebUI.uncheck(findTestObject('REGISTRATION-OR/HOBBIES-READING'))

WebUI.uncheck(findTestObject('REGISTRATION-OR/HOBBIES-MUSIC'))

WebUI.uncheck(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'))

WebUI.check(findTestObject('REGISTRATION-OR/HOBBIES-TRAVEL'))

countryOptionsCount = WebUI.getNumberOfTotalOption(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'))

if (countryOptionsCount == 6) {
    println('The country drop-down list has exactly 6 values and hence TC=PASSED')

    WebUI.selectOptionByIndex(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 2)

    WebUI.selectOptionByLabel(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'Australia', false)

    WebUI.selectOptionByValue(findTestObject('REGISTRATION-OR/COUNTRY-DROPDOWN'), 'India', false)
} else {
    println('The country drop-down list doesn\'t have exactly 6 values and hence TC=FAILED')
}

verifyCityValues = WebUI.verifyOptionsPresent(findTestObject('REGISTRATION-OR/CITY-DROPDOWN'), ['Select a city', 'New York'
        , 'Los Angeles', 'Chicago', 'Toronto', 'London', 'Sydney', 'Melbourne', 'Mumbai', 'Delhi'])

if (verifyCityValues == true) {
    System.out.println('The city drop down values are valid & hence TC=PASSED')

    WebUI.selectOptionByValue(findTestObject('REGISTRATION-OR/CITY-DROPDOWN'), 'Delhi', false)
} else {
    System.out.println('The city drop down values are invalid & hence TC=FAILED')
}

WebUI.setText(findTestObject('REGISTRATION-OR/DOB'), '18-09-2024')

WebUI.click(findTestObject('REGISTRATION-OR/SUBMIT'))

WebUI.verifyTextPresent('User registration successful', false)

WebUI.closeBrowser()

