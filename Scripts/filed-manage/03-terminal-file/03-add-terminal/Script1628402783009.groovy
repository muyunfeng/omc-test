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

number = getNum()

number2 = (number + 1)

'登陆'
WebUI.callTestCase(findTestCase('Omc_Login/01-login'), [:], FailureHandling.STOP_ON_FAILURE)

'点击档案管理'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/span_'))

'点击终端档案'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/li_'))

'点击添加设备\r\n'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/span__1'))

'点击厂商文本框'
not_run: WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/input__el-input__inner_1_2'))

'选择厂商“锐明”'
not_run: WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/span__1_2'))

not_run: WebUI.delay(0.5)

'输入终端编号'
WebUI.setText(findTestObject('02_main-page/file-manage/terminal-file/Page_/terminal-number'), number)

'点击主机型号文本框'
WebUI.click(findTestObject('02_main-page/file-manage/terminal-file/Page_/model-number'))

'输入主机型号'
WebUI.setText(findTestObject('02_main-page/file-manage/terminal-file/Page_/model-number'), number)

'点击空白位置'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/p_'))

'点击确定'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/button__1'))

WebUI.delay(0.5)

'输入搜索终端号'
WebUI.setText(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/input__el-input__inner_1_2_3_4_5'), 
    number)

'点击查询\r\n'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/i_ICCID_el-icon-search'))

'点击编辑'
WebUI.click(findTestObject('02_main-page/file-manage/terminal-file/Page_/span__1_2_3_edit'))

'输入终端'
WebUI.setText(findTestObject('02_main-page/file-manage/terminal-file/Page_/terminal-number'), number2)

'点击空白位'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/p__1'))

'输入型号'
WebUI.setText(findTestObject('02_main-page/file-manage/terminal-file/Page_/model-number'), number2)

'点击确定'
WebUI.click(findTestObject('Object Repository/02_main-page/file-manage/terminal-file/Page_/button__1'))

WebUI.closeBrowser()

String getNum() {
    Random r = new Random()

    String n = '134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153'

    String[] s = n.split(',')

    int index = r.nextInt(s.length - 1)

    String st = s[index]

    StringBuffer str = new StringBuffer(st)

    for (int i = 0; i < 8; i++) {
        int num = r.nextInt(9)

        str.append(num)
    }
    
    return str
}

