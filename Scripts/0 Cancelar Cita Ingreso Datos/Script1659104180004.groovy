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

WebUI.comment('Proceso para ingresar datos para Cancelar cita')

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLI/0 Principal/btn_2  Cancelar o Modificar Cita'))

WebUI.delay(3)

'Cedula de Extranjeria'
WebUI.selectOptionByIndex(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/select_Tipo Documento'), 
    2)

WebUI.setText(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/input__Numero Documento'), '636711')

WebUI.setText(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/input_Correo'), 'edavilaz@gmail.com')

WebUI.comment('Sacar dato de cita en una variable global')

'sacar dato de proceso de cita en variable global'
WebUI.setText(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/input_Numero Cita'), '')

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/btn_Aceptar'))

WebUI.delay(3)

