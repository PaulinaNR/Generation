flagLogin = false;
$(".dropdown-toggle").on("mouseenter", function () {
    // make sure it is not shown:
    if (!$(this).parent().hasClass("show")) {
        $(this).click();
    }
});

$(".dropdown-menu").on("mouseleave", function () {
    console.log("fuera menu");
    $(".dropdown-toggle").dropdown('hide');
});

function myFunction()
{
    console.log("hola");
}

$(document).ready(function(){
    $(".heartMenu").click(function(){
        if(flagLogin==true)
        {
            $("#modalLRForm").modal("hide");
            console.log("hl");
            $(this).toggleClass("red");
        }
        else{
            $("#modalLRForm").modal("show");
        }
    });
    
    $(".carMenu").click(function(){
        if(flagLogin==true)
        {
            $("#modalLRForm").modal("hide");
            console.log("hl");
            $(this).toggleClass("blue");
        }
        else{
            $("#modalLRForm").modal("show");
        }
    });
    
    $("#login").click(function(){
        flagLogin=true;
        $("#modalLRForm").modal("hide");
    });


    $("#cambio").click(function()
    {
        location.assign("principal.html");
    })
});