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

WebUI.click(findTestObject('CLI/0 Principal/btn_1 Solicitar Cita'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('CLI/1 Solicitar Cita/1 Nueva Cita (Formulario Datos)/select_Tipo Persona'), findTestData(
        'Cliente').getValue('Tipo persona', 1), false)

WebUI.selectOptionByLabel(findTestObject('CLI/1 Solicitar Cita/1 Nueva Cita (Formulario Datos)/select_Tipo Documento'), 
    findTestData('Cliente').getValue('Tipo documento', 2), false)

WebUI.setText(findTestObject('CLI/1 Solicitar Cita/1 Nueva Cita (Formulario Datos)/input_Numero Documento'), findTestData(
        'Cliente').getValue('Número documento', 1))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.delay(3)

WebUI.scrollToPosition(0, 700)

WebUI.doubleClick(findTestObject('CLI/0 Recaptcha/div_Campo obligatorio_ctl00_ContentPlaceHolder2_recaptcha'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('CLI/0 Recaptcha/div_Campo obligatorio_DivReCaptchaG'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('CLI/1 Solicitar Cita/1 Nueva Cita (Formulario Datos)/btn_Guardar(Solicitar)'), 2)

WebUI.click(findTestObject('CLI/1 Solicitar Cita/1 Nueva Cita (Formulario Datos)/btn_Guardar(Solicitar)'))

WebUI.delay(2)

