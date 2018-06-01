grammar NN_Simulator;

//saltar tabs y spaces
WS : [ \t\r\n]+ -> skip;
COMMENTS : '#' [a-zA-Z0-9 ()]* -> skip;

main_program : structure general_conf execute;

structure : input_layer hidden_layer output_layer;

input_layer : 'input_layer' '(' float_array ')' ';';

hidden_layer : 'hidden_layers' '(' empty_array ')' ';' weights add_hidden;

weights : 'weights' '(' empty_array ')' ';';

add_hidden : 'hidden_layers' '.' 'add_layer' '(' INT ')' ';' add_weights 					 add_function
		   |
		   ;

add_weights : 'weights' '.' 'add_random_matrix' '(' INT ',' INT ')' ';';

add_function : 'hidden_layers' '.' 'function' '(' STRING ')' ';' add_hidden
			 | add_hidden ;

output_layer : 'output_layer' '(' INT ')' ';' output_conf;

output_conf : output_function
			| output_error
			| ;

output_function : 'output_layer' '.' 'function' '(' STRING ')' ';' ;

output_error : 'output_layer' '.' 'error' '(' STRING ')' ';' ;


general_conf : epochs
			 | learning_rate
			 | ;

epochs : 'epochs' '=' INT ;

learning_rate : 'alpha' '=' FLOAT ;

execute : train predict
		| ;

train : gradient_descent_funct gradient_descent_call
	  | ;

gradient_descent_funct : 'function' 'gradient_descent' '(' 'x' ',' 'W' ',' 					'activations' ',' 'iterations' ')' '{' block_grad '}';

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

predict_funct : 'function' 'predict' '(' 'x' ',' 'W' ',' 'activations' ')' '{' block_predict '}';

block_predict : 'layers' '=' 'join' '(' 'hidden_layers' ',' 'output_layer' ')' ';'
				'z_1' '=' 'x' '*' 'w_1' ';'
				'a_1' '=' 'f[1]' '(' 'z_1' ')' ';'
				'for' 'i' 'in' '2...num_layers' '{'
				'z_i' '=' 'a_{i-1}' '*' 'w_2' ';'
				'a_i' '=' 'f[i]' '(' 'z_i' ')' ';'
				'}'
				'return' 'a_{num_layers}';

predict_call : 'predict' '(' 'input_layer' ',' 'weights' ',' 'activationS' ')' 				';';

float_array : '[' array_elem ']'
			| empty_array;
array_elem : FLOAT
	  	   | FLOAT ',' array_elem ;

empty_array : '[' ']';

INT : [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+ ;
STRING : '"'  [a-zA-Z0-9=: ]* '"';
