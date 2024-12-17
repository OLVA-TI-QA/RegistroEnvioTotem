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

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/span_TARJETAS PERSONALES'))

WebUI.setText(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_articulo'), 
    'FFf')

WebUI.setText(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_valor'), 
    '50')

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/div_Hasta 5Kg'), 0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/div_Hasta 5Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'), 
    0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/a_ANCASH - HUARAZ - HUARAZ'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_Tipo De Documento_1'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '71735785')

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/th_S 19.69'), 'S/ 19.69')

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/div_Hasta 4Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/th_S 17.10'), 'S/ 17.10')

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/div_Hasta 3Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/th_S 14.50'), 'S/ 14.50')

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/div_Hasta 2Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/th_S 11.89'), 'S/ 11.89')

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/div_Hasta 1Kg'))

WebUI.scrollToElement(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 0)

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/th_S 9.30'), 'S/ 9.30')

WebUI.click(findTestObject('Object Repository/peso/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 9.30'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/peso/Page_Olva Courier  Medios de pago/button_PAGAR'), 0)

WebUI.callTestCase(findTestCase('1.Inicio/1.3Pago_POS/Pago-exitoso'), [:], FailureHandling.STOP_ON_FAILURE)

