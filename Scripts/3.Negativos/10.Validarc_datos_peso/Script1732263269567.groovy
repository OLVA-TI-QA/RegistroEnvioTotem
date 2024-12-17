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

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_No encuentro el peso de mi envo'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_CALCULAR'))

WebUI.verifyElementText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_Ingrese el ancho del paquete'), 
    'Ingrese el ancho del paquete')

WebUI.verifyElementText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_Ingrese el alto del paquete'), 
    'Ingrese el alto del paquete')

WebUI.verifyElementText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_Ingrese el largo del paquete'), 
    'Ingrese el largo del paquete')

WebUI.verifyElementText(findTestObject('Object Repository/pago/Page_Olva Courier  Datos Personales/div_Ingrese el peso del paquete'), 
    'Ingrese el peso del paquete')

