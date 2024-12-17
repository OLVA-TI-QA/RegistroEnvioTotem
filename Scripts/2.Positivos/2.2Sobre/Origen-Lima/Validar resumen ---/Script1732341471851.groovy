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

WebUI.callTestCase(findTestCase('1.Inicio/1.1Principal/Principal-home'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.Inicio/1.1Principal/Selec_sobre'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.Inicio/1.2Tipo_Doc/5.RUC20'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/sobre/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'PRUEBAS SOBRE')

WebUI.setText(findTestObject('Object Repository/sobre/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '70')

WebUI.scrollToElement(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada'), 
    0)

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/a_AMAZONAS - BAGUA - COPALLIN'))

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/button_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/a_RUC'))

WebUI.setText(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '20100686814')

WebUI.scrollToElement(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Principal/Page_Olva Courier  Confirma tus datos/th_---'), '---')

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 18.60'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Principal/Page_Olva Courier  Medios de pago/button_PAGAR'), 
    0)

WebUI.callTestCase(findTestCase('1.Inicio/1.3Pago_POS/Pago-exitoso'), [:], FailureHandling.STOP_ON_FAILURE)

