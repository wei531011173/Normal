<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Cache-Control" content="max-age=86400">
	<meta name="renderer" content="webkit">
	<meta name="renderer" content="ie-comp">
	<meta name="renderer" content="ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<link rel="stylesheet" media="screen" href="style/pintuer.css">
	<link rel="stylesheet" media="screen" href="style/main.css">
	<link rel="stylesheet" media="screen" href="style/webuploader.css">
	<link rel="stylesheet" media="screen" href="style/ui-dialog.css">
	<link rel="stylesheet" media="screen" href="style/introjs.css">
	<link rel="stylesheet" media="screen" href="style/msgbox.css"> 
	<link rel="stylesheet" media="screen" href="style/index.css"> 	
	<script src="js/jQuery.js"></script>	
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header" class="bg bg-main layout">
		<div class="container clearfix bg bg-main">
			<a href="#" target="_self">
				<img src="images/logo.png" class="float-left">
			</a>
		</div>
	</div>
	<div id="wrapper" class="clearfix container">
		<marquee behavior="scroll" onmouseout="this.start()" onmouseover="this.stop()"><img src="images/iconfont-laba.png"> 亲爱的叮咚用户，由于淘宝数据接口规则发生变化，一星期内没登陆叮咚，已开启的关怀提醒功能会自动失效。所以，为保障您关怀短信正常发送，今后烦请7天内至少登陆一次叮咚哦。给您带来的不便，敬请谅解。</marquee>
		<div id="main-nav">
			<ul class="main-ul">
				<li class="nav-index">
					<a href="#" target="_self" class="active"><b></b>首页</a>
				</li>
				<li class="nav-market">
					<a href="javascript:;" target="_self"><b></b>会员营销<span class="icon-angle-down"></span></a>
					<ul class="main-nav-sub" style="display: block;">
						<li>
							<a href="AffiliateMarketing/MemberShortMessage.html" target="_self">会员短信群发</a>
						</li>
						<li>
							<a href="AffiliateMarketing/ImportNumberGroup.html" target="_self">导入号码群发</a>
						</li>
						<li>
							<a href="AffiliateMarketing/CouponGroup.html" target="_self">优惠券群发</a>
						</li>
						<li>
							<a href="#" target="_self">订单营销</a>
						</li>
					</ul>
				</li>
				<li class="nav-care">
					<a href="javascript:;" target="_self">
						<b></b>会员关怀
						<span class="icon-angle-down"></span>
					</a>
					<ul class="main-nav-sub" style="display: block;">
						<li>
							<a href="MemberCare/OrderReminder.html" target="_self">订单催付</a>
						</li>
						<li>
							<a href="MemberCare/TwoTimesPay.html" target="_self">二次催付</a>
						</li>
						<li>
							<a href="MemberCare/ShippingAlert.html" target="_self">发货提醒</a>
						</li>
						<li>
							<a href="MemberCare/ArrivalReminder.html" target="_self">到货提醒</a>
						</li>
						<li>
							<a href="MemberCare/SignReminder.html" target="_self">签收提醒</a>
						</li>
						<li>
							<a href="MemberCare/MiddleAndPoorEvaluationOfCare.html" target="_self">中差评关怀</a>
						</li>
						<li>
							<a href="MemberCare/CareFor.html" target="_self">好评关怀</a>
						</li>
						<li>
							<a href="MemberCare/PaymentCare.html" target="_self">付款关怀</a>
						</li>
						<li>
							<a href="MemberCare/DelayedAlert.html" target="_self">迟发提醒</a>
						</li>
						<li>
							<a href="MemberCare/BackCare.html" target="_self">回款关怀</a>
						</li>
						<li>
							<a href="MemberCare/RefundCare.html" target="_self">退款关怀</a>
						</li>
					</ul>
				</li>
				<li class="nav-history">
					<a href="javascript:;" target="_self"><b></b>短信记录/效果<span class="icon-angle-down"></span></a>
					<ul class="main-nav-sub">
						<!-- <li>
							<a href="#" target="_self">营销效果</a>
						</li>
						<li>
							<a href="#" target="_self">优惠券效果</a>
						</li>
						<li>
							<a href="#" target="_self">催付效果</a>
						</li> -->
						<li>
							<a href="SMSRecord/SendRecord.html" target="_self">发送记录</a>
						</li>
						<li>
							<a href="SMSRecord/RechargeRecord.html" target="_self">充值记录</a>
						</li>
						<li>
							<a href="SMSRecord/SMSBill.html" target="_self">短信账单</a>
						</li>
					</ul>
				</li>
				<li class="nav-sysset">
					<a href="javascript:;" target="_self"><b></b>系统设置<span class="icon-angle-down"></span></a>
					<ul class="main-nav-sub">
						<li>
							<a href="SystemSettings/ImportHistoricalOrder.html" target="_self">导入历史订单</a>
						</li>
						<li>
							<a href="SystemSettings/SMSsettings.html" target="_self">短信发送设置</a>
						</li>
						<li>
							<a href="SystemSettings/BlackListSettings.html" target="_self">黑名单设置</a>
						</li>
						<li>
							<a href="SystemSettings/ChildAccountSettings.html" target="_self">子账号设置</a>
						</li>
					</ul>
				</li>
				<li class="nav-help">
					<a href="HelpCenter/HelpCenter.html" target="_self"><b></b>帮助中心</a>
				</li>
			</ul>
		</div>
		<div id="main-content" class="clearfix">				
			<div class="index">
				<div class="clearfix">
					<div id="slide">
						<div class="hd">
							<ul class="list-unstyle"><li class="">1</li><li class="on">2</li></ul>
						</div>
						<div class="bd">
							<ul class="list-unstyle">
								<li>
									<a href="#" target="_blank"><img src="images/TB2J33cmXXXXXXBXXXXXXXXXXXX-734131476.jpg"></a>
								</li>
								<li>
									<a href="#" target="_blank"><img src="images/TB2TgUQkXXXXXcvXpXXXXXXXXXX-734131476.jpg"></a>
								</li>
							</ul>
						</div>
					</div>
					<div id="user-info" class="border">
						<h4>欢迎 <span class="text-blue" id="shop-name">${user.userName}</span></h4>
						<ul class="border-bottom">
							<li>剩余短信：<b class="text-dot msg-remain text-large">${user.userName}</b> 条
								<a href="#" target="_self" class="button bg-yellow float-right"> 短信充值&nbsp;</a></li>
							<li>软件还剩：<b class="text-dot deadL text-large">${user.userName}</b> 天
								<a href="#" target="_blank" class="button bg-yellow float-right">升级/续费</a></li>
						</ul>
						<div class="text-center">
							<a href="javascript:;" id="send-test" class="button bg-blue button-big margin-top mainbtn">发送测试短信</a>
						</div>
					</div>
				</div>
				<div class="panel margin-top">
					<div class="panel-head">
						<h4>会员营销</h4>
					</div>
					<div class="panel-body">
						<ul class="quick-btns clearfix">
							<li>
								<a href="#" target="_self">
									<img src="images/btn1.jpg">
									<b>会员短信群发</b>
									<button>我要发送</button>
								</a>
							</li>
							<li>
								<a href="#" target="_self">
									<img src="images/btn2.jpg">
									<b>导入号码群发</b>
									<button>我要发送</button>
								</a>
							</li>
							<li>
								<a href="#" target="_self">
									<img src="images/btn3.jpg">
									<b>优惠券群发</b>
									<button>我要发送</button>
								</a>
							</li>
						</ul>
					</div>
				</div>

				<div class="panel margin-top">
					<div class="panel-head">
						<h4>会员关怀</h4>
					</div>
					<div class="panel-body">
						<ul class="cares-map clearfix">
							<li>
								<a href="#" target="_self" cat="1">
									<b>订单催付</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr1.jpg">
							</li>
							<li>
								<a href="#" target="_self" cat="20">
									<b>二次催付</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr1.jpg">
							</li>
							<li>
								<a href="#" target="_self" class="margin-big-bottom" cat="12">
									<b>付款关怀</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr2.jpg">
							</li>
							<li>
								<a href="#" target="_self" class="margin-big-bottom" cat="2">
									<b>发货提醒</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
								<a href="#" target="_self" cat="6">
									<b>迟发提醒</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr1.jpg">
							</li>
							<li>
								<a href="#" target="_self" cat="4">
									<b>到货提醒</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr1.jpg">
							</li>
							<li>
								<a href="#" target="_self" cat="3">
									<b>签收提醒</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr2.jpg">
							</li>
							<li>
								<a href="#" target="_self" class="margin-big-bottom" cat="7">
									<b>回款关怀</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
								<a href="#" target="_self" cat="8">
									<b>退款关怀</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
							<li>
								<img src="images/arr2.jpg">
							</li>
							<li>
								<a href="#" target="_self" class="margin-big-bottom" cat="10">
									<b>中差评关怀</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
								<a href="#" target="_self" cat="11">
									<b>好评关怀</b>
									<button>未开启</button>
									<div class="care-mask">
										<span>点击设置</span>
									</div>
								</a>
							</li>
						</ul>		
					</div>
				</div>
				<div class="panel margin-top">
					<div class="panel-head">
						<h4>效果展示</h4>
					</div>
					<div class="panel-body">
						<ul class="quick-btns clearfix">
							<li>
								<a href="#" target="_self">
									<img src="images/btn4.jpg">
									<b>营销效果</b>
									<button>点击查看</button>
								</a>
							</li>
							<li>
								<a href="#" target="_self">
									<img src="images/btn5.jpg">
									<b>优惠券效果</b>
									<button>点击查看</button>
								</a>
							</li>
							<li>
								<a href="#" target="_self">
									<img src="images/btn6.jpg">
									<b>催付效果</b>
									<button>点击查看</button>
								</a>
							</li>
						</ul>
					</div>
				</div>
				<div class="panel margin-top">
					<div class="panel-head">
						<h4>发送记录</h4>
					</div>
					<div class="panel-body">
						<ul class="quick-btns clearfix">
							<li>
								<a href="#" target="_self">
									<img src="images/btn7.jpg">
									<b>营销记录</b>
									<button>点击查看</button>
								</a>
							</li>
							<li>
								<a href="#" target="_self">
									<img src="images/btn8.jpg">
									<b>关怀记录</b>
									<button>点击查看</button>
								</a>
							</li>
							<li>
								<a href="#" target="_self">
									<img src="images/btn9.jpg">
									<b>系统短信记录</b>
									<button>点击查看</button>
								</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<ul id="fixnav">
		    <li class="qq">
				<a target="_blank" href="#"></a>
			</li>
			<li class="ww">
				<a target="_blank" href="#"></a>
			</li>
			<li class="phone">
				<div>152-6813-5612</div>
			</li>
			<li class="feedback">
				<a href="#" target="_blank"></a>
			</li>
			<li class="totop">
				<a href="#" target="_self"></a>
			</li>
		</ul>
	</div>
	<div id="foot" class="text-center height-large margin-large">Copyright © 杭州逐鹿网络技术有限公司 2014</div>
	<script src="js/jquery.SuperSlide2.js"></script>
	<script src="js/index.js"></script>
</body>
</html>