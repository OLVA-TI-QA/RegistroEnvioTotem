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

WebUI.callTestCase(findTestCase('5.Empaques/1.Inicio-Empaques/Inicio-cajas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/img_Envo de documentoscon un peso mximo de__8aba39'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe seleccionar un tipo de documento'), 
    'Debe seleccionar un tipo de documento')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe Ingresar un Nmero Documento'), 
    'Debe Ingresar un Número Documento')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Ingrese 9 digitos'), 
    'Ingrese 9 digitos')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Ingrese nmero de celular'), 
    'Ingrese número de celular')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Ingrese formato correo electrnico'), 
    'Ingrese formato correo electrónico')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '1234567')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_El DNI debe tener 8 dgitos'), 
    'El DNI debe tener 8 dígitos', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_DNI'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_RUC'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '2000000000')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_El RUC debe tener 11 dgitos'), 
    'El RUC debe tener 11 dígitos', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_RUC_caret'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '12345678')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_El CE debe tener 9 dgitos'), 
    'El CE debe tener 9 dígitos', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_RUC'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '10066810581')

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'))

WebUI.verifyTextPresent('Debe seleccionar mínimo 3 cajas para la entrega en tienda o 10 para envío a domicilio', false)

WebUI.click(findTestObject('Object Repository/button_Aceptar - mensaje'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'), 0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_Eliminar'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_La cantidad mnima es 1'), 
    'No puede tener menos de 3 cajas en total')

WebUI.click(findTestObject('Object Repository/button_Aceptar - mensaje'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'))

WebUI.verifyTextPresent('Recojo en tienda', false)

WebUI.verifyTextPresent('LIMA - LIMA - MIRAFLORES', false)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2_3'))

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

