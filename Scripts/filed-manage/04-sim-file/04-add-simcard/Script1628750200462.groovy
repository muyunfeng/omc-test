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

number = getRandomNickname(int length)

number2 = (number + 1)

WebUI.callTestCase(findTestCase('Omc_Login/01-login'), [:], FailureHandling.STOP_ON_FAILURE)

'点击档案管理'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/div_'))

'点击sim档案'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/li_SIM'))

'点击添加sim卡按钮'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/span_SIM'))

'输入iccid'
WebUI.setText(findTestObject('02_main-page/file-manage/sim-file/Page_/iccid'), number)

'输入运营商'
WebUI.setText(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/input__el-input__inner_1_2'), '测试')

'点击确定'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/span_'))

'ICCID查询文本框输入'
WebUI.setText(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/input_ICCID_el-input__inner'), number)

'点击查询'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/button_'))

WebUI.verifyElementText(findTestObject('02_main-page/file-manage/sim-file/Page_/sim_value'), number, FailureHandling.CONTINUE_ON_FAILURE)

'点击编辑按钮'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/span__1_2'))

'修改iccid的值'
WebUI.setText(findTestObject('02_main-page/file-manage/sim-file/Page_/iccid'), number2)

WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/p_SIM'))

'点击确定'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/sim-file/Page_/button__1'))

WebUI.closeBrowser()

static String getRandomNickname(int length) {
    String val = ''

    Random random = new Random()

    for (int i = 0; i < 20; i++) {
        val += String.valueOf(random.nextInt(10))
    }
    
    return val
    
    WebUI.acceptAlert()
}

