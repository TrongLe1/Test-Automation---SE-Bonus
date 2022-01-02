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

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(findTestObject('Object Repository/Page_My Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Username_username'), 
    'voduy')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_New password_newpassword'), 
    'j1ZzzeKf8NiE21d5rsNRrQ==')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_First name_firstname'), 
    'Võ')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Surname_lastname'), 
    'Duy')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Email address_email'), 
    'vhbaoduy0808@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Address_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts B_4543d8/a_Admin Team'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts B_4543d8/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Username_username'), 'voduy')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Password_password'), 'j1ZzzeKf8NiE21d5rsNRrQ==')

WebUI.click(findTestObject('Object Repository/Page_My Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_V Duy'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Log out'))

WebUI.closeBrowser()
