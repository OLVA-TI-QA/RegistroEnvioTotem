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

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Home/img_Qu deseas realizar hoy_img_paquete'))

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Home/span_He ledo y acepto los_checkmark (1)'))

WebUI.click(findTestObject('Object Repository/Principal/Page_Olva Courier  Home/button_CONTINUAR (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/strong_REGISTRO DE ENVOS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/span_Regresar (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Principal/Page_Olva Courier  Datos Personales/span_Inicio (1)'), 
    0)

