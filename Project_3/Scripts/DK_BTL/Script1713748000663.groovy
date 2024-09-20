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

try {
    WebUI.maximizeWindow()
}
catch (Exception e) {
    println('Không thể tối đa hóa cửa sổ trình duyệt: ' + e.message)
} 

WebUI.click(findTestObject('Object Repository/DK_TB/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/div_ng nhp'))

WebUI.click(findTestObject('Object Repository/DK_TB/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/a_ng k'))

WebUI.setText(findTestObject('Object Repository/DK_TB/Page_ng k thnh vin - Fado - Mua Hng Quc T C_5a6851/input_fullname'), 
    ten)

WebUI.setText(findTestObject('Object Repository/DK_TB/Page_ng k thnh vin - Fado - Mua Hng Quc T C_5a6851/input_email'), 
    email)

WebUI.setText(findTestObject('Object Repository/DK_TB/Page_ng k thnh vin - Fado - Mua Hng Quc T C_5a6851/input_phone'), 
    sdt)

WebUI.setText(findTestObject('dk/Page_ng k thnh vin - Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_Xc nhn mt khu_password'), 
    matkhau)

WebUI.setText(findTestObject('dk/Page_ng k thnh vin - Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_Xc nhn mt khu_retypePassword'), 
    xacnhanmatkhau)

WebUI.setText(findTestObject('Object Repository/DK_TB/Page_ng k thnh vin - Fado - Mua Hng Quc T C_5a6851/input_captcha'), 
    maxacnhan)

WebUI.click(findTestObject('Object Repository/DK_TB/Page_ng k thnh vin - Fado - Mua Hng Quc T C_5a6851/button_ng k'))

WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(kq, false)

WebUI.closeBrowser()

