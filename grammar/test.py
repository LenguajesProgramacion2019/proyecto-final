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

#Number of epochs for training
epochs = 15
#Learning rate for training
alpha = 0.05

#Section for predictions
def predict(x, W):
	z = [0 for i in range(len(layers))]
	a = [0 for i in range(len(layers))]
	z[0] = np.dot(x, W[0])
	f0 = eval(f[0])
	a[0] = f0(z[0])
	for i in range(1,len(layers)):
		z[i] = np.dot(a[i-1], W[i])
		fi = eval(f[i])
		a[i] = fi(z[i])
	return a[-1]

y = predict(input_layer, W)
print y
