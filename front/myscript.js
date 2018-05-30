var input_text = [];
$(document).ready(function(){

  var input_layers = 0;
  var hidden_layers = 0;
  var num_hidden = 1;
  var radio = 10;
  var svgns = "http://www.w3.org/2000/svg";
  var iter_1;
  var iter_2;

  $( "#input" ).click(function() {
    input_layers = prompt("Enter the number of input layers (1 <= n <= 10)", "n");
    for(i=0; i<input_layers; i++){
      $('#input-circles').append('<input id="input' + i +'" type="number" class="input-input" value="0" onblur="in_text(this)" step="0.01" maxlength="4" size="4" min="0" max="1">');
      input_text.push("0");
    }
    $('#input-text').empty();
    $('#input-text').append("input_layer([" + input_text + "])");
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
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 2px;' );
        document.getElementById(id_1).appendChild(line);
      }
    }

    if(num_hidden == 4){
      $("#hidden").prop('disabled', true);
    }

    $('#hidden-text').append("hidden.add_layer(" + hidden_layers + ")<br/>");
    $('#hidden-text').append("weights.add_random_matrix("+ iter_2 + "," + iter_1 +")");
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

  $( "input" ).click(function() {
    alert("0");
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
  $('#hidden-text').append("hidden_layers[1].add_function(" + a.value + ")<br/>");
}
function layer2_func(a){
  $('#hidden-text').append("hidden_layers[2].add_function(" + a.value + ")<br/>");
}
function layer3_func(a){
  $('#hidden-text').append("hidden_layers[3].add_function(" + a.value + ")<br/>");
}
function layer4_func(a){
  $('#hidden-text').append("hidden_layers[4].add_function(" + a.value + ")<br/>");
}
