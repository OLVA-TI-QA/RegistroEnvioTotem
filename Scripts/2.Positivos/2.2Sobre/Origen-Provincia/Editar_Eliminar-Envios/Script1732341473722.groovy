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

WebUI.callTestCase(findTestCase('1.Inicio/1.2Tipo_Doc/3.CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/sobre/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'PRUEBAS SOBRE')

WebUI.setText(findTestObject('Object Repository/sobre/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '70')

WebUI.scrollToElement(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/a_ICA'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_ICA'))

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_BAGUA CHICA - BAGUA - PJ ALFONSO UGART_d3a165'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_RIOS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/div_RIOS'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/a_AGREGAR ENVOS'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Home/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Home/button_CONTINUAR'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'FDFd')

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '20')

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_AMAZONAS - BAGUA - EL PARCO'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'), 
    'PRUE')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor'), 
    '100')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/div_Hasta 2Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Recojo en tienda'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/a_Eliminar'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 18.60'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Medios de pago/button_PAGAR'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Medios de pago/button_PAGAR'), 'PAGAR')

WebUI.callTestCase(findTestCase('1.Inicio/1.1Principal/Selec_paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.Inicio/1.2Tipo_Doc/3.CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELECTRONICOS'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'), 
    'PRUEBAs')

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor'), 
    '20')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/b_1Kg'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/a_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_BAGUA CHICA - BAGUA - PJ ALFONSO UGART_d3a165'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_RIOS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/div_RIOS'), 0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/a_AGREGAR ENVOS'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Home/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Home/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'FDFd')

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '20')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_AMAZONAS - BAGUA - EL PARCO'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 29.00'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivos/Page_Olva Courier  Medios de pago/button_PAGAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Medios de pago/p_Confirma tus datos'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'), 
    'PRUE')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor'), 
    '100')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/div_Hasta 2Kg'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/a_Eliminar'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 18.60'))

WebUI.verifyElementText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Medios de pago/button_PAGAR'), 'PAGAR')

WebUI.callTestCase(findTestCase('1.Inicio/1.3Pago_POS/Pago-exitoso'), [:], FailureHandling.STOP_ON_FAILURE)

