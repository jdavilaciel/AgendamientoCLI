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

WebUI.callTestCase(findTestCase('0 Inicio Sesion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLI/0 Principal/btn_3 Consultar Citas'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.comment('Botón Volver')

WebUI.click(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/btn_Salir (Volver)'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

'Sirve para cerrar la ventana modal'
WebUI.executeJavaScript('return document.querySelector("#divVentanaModal > div.ventanaModalEnvoltura.cajaMover.ui-draggable > div.ventanaModalTitulo > div > a.cerrar").click()', 
    [], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CLI/0 Principal/btn_3 Consultar Citas'))

WebUI.comment('Botón Limpiar')

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/select_Tipo Documento'), findTestData(
        'Cliente').getValue('Tipo documento', 2), false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/btn_Limpiar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.comment('Botón Aceptar')

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/select_Tipo Documento'), findTestData(
        'Cliente').getValue('Tipo documento', 2), false)

WebUI.delay(3)

WebUI.setText(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/input_Numero Documento'), findTestData('Cliente').getValue(
        'Número documento', 1))

WebUI.setText(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/input_Correo'), findTestData('Cliente').getValue('Correo electrónico', 
        1))

'Abiertas ; Cerradas'
WebUI.selectOptionByLabel(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/select_Estado Cita'), 'Cerradas', false)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('CLI/0 Recaptcha/div_recaptcha Consultar cita'))

WebUI.delay(2)

WebUI.click(findTestObject('CLI/3 Consultar Citas/1 Consultar Citas/btn_Aceptar'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

