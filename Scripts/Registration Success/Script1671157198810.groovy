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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.callTestCase(findTestCase('Functions/fill All input Registration'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.SetTimeOut)

String url = WebUI.getUrl()

String expectUrl = '/app/verification-methods'

if (!(url.contains(expectUrl))) {
    KeywordUtil.markFailed('Failed')
}

WebUI.waitForElementPresent(findTestObject('Page Registration/Back Icon'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Back Icon'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/Title Daftar Akun'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Title Daftar Akun'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

String title = WebUI.getText(findTestObject('Page Registration/Title Daftar Akun'))

String expectTitle = 'Pilih Metode Verifikasi'

if (!(WebUI.verifyMatch(title, expectTitle, true))) {
    KeywordUtil.markFailed('failed')
}

WebUI.waitForElementPresent(findTestObject('Page Registration/Card Form Registration'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Card Form Registration'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page OTP/Button Kirim via WhatsApp'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page OTP/Button Kirim via WhatsApp'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page OTP/Button Kirim via SMS'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page OTP/Button Kirim via SMS'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

