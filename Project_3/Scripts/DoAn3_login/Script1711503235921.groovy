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

WebUI.click(findTestObject('Object Repository/DoAn3_Login/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/i_fas fa-sort-down'))

WebUI.setText(findTestObject('Object Repository/DoAn3_Login/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_email'), 
    Email)

WebUI.setText(findTestObject('Object Repository/DoAn3_Login/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_password'), 
    Password)

WebUI.click(findTestObject('Object Repository/DoAn3_Login/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/button_ng nhp'))

WebUI.verifyTextPresent(Abc, false)

WebUI.closeBrowser()

