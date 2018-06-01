grammar NN_Simulator;

//saltar tabs y spaces
WS : [ \t\r\n]+ -> skip; 
COMMENTS : '#' [a-zA-Z0-9 ()]* -> skip;

main_program : structure general_conf execute;

structure : input_layer hidden_layer output_layer modify_weights;

input_layer : 'input_layer' '(' float_array ')' ';';

hidden_layer : 'hidden_layers' '(' empty_array ')' ';' weights add_hidden add_function;

weights : 'weights' '(' empty_array ')' ';';

add_hidden : 'hidden_layers' '.' 'add_layer' '(' intn ')' ';' add_weights 					 			 add_hidden
		   | 
		   ;

add_weights : 'weights' '.' 'add_random_matrix' '(' intn ',' intn ')' ';';

add_function : 'hidden_layers' '[' intn ']' '.' 'function' '(' text ')' ';' add_function
			 | ; 

output_layer : 'output_layer' '(' intn ')' ';' add_weights output_function;

output_function : 'output_layer' '.' 'function' '(' text ')' ';' ;

modify_weights : 'weights' '[' intn ']' '[' intn ']' '[' intn ']' '=' flotante ';' 							modify_weights 
			|	
			; 

general_conf : epochs learning_rate
			 | ;

epochs : 'epochs' '=' intn ';'
	   |
	   ;

learning_rate : 'alpha' '=' FLOAT ';' ;

execute : train predict
		| ;

train : gradient_descent_funct gradient_descent_call
	  | ;

gradient_descent_funct : 'function' 'gradient_descent' '(' 'x' ',' 'W' ',' 								'activations' ',' 'iterations' ')' '{' block_grad '}';

block_grad : forward_propagate backward_propagate move_step;

gradient_descent_call : 'gradient_descent' '(' ')';

forward_propagate : 'layers' '=' 'join' '(' 'hidden_layers' ',' 'output_layer' 						')' ';'
					'z_1' '=' 'x' '*' 'w_1' ';'
					'a_1' '=' 'f[1]' '(' 'z_1' ')' ';'
					'for' 'i' 'in' '2...num_layers' '{'
					'z_i' '=' 'a_{i-1}' '*' 'w_i' ';'
					'a_i' '=' 'f[i]' '(' 'z_i' ')' ';'
					'}';

backward_propagate : 'loss' '=' '(' 'y' '-' 'a_{num_layers}' ')' '**' '2'
					 'for' 'j' 'in' 'num_layers...1' '{'
					 'z_i' '=' 'a_i-1' '*' 'w_2' ';'	
					 'a_i' '=' 'f[i]' '(' 'z_i' ')' ';'
					 '}' ;

move_step : 'iteration' ;

predict : predict_funct predict_call
		| ;

predict_funct : 'function' 'predict' '(' 'x' ',' 'W' ')' '{' block_predict '}';  

block_predict : 'z_1' '=' 'x' '*' 'w_1' ';'
				'a_1' '=' 'f[1]' '(' 'z_1' ')' ';'
				'for' 'i' 'in' '2...num_layers' '{'
				'z_i' '=' 'a_{i-1}' '*' 'w_i' ';'
				'a_i' '=' 'f[i]' '(' 'z_i' ')' ';'
				'}'
				'return' 'a_{num_layers}' ';' ;

predict_call : 'predict' '(' 'input_layer' ',' 'weights' ')' ';';

float_array : '[' array_elem ']' 
			| empty_array;
array_elem : FLOAT
	  	   | FLOAT ',' array_elem ;

empty_array : '[' ']';

intn : INT ;

text : STRING ;

flotante : FLOAT ;

INT : [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+ ;
STRING : '"'  [a-zA-Z0-9]+ '"';