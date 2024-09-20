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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/div_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_email'), 'daothaohy2863@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_password'), 'thao2863@')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/div_Gi hng'))

WebUI.verifyElementText(findTestObject('gggg/Page_Gi hng  Fado.vn/a_Womens Ribbed Tank Tops 2024 Summer Sleeveless High Neck Casual Slim Fitted Basic Knit Shirts'), 
    'Womens Ribbed Tank Tops 2024 Summer Sleeveless High Neck Casual Slim Fitted Basic Knit Shirts')

String cartQuantity = WebUI.getAttribute(findTestObject('tslsp/Page_Gi hng  Fado.vn/input__mz-number-control__input'), 'value')

println(cartQuantity)

WebUI.delay(2)

WebUI.click(findTestObject('gggg/Page_Gi hng  Fado.vn/button__mz-number-control__down-btn'))

WebUI.delay(2)

String cartQuantityNew = WebUI.getAttribute(findTestObject('gggg/Page_Gi hng  Fado.vn/input__mz-number-control__input'), 
    'value')

if (cartQuantityNew == '1') {
    println('Giiarm số lượng sản phẩm thành công !')
}

WebUI.closeBrowser()

