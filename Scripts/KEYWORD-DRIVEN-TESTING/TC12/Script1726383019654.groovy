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

WebUI.openBrowser('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')

WebUI.maximizeWindow()

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE1'), findTestObject('DRAG-DROP-OR/DESTINATION1'))

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE2'), findTestObject('DRAG-DROP-OR/DESTINATION2'))

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE3'), findTestObject('DRAG-DROP-OR/DESTINATION3'))

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE4'), findTestObject('DRAG-DROP-OR/DESTINATION4'))

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE5'), findTestObject('DRAG-DROP-OR/DESTINATION5'))

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE6'), findTestObject('DRAG-DROP-OR/DESTINATION6'))

WebUI.dragAndDropToObject(findTestObject('DRAG-DROP-OR/SOURCE7'), findTestObject('DRAG-DROP-OR/DESTINATION7'))

WebUI.takeScreenshot()

