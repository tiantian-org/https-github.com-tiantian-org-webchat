function submit(){
	jQuery.ajax({
		type:'post',
		cache:false,
		dataType:'json',
		url:"/user/regSumit",
		data:new FormData($('#regform')[0]),
		processData:false,
		contentType:false,
		success:function(data){
			var obj= eval(data);
			if(obj.code=='SUCCESS'){
				document.getElementById("alertsu").style.display='block';
				setTimeout(function() {
					
					window.location.href="/user/regSuccess";
				},1000);
			}
		}
	});
} 