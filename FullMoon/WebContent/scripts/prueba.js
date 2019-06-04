$(".dropdown-toggle").on("mouseenter", function () {
    // make sure it is not shown:
    console.log("dentro titulo");
    if (!$(this).parent().hasClass("show")) {
        $(this).click();
    }
});

$(".dropdown-menu").on("mouseleave", function () {
    console.log("fuera menu");
    $(".dropdown-toggle").dropdown('hide');
});


$(document).ready(function(){
    $("#icono").click(function(){
        $(this).toggleClass("red");
    });
    $("#cambio").click(function()
    {
        location.assign("principal.html");
    })
});