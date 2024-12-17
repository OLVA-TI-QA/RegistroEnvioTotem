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

WebUI.click(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/img_Qu deseas realizar hoy_img_paquete (1) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/input_Qu deseas realizar hoy_radioTipoEnvio (1)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/label_He ledo y acepto los trminos de uso y_adab65 (1)'), 
    'He leído y acepto los términos de uso y políticas de privacidad')

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/a_trminos de uso y polticas de privacidad (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/span_He ledo y acepto los_checkmark (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/span_He ledo y acepto los_checkmark (1) (1)'))

WebUI.click(findTestObject('Object Repository/Negativos/Page_Olva Courier  Home/button_CONTINUAR (1)'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/button_Seleccionar artculo'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/div_Debe seleccionar un artculo de la lista'), 
    'Debe seleccionar un artículo de la lista')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/div_Debe ingresar la descripcin del artculo'), 
    'Debe ingresar la descripción del artículo')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/div_Ingrese un valor al articulo'), 
    'Ingrese un valor al articulo')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/div_Debe seleccionar o ingresar el peso del_535e77'), 
    'Debe seleccionar o ingresar el peso del paquete.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/div_Debe Seleccionar el Destino'), 
    'Debe Seleccionar el Destino')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Olva Courier  Datos Personales/div_Antes de continuar, por favor ingrese t_3e0616'), 
    'Antes de continuar, por favor ingrese toda la información necesaria.')

