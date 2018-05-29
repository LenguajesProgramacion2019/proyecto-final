$(document).ready(function(){

  var input_layers = 0;
  var hidden_layers = 0;
  var num_hidden = 0;
  var radio = 10;
  var svgns = "http://www.w3.org/2000/svg";
  var iter_1;
  var iter_2;

  $( "#input" ).click(function() {
    input_layers = prompt("Enter the number of input layers (0 < n < 10)", "n");

    for(i=0; i<input_layers; i++){
      var circle = document.createElementNS(svgns, 'circle');
      circle.setAttributeNS(null, 'cx', 15);
      circle.setAttributeNS(null, 'cy', 15+(30*i));
      circle.setAttributeNS(null, 'r', radio);
      circle.setAttributeNS(null, 'style', 'fill: #17FFFB; stroke: black; stroke-width: 2px;' );
      document.getElementById("network").appendChild(circle);
      
      $('#options').append('<input id="input' + i +'" type="number" class="input-input" step="0.01" maxlength="4" size="4" min="0" max="1">');
    }

    iter_2 = input_layers;
  });



  $( "#hidden" ).click(function() {
    hidden_layers = prompt("Enter the number of input layers (0 < n < 12)", "n");
    for(i=0; i<hidden_layers; i++){
      var circle = document.createElementNS(svgns, 'circle');
      circle.setAttributeNS(null, 'cx', 45+(30*num_hidden));
      circle.setAttributeNS(null, 'cy', 30+(30*i));
      circle.setAttributeNS(null, 'r', radio);
      circle.setAttributeNS(null, 'style', 'fill: #E89D0C; stroke: black; stroke-width: 2px;' );
      document.getElementById("network").appendChild(circle);
    }

    iter_1 = iter_2;
    iter_2 = hidden_layers;
    if(num_hidden === 0){
      start = 15;
    }else{
      start = 30;
    }
    for(i=0; i<iter_1; i++){
      for(j=0; j<iter_2; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 15+(num_hidden*30)+10);
        line.setAttributeNS(null, 'y1', start+(30*i));
        line.setAttributeNS(null, 'x2', 35+(num_hidden*30));
        line.setAttributeNS(null, 'y2', 30+(30*j));
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 2px;' );
        document.getElementById("network").appendChild(line);
      }
    }

    num_hidden += 1;
  });

  $( "#output" ).click(function() {
    output_layers = prompt("Enter the number of input layers (0 < n < 12)", "n");
    for(i=0; i<output_layers; i++){
      var circle = document.createElementNS(svgns, 'circle');
      circle.setAttributeNS(null, 'cx', 45+(num_hidden*30));
      circle.setAttributeNS(null, 'cy', 15+(30*i));
      circle.setAttributeNS(null, 'r', radio);
      circle.setAttributeNS(null, 'style', 'fill: #84FF01; stroke: black; stroke-width: 2px;' );
      document.getElementById("network").appendChild(circle);
    }

    for(i=0; i<hidden_layers; i++){
      for(j=0; j<output_layers; j++){
        var line = document.createElementNS(svgns,'line');
        line.setAttributeNS(null, 'x1', 15+(num_hidden*30)+10);
        line.setAttributeNS(null, 'y1', 30+(30*i));
        line.setAttributeNS(null, 'x2', 35+(num_hidden*30));
        line.setAttributeNS(null, 'y2', 15+(30*j));
        line.setAttributeNS(null, 'style', 'stroke: black; stroke-width: 2px;' );
        document.getElementById("network").appendChild(line);
      }
    }
  });

});
