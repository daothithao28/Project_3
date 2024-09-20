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

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'))

WebUI.rightClick(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'))

WebUI.setText(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'), 
    'Ocean Star Automatic Blue Dial Men\'s Watch M0268301104100')

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'))

WebUI.click(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/div_Cho php'))

WebUI.setText(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'), 
    'Ocean Star Automatic Blue Dial Men\'s Watch M0268301104100')

WebUI.sendKeys(findTestObject('Object Repository/Page_Fado - Mua Hng Quc T Cao Cp T M, Nht, c, Anh/input_mz-header-vsearch__keyword-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Mua Ocean Star Automatic Blue Dial Men_c23f73/div_Classic F91W Series Quartz Watch  Water_340624'))

WebUI.click(findTestObject('Object Repository/Page_Mua Classic F91W Series Quartz Watch  _627595/button_Thm vo gi hng'))

WebUI.click(findTestObject('Object Repository/Page_Mua Classic F91W Series Quartz Watch  _627595/div_thm sn phm vo gi hng thnh cng          _00959d'))

WebUI.click(findTestObject('Object Repository/Page_Mua Classic F91W Series Quartz Watch  _627595/a_Xem gi hng v thanh ton'))

