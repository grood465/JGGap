$(function() { $('.apply').on("click", function() {
		var item_point = $(this).parents(".shop-apply").children(".point-amount").text().split('P')[0];
		var usable_point = $(this).parents(".shop-main").children(".shop-top").children("#shop-point-wrapper").children("#shop-point").children("span").text();
		var item_per = $(this).parents(".shop-apply-btn").children(".point-per").text().split(': ')[1];
		var item_remain = $(this).parents(".shop-apply-btn").children(".item-remain").text().split(': ')[1].split('/')[0];
		if(item_point > usable_point){
			alert("포인트가 부족합니다");
		} else {
			var user_per = (Math.random()*100) +1;
			if(data.item_per < user_per){
				alert("꽝!")				
			} else {
				alert("당첨!")
				item_remain -= 1;
			}
			$.ajax({
				url : "/shop/apply.do", 
				type : "POST", 
				data : {
					item_name : $(this).parents(".shop-apply").children(".item_name").text(),
					item_point : item_point,
					item_per : item_per,
					item_remain : item_remain
				},
				success: function(data) {					
					location.href = "/shop/shop.do";
				},
				error : function(request, status, err){
					alert("code = "+ request.status+"\n error = " +err);
						
					}
			})	
		}

		
	})
})