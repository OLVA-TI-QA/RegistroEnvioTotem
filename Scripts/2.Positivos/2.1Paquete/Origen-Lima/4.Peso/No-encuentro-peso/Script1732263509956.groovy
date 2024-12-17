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

WebUI.callTestCase(findTestCase('1.Inicio/1.1Principal/Selec_paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.Inicio/1.2Tipo_Doc/1.DNI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/button_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELECTRONICOS'))

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'), 
    'VVVv')

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor'), 
    '20')

WebUI.scrollToElement(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_No encuentro el peso de mi envo'), 
    0)

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_No encuentro el peso de mi envo'))

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_Ancho (cm)_modal-input-ancho'), 
    '14')

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_Largo (cm)_modal-input-largo'), 
    '14')

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_Alto (cm)_modal-input-alto'), 
    '14')

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_Peso (Kg)_modal-input-peso'), 
    '7')

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_CALCULAR'))

WebUI.scrollToElement(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'), 
    0)

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/a_APURIMAC - GRAU - CHUQUIBAMBILLA'))

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/button_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.scrollToElement(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 0)

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/pago/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 76.41'), 
    0)

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 76.41'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/pago/Page_Olva Courier  Medios de pago/button_PAGAR (1)'), 
    0)

WebUI.callTestCase(findTestCase('1.Inicio/1.3Pago_POS/Pago-exitoso'), [:], FailureHandling.STOP_ON_FAILURE)

