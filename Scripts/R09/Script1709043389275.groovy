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

WebUI.callTestCase(findTestCase('0 Llenar Datos Formulario (Usuario Creado)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('CLI/1 Solicitar Cita/2 Escoger Cita/a_X_ Cerrar Modal inicio'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('CLI/1 Solicitar Cita/2 Escoger Cita/select_Tramite (Servicio)'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToPosition(0, 400)

WebUI.delay(3)

WebUI.click(findTestObject('CLI/1 Solicitar Cita/2 Escoger Cita/click_Hora2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('CLI/1 Solicitar Cita/3 Confirmar Cita/btn_Aceptar Cita'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

cita = WebUI.getText(findTestObject('CLI/1 Solicitar Cita/3 Confirmar Cita/span_Numero de cita'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('CLI/1 Solicitar Cita/3 Confirmar Cita/btn_Cerrar (Finalizar)'))

WebUI.delay(3)

WebUI.click(findTestObject('CLI/1 Solicitar Cita/2 Escoger Cita/a_X_cerrar Modal Inicio2'))

WebUI.delay(2)

System.out.println(cita)

WebUI.delay(2)

WebUI.comment('Modificar Cita')

WebUI.delay(3)

WebUI.click(findTestObject('CLI/0 Principal/btn_2  Cancelar o Modificar Cita'))

WebUI.delay(5)

'Cedula de Extranjeria'
WebUI.selectOptionByIndex(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/select_Tipo Documento'), 
    2)

WebUI.setText(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/input__Numero Documento'), findTestData(
        'Cliente').getValue('Número documento', 1))

WebUI.setText(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/input_Correo'), findTestData('Cliente').getValue(
        'Correo electrónico', 1))

WebUI.comment('Sacar dato de cita en una variable global')

'sacar dato de proceso de cita en variable global'
WebUI.setText(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/input_Numero Cita'), cita)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.doubleClick(findTestObject('CLI/0 Recaptcha/div_recaptcha Cancelar o modificar cita'))

WebUI.delay(2)

WebUI.click(findTestObject('CLI/2 Cancelar o Modificar Cita/1 Cancelar Modificar Cita/btn_Aceptar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.doubleClick(findTestObject('CLI/0 Recaptcha/div_Recaptcha editar con fecha'))

WebUI.delay(3)

WebUI.click(findTestObject('CLI/2 Cancelar o Modificar Cita/2/btn_CancelarCita'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

