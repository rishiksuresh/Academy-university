

// slider jquery


$('.prev').click(updateSlider);
    $('.next').click(updateSlider);
    
    var totalImg = $('img_slider').length;

    function updateSlider(){
      var activeImg = $('.active')[0];
      var btnId = $(this).Id;

      console.log(this.id)
      if (tempImg == "prev") {
        var tempImg = activeImg.previousSibling.previousSibling;

        if (tempImg == null) {
          tempImg = $('.img_slider')[totalImg-1];
        }
      
      }else{
        var tempImg = activeImg.nextSibling.nextSibling;

        

        if (tempImg == null) {
          tempImg = $('.img_slider')[0];
        }
        
      }
        activeImg.classList.remove('active');
        tempImg.classList.add('active');
        updateCircle(btnId);
    }
    function updateCircle(btnId){
      var activeCircle = $('.highlight')[0];
      console.log(this.id)
      if (btnId == "prev") {
        var tempCircle = activeCircle.previousSibling.previousSibling;

        if (tempCircle == null) {
          tempCircle = $('.slider_span')[totalImg-1];
        }
        
      }else{
        var tempCircle = activeCircle.nextSibling.nextSibling;

       

        if (tempCircle == null) {
          tempCircle = $('.slider_span')[0];
        }
        // logic for next button
      }
        activeCircle.classList.remove('highlight');
        tempCircle.classList.add('highlight');
    }




















// <!-- /**************************************/
//       SMOOTH SCROLL FUNCTION        
// /**************************************/ -->
// <script type="text/javascript">
$(function() {
  $('a[href*="#"]:not([href="#"])').click(function() {
    if (location.pathname.replace(/^\//,'') === this.pathname.replace(/^\//,'') && location.hostname === this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
      if (target.length) {
        $('html, body').animate({
          scrollTop: target.offset().top -0+'px'
        }, 1000);
        return false;
      }
    }
  });
});
	// </script>