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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

WebUI.callTestCase(findTestCase('5.Empaques/1.Inicio-Empaques/Inicio-cajas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/img_Envo de documentoscon un peso mximo de__8aba39'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_DNI'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '72228024')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Hola,'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToPosition(0, 400)

//WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1'))
WebUI.click(findTestObject('EMPAQUE 1'))

WebUI.click(findTestObject('EMPAQUE 2'))

WebUI.click(findTestObject('EMPAQUE 3'))

WebUI.scrollToElement(findTestObject('EMPAQUE 4'), 0)

WebUI.click(findTestObject('EMPAQUE 4'))

WebUI.click(findTestObject('EMPAQUE 5'))

WebUI.click(findTestObject('EMPAQUE 6'))

WebUI.scrollToElement(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'), 0)

WebUI.click(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'))

WebUI.delay(3)

WebUI.rightClick(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_LIMA - LIMA - MIRAFLORES'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_LIMA - LIMA - MIRAFLORES'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_CALLAO - CALLAO - CALLAO'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tienda'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_OLVA ALMACEN - AV. ARGENTINA 4458 - CALLA_89a3f6'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR (2)'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_Para el recojo de tu compra se necesi_22ff2d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_Para el recojo de tu compra se necesi_39579b'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_Para el recojo de tu compra se necesi_9b4583'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_Para el recojo de tu compra se necesi_cbc9dd'), 
    '1')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Aceptar'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_PAGAR'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_PAGAR'), 
    0)

WebUI.callTestCase(findTestCase('5.Empaques/3.Pago-Empaques/Pago-exitoso'), [:], FailureHandling.STOP_ON_FAILURE)

