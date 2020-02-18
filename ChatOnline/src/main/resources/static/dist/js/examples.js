$(function () {

    /**
     * Some examples of how to use features.
     *
     **/

    var RobaExamle = {

        Message: {
            add: function (message, type) {
                var chat_body = $('.layout .content .chat .chat-body');
                var myDate = new Date();
	               var hour=addZero( myDate.getHours());       //获取当前小时数(0-23)
	               var mm =  addZero(myDate.getMinutes());     //获取当前分钟数(0-59)
                if (chat_body.length > 0) {

                    type = type ? type : '';
                    message = message ? message : 'I did not understand what you said!';

                    $('.layout .content .chat .chat-body .messages').append(`<div class="message-item ` + type + `">
                        <div class="message-avatar">
                            <figure class="avatar" title="` + (type == 'outgoing-message' ? 'Mirabelle Tow' : 'Byrom Guittet') + `">
                                <img src="./dist/media/img/` + (type == 'outgoing-message' ? 'avatar1.png' : 'avatar4.png') + `" class="rounded-circle">
                            </figure>
                        </div>
                        <div>
                            <div class="message-content">
                                ` + message + `
                            </div>
                            <div class="time">`+hour+`:`+mm+(type == 'outgoing-message' ? '<i class="ti-double-check"></i>' : '') + `</div>
                        </div>
                    </div>`);

                    setTimeout(function () {
                        chat_body.scrollTop(chat_body.get(0).scrollHeight, -1).niceScroll({
                            cursorcolor: 'rgba(66, 66, 66, 0.20)',
                            cursorwidth: "4px",
                            cursorborder: '0px'
                        }).resize();
                    }, 200);
                }
            }
        }
    };

    setTimeout(function () {
        // $('#disconnected').modal('show');
        // $('#call').modal('show');
        // $('#videoCall').modal('show');
    }, 1000);

    $(document).on('submit', '.layout .content .chat .chat-footer form', function (e) {
	
        e.preventDefault();

        var input = $(this).find('input[type=text]');
        var message = input.val();

        message = $.trim(message);
        if(message==''){
   		 return;
        }
        webSocket.send(message);
        if (message) {
            RobaExamle.Message.add(message, 'outgoing-message');
            input.val('');

            setTimeout(function () {
               // RobaExamle.Message.add();//发送的消息
            }, 1000);
        } else {
            input.focus();
        }
    });
});





var webSocket = null;

function onMessage(event) {
	 var RobaExamle = {

		        Message: {
		            add: function (message, type) {
		                var chat_body = $('.layout .content .chat .chat-body');
		                var myDate = new Date();
		               var hour= addZero(myDate.getHours());       //获取当前小时数(0-23)
		               var mm =  addZero(myDate.getMinutes());     //获取当前分钟数(0-59)
		                if (chat_body.length > 0) {

		                    type = type ? type : '';
		                    message = message ? message : 'I did not understand what you said!';

		                    $('.layout .content .chat .chat-body .messages').append(`<div class="message-item ` + type + `">
		                        <div class="message-avatar">
		                            <figure class="avatar" title="` + (type == 'outgoing-message' ? 'Mirabelle Tow' : 'Byrom Guittet') + `">
		                                <img src="./dist/media/img/` + (type == 'outgoing-message' ? 'avatar1.png' : 'avatar4.png') + `" class="rounded-circle">
		                            </figure>
		                        </div>
		                        <div>
		                            <div class="message-content">
		                                ` + message + `
		                            </div>
		                            <div class="time">`+hour+`:`+mm+(type == 'outgoing-message' ? '<i class="ti-double-check"></i>' : '') + `</div>
		                        </div>
		                    </div>`);

		                    setTimeout(function () {
		                        chat_body.scrollTop(chat_body.get(0).scrollHeight, -1).niceScroll({
		                            cursorcolor: 'rgba(66, 66, 66, 0.20)',
		                            cursorwidth: "4px",
		                            cursorborder: '0px'
		                        }).resize();
		                    }, 200);
		                }
		            }
		        }
		    };
	 
	var message=event.data;
	 message = $.trim(message);
	 if(message==''){
		 return;
	 }
	 var type='';
    console.log("onMessage:"+event.data)
	RobaExamle.Message.add(message,type);
}

function onOpen(event) {
	console.log("已连接");
}

function onError(event) {
	console.log("发生错误");
}

function onClose(event) {
	console.log("连接关闭");
}

function connect() {
    var sid = document.getElementById('sid').value;
    var nickname = document.getElementById('nickname').value;
    var pid = document.getElementById('pid').value;
    if (url == '' || nickname == '') {
    	console.log("房间号和用户名不能为空");
        return;
    }
    var serverHot =  window.location.host;
    
    var url = 'ws://' + serverHot + '/groupChat/' + sid + '/' + nickname+'/'+pid+'/';
    webSocket = new WebSocket(url);
    webSocket.onerror = function(event) {
        onError(event)
    };

    webSocket.onopen = function(event) {
        onOpen(event)
    };

    webSocket.onmessage = function(event) {
        onMessage(event)
    };

    webSocket.onclose = function(event) {
        onClose(event)
    };
}


function addZero(val){
	if(val<10){
		return '0'+val;
	}else{
		return val;
	}
}