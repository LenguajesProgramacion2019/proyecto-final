var input_text = [];
var iter_1;
var iter_2;
var cont_1=1;
var cont_2=1;
var layer = 1;

$(document).ready(function(){

  var input_layers = 0;
  var hidden_layers = 0;
  var num_hidden = 1;
  var radio = 10;
  var svgns = "http://www.w3.org/2000/svg";
  $( "#input" ).click(function() {
    input_layers = prompt("Enter the number of input layers (1 <= n <= 10)", "n");
    for(i=0; i<input_layers; i++){
      $('#input-circles').append('<input id="input' + i +'" type="number" class="input-input" value="0" onblur="in_text(this)" step="0.01" maxlength="4" size="4" min="0" max="1">');
      input_text.push("0");
    }
    $('#input-text').empty();
    $('#input-text').append("input_layer([" + input_text + "]);");
    iter_2 = input_layers;
  });



  $( "#hidden" ).click(function() {
    hidden_layers = prompt("Enter the number of hidden layers (? < n < ?)", "n");
    var id_0 = "#hidden" + num_hidden + "-circles";
    var id_1 = "edges" + num_hidden;
    for(i=0; i<hidden_layers; i++){
      $(id_0).append('<input type="text" class="input-hidden" onblur="layer'+num_hidden+'_func(this)" step="0.01" maxlength="4" size="4" min="0" max="1">');
    }

    iter_1 = iter_2;
    iter_2 = hidden_layers;
    cont_1=1;
    cont_2=1;

    for(var k=0; k<iter_1; k++){
      for(var j=0; j<iter_2; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 0);
        line.setAttributeNS(null, 'y1', 35+(70*k));
        line.setAttributeNS(null, 'x2', 70);
        line.setAttributeNS(null, 'y2', 35+(70*j));
        line.setAttributeNS(null, 'onclick', 'add_weight()');
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 3px;' );
        document.getElementById(id_1).appendChild(line);
      }
    }

    if(num_hidden == 4){
      $("#hidden").prop('disabled', true);
    }

    $('#hidden-text').append("hidden_layers.add_layer(" + hidden_layers + ");<br/>");
    $('#hidden-text').append("weights.add_random_matrix("+ iter_1 + "," + iter_2 +");<br/>");
    num_hidden += 1;

  });

  $( "#output" ).click(function() {
    var id_0 = "#hidden" + num_hidden + "-circles";
    var id_1 = "edges" + num_hidden;

    output_layers = prompt("Enter the number of output layers (1 <= n <= 10)", "n");
    for(i=0; i<output_layers; i++){
      $(id_0).append('<input type="text" class="output-hidden" onblur="output_func(this)" step="0.01" maxlength="4" size="4" min="0" max="1">');
    }

    iter_1 = hidden_layers;
    iter_2 = output_layers;
    cont_1 = 1;
    cont_2 = 1;

    for(i=0; i<hidden_layers; i++){
      for(j=0; j<output_layers; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 0);
        line.setAttributeNS(null, 'y1', 35+(70*i));
        line.setAttributeNS(null, 'x2', 70);
        line.setAttributeNS(null, 'y2', 35+(70*j));
        line.setAttributeNS(null, 'onclick', 'add_weight()');
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 3px;' );
        document.getElementById(id_1).appendChild(line);
      }
    }
    $('#output-text').append("weights.add_random_matrix("+ hidden_layers + "," + output_layers +");<br/>");
  });

  $( "#predict" ).click(function() {
    $('#predict-text').append("function predict(x, W){<br/>" +
                              "  z_1 = x * w_1;<br/>" +
                              "  a_1 = f[1] ( z_1 );<br/>" +
                              "  for i in 2...num_layers{<br/>" +
                              "    z_i = a_{i-1} * w_i;<br/>" +
                              "   	a_i = f[i] ( z_i );<br/>" +
                              "  }<br/>" +
                              "  return a_{num_layers};<br/>" +
                              "}<br/><br/>" +
                              "predict(input_layer, weights);<br/>")
  });

});

function in_text(a) {
  if(String(a.id) == "input0"){
    input_text[0] = a.value;
  }
  else if(String(a.id) == "input1"){
    input_text[1] = a.value;
  }
  else if(String(a.id) == "input2"){
    input_text[2] = a.value;
  }
  else if(String(a.id) == "input3"){
    input_text[3] = a.value;
  }
  else if(String(a.id) == "input4"){
    input_text[4] = a.value;
  }
  else if(String(a.id) == "input5"){
    input_text[5] = a.value;
  }
  else if(String(a.id) == "input6"){
    input_text[6] = a.value;
  }
  else if(String(a.id) == "input7"){
    input_text[7] = a.value;
  }
  else if(String(a.id) == "input8"){
    input_text[8] = a.value;
  }
  else if(String(a.id) == "input9"){
    input_text[9] = a.value;
  }
  else if(String(a.id) == "input10"){
    input_text[10] = a.value;
  }
  document.getElementById("input-text").innerHTML="";
  document.getElementById("input-text").innerHTML="input_layer([" + input_text + "])";
}

function layer1_func(a){
  $('#hidden-text').append("hidden_layers[1].function(\"" + a.value + "\");<br/>");
}
function layer2_func(a){
  $('#hidden-text').append("hidden_layers[2].function(\"" + a.value + "\");<br/>");
}
function layer3_func(a){
  $('#hidden-text').append("hidden_layers[3].function(\"" + a.value + "\");<br/>");
}
function layer4_func(a){
  $('#hidden-text').append("hidden_layers[4].function(\"" + a.value + "\");<br/>");
}

function output_func(a){
  $('#output-text').append("output_layer.function(\"" + a.value + "\");<br/>");
}

function add_weight(){
  var weight = prompt("Enter the weight", "n");
  $('#weights').append("weights["+ layer +"]["+ cont_1 +"]["+ cont_2 +"] = "+ weight +";<br/>");
  if(cont_2 == iter_2){
    cont_2 = 0;
    cont_1 ++;
  }
  if(cont_1 >= iter_1*iter_2){
    cont_1 = 1;
    cont_2 = 0;
    layer++;
  }
  cont_2++;
}



function PreviewText() {
	var oFReader = new FileReader();
  var long = document.getElementById("uploadText").files[0].name.length;
	oFReader.readAsDataURL(document.getElementById("uploadText").files[0]);
	oFReader.onload = function (oFREvent) {
    document.getElementById("uploadTextValue").value = oFREvent.target.result;
		document.getElementById("obj").data = oFREvent.target.result;
    document.getElementById("input-text").innerHTML = "";
    document.getElementById("input-text").innerHTML = "input_layer(" + document.getElementById("uploadText").files[0].name.substring(0, long-4) + ");";
	};
};
