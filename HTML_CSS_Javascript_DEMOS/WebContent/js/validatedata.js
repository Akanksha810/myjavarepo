
function validatepass(){
	
	alert("Hello in validate");
	  //var p=document.getElementById("errorp");
	   var pass=document.getElementById("pass").value;
	   var cpass=document.getElementById("cpass").value;
	  // alert(pass+"----"+cpass)
	   if(pass==cpass){
		   document.getElementById("errpass").innerHTML="";
		   return true;
	   }
	   else{
		   document.getElementById("errpass").innerHTML="password and confirm paswword doesnot match";
		   return false;
	   }
}

function validateDegree(){
	console.log("in validate degree");
	 var dlist=document.getElementsByName("degree");
	  for(var i=0;i<dlist.length;i++){
		  console.log(dlist[i].value+"------"+dlist[i].checked);
		  if(dlist[i].checked==true){
			  document.getElementById("errdeg").innerHTML="";
			  return true;
		  }
	   }
	   document.getElementById("errdeg").innerHTML="select minimum one degree";
	   return false;
	
}

function validateHobbies(){
	  console.log("in validate hobbies");
	  var cnt=0;
	  var hlist=document.getElementsByName("hobbies");
	  for(var i=0;i<hlist.length;i++){
		  console.log(hlist[i].value+"------"+hlist[i].checked);
		  if(hlist[i].checked==true){
			  cnt++;
			  if(cnt>=2){
			    document.getElementById("errhobby").innerHTML="";
			    return true;
			  }
		  }
	   }
	   document.getElementById("errhobby").innerHTML="select minimum 2 hobbies";
	   return false;
	
}

   function validatedata(){
	   alert("validatedata");
	   var flag1=validatepass();
	   
	   var flag2=validateDegree();
	   alert("flag1 :"+flag1+"flag 2: "+flag2);
	   var flag3=validateHobbies();
	   if(flag1){//}&& flag2 && flag3){
		   return true;
	   }
	   else{
		   return false;
	   }
	   return false;
	   
	   
	   
	   
	   
	   
   }