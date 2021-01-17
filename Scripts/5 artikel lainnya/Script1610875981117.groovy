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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/')

artikel1 = WebUI.getText(findTestObject('artikel terkait/Artikel Name Column Left 1'))

artikel2 = WebUI.getText(findTestObject('artikel terkait/Artikel Name Column Left 2'))

artikel3 = WebUI.getText(findTestObject('artikel terkait/Artikel Name Column Left 3'))

artikel4 = WebUI.getText(findTestObject('artikel terkait/Artikel Name Column Left 4'))

artikel5 = WebUI.getText(findTestObject('artikel terkait/Artikel Name Column Right 1'))

WebUI.verifyNotEqual(artikel1, '')

WebUI.verifyNotEqual(artikel2, '')

WebUI.verifyNotEqual(artikel3, '')

WebUI.verifyNotEqual(artikel4, '')

WebUI.verifyNotEqual(artikel5, '')

WebUI.closeBrowser()

