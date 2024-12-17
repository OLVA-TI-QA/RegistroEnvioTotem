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

WebUI.callTestCase(findTestCase('1.Inicio/1.2Tipo_Doc/2.DNI_Colab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/sobre/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'PRUEBAS SOBRE')

WebUI.setText(findTestObject('Object Repository/sobre/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '70')

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

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

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

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo De Documento_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/span_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 29.00'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 29.00'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Destinos/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_b85f5d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Destinos/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_af5936'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Destinos/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_653975'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Destinos/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_8615a0'), 
    '1')

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Confirma tus datos/div_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivos/Page_Olva Courier  Medios de pago/button_PAGAR'), 
    0)

WebUI.callTestCase(findTestCase('1.Inicio/1.3Pago_POS/Pago-exitoso'), [:], FailureHandling.STOP_ON_FAILURE)

