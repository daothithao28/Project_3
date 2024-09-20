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

WebUI.navigateToUrl('https://fado.vn/')

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/div_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_email'), 'daothaohy2863@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_password'), 
    'tprYQJ7M49vp/Ez06qsqSA==')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/button_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'), 
    'Ocean Star Automatic Blue Dial Men\'s Watch M0268301104100')

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/i_fal fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Mua Ocean Star Automatic Blue Dial Men_c23f73/div_Classic F91W Series Quartz Watch  Water_340624'))

WebUI.setText(findTestObject('Object Repository/Page_Mua Classic F91W Series Quartz Watch  _627595/input_quantity'), 'SL')


// Chờ cho trang web hoàn thành quá trình tải
WebUI.waitForPageLoad(30)


WebUI.click(findTestObject('Object Repository/Page_Mua Classic F91W Series Quartz Watch  _627595/button_Thm vo gi hng'))

WebUI.verifyTextPresent(KQ, false)

WebUI.closeBrowser()

