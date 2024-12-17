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

WebUI.verifyElementPresent(findTestObject('Object Repository/pago/Page_Olva Courier  Medios de pago/div_Pago con tarjeta de crdito, dbito y Yape'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/pago/Page_Olva Courier  Medios de pago/td_S'), 0)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/pago/Page_Olva Courier  Medios de pago/button_PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/pago/Page_Olva Courier  Pago Exitoso/div_Aprobado y completado con exito'), 
    'Aprobado y completado con exito')

//WebUI.verifyElementText(findTestObject('Object Repository/pago/Page_Olva Courier  Pago Exitoso/b_nroPreventa'), '202406724302')
WebUI.verifyElementPresent(findTestObject('Object Repository/pago/Page_Olva Courier  Pago Exitoso/b_nroPreventa'), 0)

