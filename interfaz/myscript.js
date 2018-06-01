var input_text = [];
var iter_1;
var iter_2;

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
    for(var k=0; k<iter_1; k++){
      for(var j=0; j<iter_2; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 0);
        line.setAttributeNS(null, 'y1', 35+(70*k));
        line.setAttributeNS(null, 'x2', 70);
        line.setAttributeNS(null, 'y2', 35+(70*j));
        line.setAttributeNS(null, 'onclick', 'add_weight()');
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 2px;' );
        document.getElementById(id_1).appendChild(line);
      }
    }

    if(num_hidden == 4){
      $("#hidden").prop('disabled', true);
    }

    $('#hidden-text').append("hidden_layers.add_layer(" + hidden_layers + ");<br/>");
    $('#hidden-text').append("weights.add_random_matrix("+ iter_2 + "," + iter_1 +");<br/>");
    num_hidden += 1;

  });

  $( "#output" ).click(function() {
    var id_0 = "#hidden" + num_hidden + "-circles";
    var id_1 = "edges" + num_hidden;

    output_layers = prompt("Enter the number of output layers (1 <= n <= 10)", "n");
    for(i=0; i<output_layers; i++){
      $(id_0).append('<input type="text" class="output-hidden" step="0.01" maxlength="4" size="4" min="0" max="1">');
    }

    for(i=0; i<hidden_layers; i++){
      for(j=0; j<output_layers; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 0);
        line.setAttributeNS(null, 'y1', 35+(70*i));
        line.setAttributeNS(null, 'x2', 70);
        line.setAttributeNS(null, 'y2', 35+(70*j));
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 2px;' );
        document.getElementById(id_1).appendChild(line);
      }
    }
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

var x=0;
var y=0;
function add_weight(){
  var weight = prompt("Enter the weight", "n");
  if(y == iter_2){
    console.log(iter_2);
    y = 0;
    x ++;
  }
  else if(x == iter_1-1){
    x = 0;
    y = 0;
  }
  console.log(x);
  console.log(y);
  y++;
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
