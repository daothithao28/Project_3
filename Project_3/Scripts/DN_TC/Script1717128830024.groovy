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

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_password'), password)

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/button_ng nhp'))

WebUI.waitForPageLoad(30)

currentURL = WebUI.getUrl()

WebUI.verifyEqual(currentURL, 'https://fado.vn/dang-nhap?redirect=https%3A%2F%2Ffado.vn%2F')

/*WebUI.waitForPageLoad(10)

// Lấy URL hiện tại sau khi đăng nhập
String actualURL = WebUI.getUrl()
String expectedURL = 'https://fado.vn/'  // Kiểm tra lại URL mong đợi cho đúng

// So sánh hai URL
WebUI.verifyEqual(actualURL, expectedURL)*/
WebUI.verifyTextPresent(kq, false)

WebUI.closeBrowser()

