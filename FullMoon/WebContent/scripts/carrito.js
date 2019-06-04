var xhr = new XMLHttpRequest();
var paginas = [];
var articulo;
var titulo;
var precios = [];
var idFotos = ["#foto1", "#foto2", "#foto3", "#foto4", "#foto5", "#foto6", "#foto7", "#foto8"];
var idNombre = ["#nombre1", "#nombre2", "#nombre3", "#nombre4", "#nombre5", "#nombre6", "#nombre7", "#nombre8"];
var idPrecio = ["#precio1", "#precio2", "#precio3", "#precio4", "#precio5", "#precio6", "#precio7", "#precio8"];
var idArticulo = ["#articulo1", "#articulo2", "#articulo3", "#articulo4", "#articulo5", "#articulo6", "#articulo7", "#articulo8"];
var total=0;

$(document).ready(function(){
    idArticulo.forEach(element=>{
        $(element).hide();
    })
    xhr.open("GET", "CarritoServlet");
    xhr.onload = callback;
    xhr.send(null);
    
    $(".btnDelete").click(function()
    {
        $(idArticulo[parseInt($(this).attr("value"))-1]).hide();
         total-=$(idPrecio[parseInt($(this).attr("value"))-1]).text().replace("$","");
         $("#total").text("$"+total);
    });

    $(".btnBuy").click(pagar);

    $(".cant").change(function(){
        console.log($(this).attr("value"));
    });


  });


function callback()
{
    if(xhr.status == 200)
    {
        paginas = JSON.parse(xhr.responseText);
        if(paginas.length>0)
        { 
            articulo = $("#articulo1").html();
            paginas.forEach(listaVentas);
        }

    }

    function listaVentas(value, index, array)
    {
         $(idArticulo[index]).show();
         $(idNombre[index]).html(value[0]);
         $(idPrecio[index]).html(value[1]);
         $(idFotos[index]).attr("src", "images/" + value[3] + ".JPG");
         total+=parseInt(value[1].replace("$",""));
         precios.push(parseInt(value[1].replace("$","")));
        console.log(precios);
        console.log(paginas);
         $("#total").text("$"+total);
    }
}

function pagar()
{
    var miFormulario = new FormData();
    miFormulario.append("total", total);
    xhr.open("POST", "PagarServlet", true);
    xhr.onload = function()
    {
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);
        location.assign("principal.html");
    }
    };
    xhr.send(miFormulario);
}
