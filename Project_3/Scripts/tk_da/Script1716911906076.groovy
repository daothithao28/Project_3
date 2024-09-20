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

WebUI.click(findTestObject('Object Repository/tk/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/div_ng nhp'))

WebUI.setText(findTestObject('Object Repository/tk/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_email'), 'daothaohy2863@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tk/Page_ng nhp - Fado - Mua Hng Quc T Cao Cp T_e30f84/input_password'), 
    'tprYQJ7M49vp/Ez06qsqSA==')

WebUI.click(findTestObject('Object Repository/tk/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'))

WebUI.setText(findTestObject('Object Repository/tk/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'), 
    tukhoa)

WebUI.sendKeys(findTestObject('Object Repository/tk/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent(kq, false)

url = WebUI.getUrl()

WebUI.verifyEqual(url, url)

WebUI.closeBrowser()

