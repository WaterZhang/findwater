(function($){
	
$(document).ready(function(){
  
  $("#login").submit(function(e){
	  var user = $("#login_user").val();
	  if(user.length == 0){
		  $("#empty_user").show();
		  e.preventDefault();
	  }
	  return true;
  });
  
  
  
});

	
	
})(jQuery);