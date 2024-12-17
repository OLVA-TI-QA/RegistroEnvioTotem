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

WebUI.callTestCase(findTestCase('1.Inicio/1.2Tipo_Doc/4.CE_Colab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Seleccionar artculo (2)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/span_ACCESORIOS PARA FIESTAS'))

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo (2)'), 
    'FGg')

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor (2)'), 
    '100')

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/div_Hasta 2Kg (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/a_ICA'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_ICA'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada (2)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo de entrega (2)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_Recojo en tienda (2)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tienda (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/span_BAGUA CHICA - BAGUA - PJ ALFONSO UGART_d3a165'))

WebUI.scrollToElement(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo De Documento_1 (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_Tipo De Documento_1 (2)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/a_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni (2)'), 
    '002691903')

WebUI.scrollToElement(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_CONTINUAR (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Datos Personales/button_CONTINUAR (2)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 25.68'))

WebUI.verifyElementText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/div_He ledo la (1)'), 
    'He leído la')

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/div_He ledo la (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/label_Declaro bajo juramento los productos _f4619d (1)'), 
    'Declaro bajo juramento los productos escritos en el registro de envíos.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/label_Declaro bajo juramento los productos _f4619d (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_CONTINUAR (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_CONTINUAR (1)'))

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 25.68'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_b85f5d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_af5936'), 
    '1')

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_653975'), 
    '1')

WebUI.setText(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_8615a0'), 
    '1')

WebUI.click(findTestObject('Object Repository/valorado/Page_Olva Courier  Confirma tus datos/div_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/valorado/Page_Olva Courier  Medios de pago/button_PAGAR (1)'), 
    0)

