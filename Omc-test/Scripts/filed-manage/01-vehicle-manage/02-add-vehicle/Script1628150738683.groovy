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

vehicel_number = getAge()

'登录'
WebUI.callTestCase(findTestCase('Omc_Login/01-login'), [:], FailureHandling.STOP_ON_FAILURE)

'点击档案管理\r\n'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/file-manage'))

'点击车辆档案'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/vehicle-file'))

not_run: for (def index : (0..3)) {
    '点击添加车辆'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span_'))

    '输入车牌号'
    not_run: WebUI.setText(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2'), 'CS' + vehicel_number)

    '点击车牌颜色\r\n'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3'))

    '点击黄色'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/li__1'))

    not_run: WebUI.delay(1)

    '点击车辆类型'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3 - Copy'))

    '点击客车'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1'))

    '点击车辆分组\r\n'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3 - Copy (1)'))

    '点击湖南省\r\n'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/hunan'))

    '延时0.5s'
    not_run: WebUI.delay(0.5)

    '点击长株潭'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/zhangheng'))

    '延时0.5s'
    not_run: WebUI.delay(0.5)

    '点击长沙市一组'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/zhangjiajie'))

    '等待5s'
    not_run: WebUI.delay(0.5)

    '点击业户名称'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2'))

    not_run: WebUI.delay(0.5)

    '点击湖南省'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3 - Copy (3)'))

    not_run: WebUI.delay(0.5)

    '点击长沙市'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2_3'))

    not_run: WebUI.delay(0.5)

    '选择市辖区'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2 - Copy'))

    not_run: WebUI.delay(0.5)

    '选择机构‘湖南新快线商旅运输有限公司’'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2_3_4'))

    not_run: WebUI.delay(0.5)

    '点击确认'
    not_run: WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/button__1'))
}

'点击添加车辆'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span_'))

'输入车牌号'
WebUI.setText(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2'), 'CS' + vehicel_number)

'点击车牌颜色\r\n'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3'))

'点击黄色'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/li__1'))

WebUI.delay(1)

'点击车辆类型'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3 - Copy'))

'点击客车'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1'))

'点击车辆分组\r\n'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3 - Copy (1)'))

'点击湖南省\r\n'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/hunan'))

'延时0.5s'
WebUI.delay(0.5)

'点击长株潭'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/zhangheng'))

'延时0.5s'
WebUI.delay(0.5)

'点击长沙市一组'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/zhangjiajie'))

'等待5s'
WebUI.delay(0.5)

'点击业户名称'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2'))

WebUI.delay(0.5)

'点击湖南省'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/input__el-input__inner_1_2_3 - Copy (3)'))

WebUI.delay(0.5)

'点击长沙市'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2_3'))

WebUI.delay(0.5)

'选择市辖区'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2 - Copy'))

WebUI.delay(0.5)

'选择机构‘湖南新快线商旅运输有限公司’'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/span__1_2_3_4'))

WebUI.delay(0.5)

'点击确认'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/button__1 - Copy'))

'点击确认'
WebUI.click(findTestObject('02_main-page/file-manage/vehicle_manage/Page_/button__1'))

WebUI.delay(3)

WebUI.closeBrowser()

String getAge() {
    Random rd = new Random()

    String age = rd.nextInt(101)

    return age
}

