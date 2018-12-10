// var btnPrev = document.getElementById('prev');
// 		var btnNext = document.getElementById('next');
// 		btnPrev.addEventListener('click' ,updateSlider);
// 		btnNext.addEventListener('click' ,updateSlider);
// 		var totalImg = document.getElementsByClassName('img_slider').length;

// 		function updateSlider(){
// 			var activeImg = document.getElementsByClassName('active')[0];
// 			var btnId = this.Id;

// 			console.log(this.id)
// 			if (tempImg == "prev") {
// 				var tempImg = activeImg.previousSibling.previousSibling;

// 				if (tempImg == null) {
// 					tempImg = document.getElementsByClassName('img_slider')[totalImg-1];
// 				}
// 				// activeImg.classList.remove('active');
// 				// tempImg.classList.add('active');
// 				// logic for prev button
// 			}else{
// 				var tempImg = activeImg.nextSibling.nextSibling;

// 				// console.log(tempImg)

// 				if (tempImg == null) {
// 					tempImg = document.getElementsByClassName('img_slider')[0];
// 				}
// 				// logic for next button
// 			}
// 				activeImg.classList.remove('active');
// 				tempImg.classList.add('active');
// 				updateCircle(btnId);
// 		}
// 		function updateCircle(btnId){
// 			var activeCircle = document.getElementsByClassName('highlight')[0];
// 			console.log(this.id)
// 			if (btnId == "prev") {
// 				var tempCircle = activeCircle.previousSibling.previousSibling;

// 				if (tempCircle == null) {
// 					tempCircle = document.getElementsByClassName('slider_span')[totalImg-1];
// 				}
// 				// activeCircle.classList.remove('active');
// 				// tempCircle.classList.add('active');
// 				// logic for prev button
// 			}else{
// 				var tempCircle = activeCircle.nextSibling.nextSibling;

// 				// console.log(tempCircle) 

// 				if (tempCircle == null) {
// 					tempCircle = document.getElementsByClassName('slider_span')[0];
// 				}
// 				// logic for next button
// 			}
// 				activeCircle.classList.remove('highlight');
// 				tempCircle.classList.add('highlight');
// 		}



// sidebar



function openNav() {
	  document.getElementById("mySidenav").style.width = "210px";
	}

		function closeNav() {
	   	 document.getElementById("mySidenav").style.width = "0";
	}









//     // <script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 3000);    
}
// // </script>



	// <script>


// var a = document.getElementById("mySidenav").style.width;
// var myIndex = 0;

// if (a="210") {
// carousel();
    
// function carousel() {
//     var i;
//     var x = document.getElementsByClassName("mySlides");
//     document.getElementById("mySidenav").style.width = "0";
//     for (i = 0; i < x.length; i++) {

//        x[i].style.display = "none";  
//     }
//     myIndex++;
//     if (myIndex > x.length) {myIndex = 1}    
//     x[myIndex-1].style.display = "block";  
//     setTimeout(carousel, 5000);    
// }
// }else{
//     carousel();

//     function carousel() {
//     var i;
//     var x = document.getElementsByClassName("mySlides");
//     for (i = 0; i < x.length; i++) {
//        x[i].style.display = "none";  
//     }
//     myIndex++;
//     if (myIndex > x.length) {myIndex = 1}    
//     x[myIndex-1].style.display = "block";  
//     setTimeout(carousel, 5000);    
// }
// }
// </script>