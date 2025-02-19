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

WebUI.click(findTestObject('Semua/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Semua/Page_HADIR/p_Semua'))

WebUI.setText(findTestObject('Object Repository/Semua/Page_HADIR/input_Search_search'), 'Momo')

WebUI.click(findTestObject('Semua/Page_HADIR/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Semua/Page_HADIR/button_Reset'))

WebUI.delay(2)

// ASSERTION UNTUK MEMASTIKAN FILTER TELAH DIHAPUS
// 1. Pastikan kolom pencarian kosong
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Semua/Page_HADIR/input_Search_search'), 'value', '', 
    10)

// 2. Pastikan dropdown kembali ke opsi default (misalnya "Semua")
WebUI.verifyElementText(findTestObject('Semua/Page_HADIR/div_Semua'), 'Semua')

WebUI.click(findTestObject('Semua/Page_HADIR/div_Semua'))

