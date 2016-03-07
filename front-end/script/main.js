$(document).ready(function(){

	var theproducts = $("ul#products");  //list of gallery images

	createGalleryList(theproducts);  // this build the gallery imageslist


	var togSrc = [ "images/icons/grid-toggle.jpg", "images/icons/list-toggle.jpg" ];

	$(".tog").click(function() {

		this.src =  togSrc.reverse()[0];
	});

	$('.imagetype').hide();

	/*
	* This function will toggle the gallery from grid to list view
	* */
	$("a.switcher").bind("click", function(e){
		e.preventDefault();

		if($(this).hasClass("grid")) {
			$(this).removeClass("grid").addClass("list");
			theproducts.removeClass("grid").addClass("list");
			$('.imagetype').show();
		}else if($(this).hasClass("list")) {
			$(this).removeClass("list").addClass("grid");
			theproducts.removeClass("list").addClass("grid");
			$('.imagetype').hide();
		}

	});

	/*
	   This function will filter the gallery images based on the search criteria if no input is given then
	   it will diplay all the images whem search button is clicked
	 */
	$( "#submit" ).click(function() {
		filter = $('input#search').val().toLowerCase();;
		if(filter == ""){
			$('ul#products > li').each(function () {
				$(this).show();
			});
		} else {
			$('ul#products > li').each(function () {
				var text = $(this).text().toLowerCase();
				(text.indexOf(filter) >= 0) ? $(this).show() : $(this).hide();
			});
		}
	});

});


/*
* This function will construct the list for gallery images
*
* */
function createGalleryList(theproducts) {

	$.each(items, function(key,value) {
		var li = $('<li/>')
			.addClass('clearfix')
			.appendTo(theproducts);
		var section = $('<section/>')
			.addClass('left')
			.appendTo(li);
		var img = $('<img/>')
			.addClass('thumb')
			.attr('Alt', 'thumb')
			.attr('src','images/'+value.path)
			.appendTo(section);
		var span = $('<span/>')
			.addClass('meta')
			.text(value.title)
			.appendTo(section);
		var type = $('<span/>')
			.attr('id', 'type')
			.addClass('imagetype')
			.text(' -- '+value.type)
			.appendTo(section);

	});
}