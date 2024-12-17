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

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Seleccionar artculo (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/span_ARTCULOS PUBLICITARIOS'))

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo (1)'), 
    'PREUBAs')

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor (1)'), 
    '1800')

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/div_Hasta 2Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/a_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_ICA - ICA - ICA'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo de entrega (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_Recojo en tienda (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/p_El artculo que supera los 1000 soles no p_4059db (1)'), 
    'El artículo que supera los 1000 soles no pueden ser entregados en tienda')

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Aceptar (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo de entrega (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_Entrega a domicilio (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo De Documento_1 (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo De Documento_1 (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_DNI (1)'))

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni (1)'), 
    '71735785')

WebUI.scrollToElement(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_CONTINUAR (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_CONTINUAR (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 19.74'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/th_S 1800.00'), 
    'S/ 1800.00')

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/a_regulacin de envos y la declaracin Jurada'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/div_He ledo la'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/label_Declaro bajo juramento los productos _f4619d'))

WebUI.scrollToElement(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 19.74'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/valorado/Page_Olva Courier  Medios de pago/button_PAGAR'), 
    0)

