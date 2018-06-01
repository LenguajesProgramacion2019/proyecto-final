Este proyecto consta de dos etapas:
1. Interfaz gráfica.
2. Traductor de pseudocódigo a python.


Interfaz gráfica  
Traductor de pseudocódigo a python


Para empezar se implementó de ceros una gramática para un lenguaje de propósito específico, tal lenguaje es de alto nivel creado para describir redes neuronales. (grammar/NN_Simulator.g4 )


Luego se hizo un traductor mediante listeners de este lenguaje a python. (NN_Simulator2PythonListener y NN_Simulator2PythonTools)


Los casos de prueba están en la carpeta grammar nombrados como test*.txt


Para cambiar de caso de prueba hay que ir al archivo NN_Simulator2PythonTools y en la línea 20 se configura el inputfile.