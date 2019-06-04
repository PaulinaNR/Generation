flagLogin = true;
var xhr = new XMLHttpRequest();
var clause = 0;
var paginas = [];
var idFotos = ["#foto1", "#foto2", "#foto3", "#foto4", "#foto5", "#foto6", "#foto7", "#foto8"];
var idNombre = ["#nombre1", "#nombre2", "#nombre3", "#nombre4", "#nombre5", "#nombre6", "#nombre7", "#nombre8"];
var idPrecio = ["#precio1", "#precio2", "#precio3", "#precio4", "#precio5", "#precio6", "#precio7", "#precio8"];




function callback()
{
    if(xhr.status == 200)
    {

        miCadenaObj = JSON.parse(xhr.responseText);
        paginas = JSON.parse(xhr.responseText);
        console.log(paginas);
    }
}



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
    xhr.open("GET", "productosServlet");
    xhr.onload = callback;
    xhr.send(null);
    $(".page-link").click(function()
    {
        clause = 0;
        var num = parseInt($(this).text());
        paginas[num-1].forEach(funPages);
    }
    )
    console.log("entro");
    $("#cart").on("click",function()
    {
        console.log("entra");
        location.replace("carrito.html");
    });
    
    function funPages(value, index, array)
    {
        var imagen = "images/" + value.uri + ".JPG";
        $(idFotos[clause]).attr("src", imagen);
        $(idNombre[clause]).text(value.nombre);
        $(idPrecio[clause]).text(value.precio);
        console.log(imagen);
        console.log(index);
        console.log(clause);
        clause++;
    }
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




