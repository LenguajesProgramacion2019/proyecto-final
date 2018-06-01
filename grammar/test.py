import numpy as np

#Activation functions
def sigm(x, derivative=False):
	y = 1.0/(1+np.exp(-x))
	if derivative == False: return y
	else: return y * (1 - y)

def relu(x, derivative=False):
	if derivative == False: return np.maximum(0,x)
	else: return 0 if x < 0 else 1

def tanh(x, derivative=False):
	y = np.tanh(x)
	if derivative == False: return y
	else: return 1 - y**2

#Activation function per layer
f = []

#Input layer definition
input_layer = np.array([[0.6,0.05,0.05,0.1,0.2]])

#Creation of hidden_layers vector
hidden_layers = []

#Creation of weight matrices per layer
W = []

#Adding a layer
hidden_layers.append(4)
f.append('sigm')
#Adding the weight matrix for new layer
W.append(np.random.randn(5,4))

#Adding a layer
hidden_layers.append(2)
f.append('sigm')
#Adding the weight matrix for new layer
W.append(np.random.randn(4,2))

#Adding a layer
hidden_layers.append(3)
f.append('sigm')
#Adding the weight matrix for new layer
W.append(np.random.randn(2,3))

#Changing activation function of a layer
f[0] = "tanh"

#Changing activation function of a layer
f[1] = "relu"

#Changing activation function of a layer
f[2] = "sigm"

#Creating output layer and adding to layers array
layers = hidden_layers[:]
output_layer = [6]
layers = layers + output_layer
f.append('sigm')

#Adding the weight matrix for new layer
W.append(np.random.randn(3,6))

#Changing activation function 
f[-1] = "sigm"

#Modifying weights vector
W[0][1][1] = 200.0

