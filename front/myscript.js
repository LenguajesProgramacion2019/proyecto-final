$(document).ready(function(){

  var input_layers = 0;
  var hidden_layers = 0;
  var num_hidden = 1;
  var radio = 10;
  var svgns = "http://www.w3.org/2000/svg";
  var iter_1;
  var iter_2;

  $( "#input" ).click(function() {
    input_layers = prompt("Enter the number of input layers (? < n < ?)", "n");

    for(i=0; i<input_layers; i++){
      $('#input-circles').append('<input id="input' + i +'" type="number" class="input-input" step="0.01" maxlength="4" size="4" min="0" max="1">');
    }

    iter_2 = input_layers;
  });



  $( "#hidden" ).click(function() {
    hidden_layers = prompt("Enter the number of input layers (0 < n < 12)", "n");
    var id_0 = "#hidden" + num_hidden + "-circles";
    var id_1 = "edges" + num_hidden;

    for(i=0; i<hidden_layers; i++){
      $(id_0).append('<input id="input' + i +'" type="number" class="input-hidden" step="0.01" maxlength="4" size="4" min="0" max="1">');
    }
    iter_1 = iter_2;
    iter_2 = hidden_layers;
    for(i=0; i<iter_1; i++){
      for(j=0; j<iter_2; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 0);
        line.setAttributeNS(null, 'y1', 35+(70*i));
        line.setAttributeNS(null, 'x2', 70);
        line.setAttributeNS(null, 'y2', 35+(70*j));
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 2px;' );
        document.getElementById(id_1).appendChild(line);
      }
    }

    num_hidden += 1;
  });

  $( "#output" ).click(function() {
    var id_0 = "#hidden" + num_hidden + "-circles";
    var id_1 = "edges" + num_hidden;

    output_layers = prompt("Enter the number of output layers (? < n < ?)", "n");
    for(i=0; i<output_layers; i++){
      $(id_0).append('<input id="input' + i +'" type="number" class="output-hidden" step="0.01" maxlength="4" size="4" min="0" max="1" readonly>');
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
