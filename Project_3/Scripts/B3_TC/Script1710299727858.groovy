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

WebUI.navigateToUrl('https://tiki.vn/')

WebUI.click(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/img'))

WebUI.setText(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/input_tel'), '0337955603')

WebUI.click(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/button_Tip Tc'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/input_password'), 
    'tprYQJ7M49sCLWECnVFYlg==')

WebUI.click(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/div_Trt  ng nhp                                                        Ti li nh'))

WebUI.setText(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/input_styles__InputRevamp-sc-6cbqeh-2 IXqBC'), 
    'học cá')

WebUI.setText(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/input_styles__InputRevamp-sc-6cbqeh-2 IXqBC_1'), 
    'học cách học')

WebUI.click(findTestObject('Object Repository/Page_Tiki - Mua hng online gi tt, hng chun,_f1f5b0/button_Tm kim'))

WebUI.click(findTestObject('Object Repository/Page_Hc cch hc hng chnh hng, giao nhanh - T_f39296/img_styles__StyledImg-sc-p9s3t3-0 hbqSye'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Mua Hc Cch Hc ti Alpha Books Official/h1_Hc Cch Hc'), 'Học Cách Học')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mua Hc Cch Hc ti Alpha Books Official/div_119.000'), 0)

WebUI.click(findTestObject('Object Repository/Page_Mua Hc Cch Hc ti Alpha Books Official/button_Thm vo gi'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Mua Hc Cch Hc ti Alpha Books Official/p_Thm vo gi hng thnh cng'), 
    'Thêm vào giỏ hàng thành công!')

WebUI.click(findTestObject('Object Repository/Page_Mua Hc Cch Hc ti Alpha Books Official/a_Xem gi hng v thanh ton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Gi hng  Tiki.vn/div_Hc Cch HcSch khng h tr Bookcare119.000357.000'), 
    0)

