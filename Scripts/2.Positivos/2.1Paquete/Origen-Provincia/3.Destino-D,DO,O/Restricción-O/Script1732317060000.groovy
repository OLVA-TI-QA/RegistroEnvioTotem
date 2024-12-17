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

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_ACCESORIOS PARA FIESTAS'))

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo (1)'), 
    'DFdf')

WebUI.setText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor (1)'), 
    '25')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/div_Hasta 2Kg (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_LIMA (1)'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/a_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Destinos/Page_Olva Courier  Datos Personales/button_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Ingrese el punto de llegada (1)'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_AMAZONAS - BAGUA - EL PARCO'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/a_Recojo en tienda (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/p_No se encontr oficinas en el destino sele_1183e7'), 
    'No se encontró oficinas en el destino seleccionado.')

WebUI.click(findTestObject('Object Repository/Positivos/Page_Olva Courier  Datos Personales/button_Aceptar'))

