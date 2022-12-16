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

String url = WebUI.getUrl()

String expectUrl = 'app/gabung'

if (!(url.contains(expectUrl))) {
    KeywordUtil.markFailed('Failed')
}

WebUI.waitForElementPresent(findTestObject('Page Registration/Back Icon'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Back Icon'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/Title Daftar Akun'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Title Daftar Akun'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

String title = WebUI.getText(findTestObject('Page Registration/Title Daftar Akun'))

String expectTitle = 'Daftar Akun'

if (!(WebUI.verifyMatch(title, expectTitle, true))) {
    KeywordUtil.markFailed('failed')
}

WebUI.waitForElementPresent(findTestObject('Page Registration/Card Form Registration'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Card Form Registration'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/input Email'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/input Email'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/input Handphone'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/input Handphone'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/Input Password'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Input Password'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/input Ulangi Kata Sandi'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/input Ulangi Kata Sandi'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/input Nama Depan'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/input Nama Depan'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/input Nama Belakang'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/input Nama Belakang'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/input KabupatenKota'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/input KabupatenKota'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/Checkbox Terms And Condition checked'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Checkbox Terms And Condition checked'), GlobalVariable.SetTimeOut, 
    FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Page Registration/Button Daftar Enabled'), GlobalVariable.SetTimeOut)

WebUI.verifyElementPresent(findTestObject('Page Registration/Button Daftar Enabled'), GlobalVariable.SetTimeOut, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Page Registration/input Email'), 'calvinnurcahya@gmail.com')

WebUI.sendKeys(findTestObject('Page Registration/input Handphone'), '085925341423')

WebUI.sendKeys(findTestObject('Page Registration/Input Password'), 'Maemunah123')

WebUI.sendKeys(findTestObject('Page Registration/input Ulangi Kata Sandi'), 'Maemunah123')

WebUI.sendKeys(findTestObject('Page Registration/input Nama Depan'), 'Calvin')

WebUI.sendKeys(findTestObject('Page Registration/input Nama Belakang'), 'Nurcahya')

String text = 'KOTA BOGOR'

char[] arrNumber = text.toCharArray()

for (char ch : arrNumber) {
    WebUI.sendKeys(findTestObject('Page Registration/input KabupatenKota'), ch.toString())

    Thread.sleep(100)
}

WebUI.sendKeys(findTestObject('Page Registration/input KabupatenKota'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page Registration/Button Daftar Enabled'), FailureHandling.OPTIONAL)

