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

// Start the calculator app
Mobile.startApplication('D:\\coding\\sqa\\espresso\\App-Automation-on-Google-Calculator-with-Selenium-Appium\\src\\test\\resources\\Calculator.apk', true)

// Perform 3 + 2
Mobile.tap(findTestObject('digit_3'), 0)
Mobile.tap(findTestObject('plus_button'), 0)
Mobile.tap(findTestObject('digit_2'), 0)
Mobile.tap(findTestObject('equal_button'), 0)

// Get result text
String result = Mobile.getText(findTestObject('result_text_view'), 0)

// Validate result is 5
Mobile.verifyEqual(result, "5")

// Clear and close the app
Mobile.tap(findTestObject('all_clear_button'), 0)
Mobile.closeApplication()


