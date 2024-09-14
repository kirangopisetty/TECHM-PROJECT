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

WebUI.navigateToUrl('https://mindmajix.com/')

WebUI.click(findTestObject('MINDMAJIX_OR/CORPORATE-TRAINING'))

WebUI.click(findTestObject('MINDMAJIX_OR/INSTRUCTOR'))

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.switchToWindowIndex(2)

WebUI.delay(2)

WebUI.switchToWindowTitle('MindMajix - Up-skilling Digital Learning Platform for Your Career Success')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.switchToWindowTitle('Become an Instructor - Mindmajix')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.switchToWindowTitle('Corporate Training Programs | Online Courses - MindMajix')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.switchToWindowUrl('https://mindmajix.com/')

WebUI.delay(2)

WebUI.switchToWindowUrl('https://mindmajix.com/instructor')

WebUI.delay(2)

WebUI.switchToWindowUrl('https://mindmajix.com/corporate-training')

WebUI.delay(2)

WebUI.closeWindowIndex(0)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeWindowTitle('Corporate Training Programs | Online Courses - MindMajix')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeWindowUrl('https://mindmajix.com/instructor')

