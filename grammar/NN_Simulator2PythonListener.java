// Generated from NN_Simulator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class NN_Simulator2PythonListener extends NN_SimulatorBaseListener {
	NN_SimulatorParser parser;
	
	public NN_Simulator2PythonListener (NN_SimulatorParser parser) {this.parser = parser;}
	
	@Override
	public void enterMain_program(NN_SimulatorParser.Main_programContext ctx){
		System.out.println("import numpy as np");
		System.out.println();
		System.out.println("#Activation functions");
		System.out.println("def sigm(x, derivative=False):");
		System.out.println("\ty = 1.0/(1+np.exp(-x))");
		System.out.println("\tif derivative == False: return y");
		System.out.println("\telse: return y * (1 - y)");
		System.out.println();
		System.out.println("def relu(x, derivative=False):");
		System.out.println("\tif derivative == False: return np.maximum(0,x)");
		System.out.println("\telse: return 0 if x < 0 else 1");
		System.out.println();
		System.out.println("def tanh(x, derivative=False):");
		System.out.println("\ty = np.tanh(x)");
		System.out.println("\tif derivative == False: return y");
		System.out.println("\telse: return 1 - y**2");
		System.out.println();
	}
		
	@Override
	public void enterStructure(NN_SimulatorParser.StructureContext ctx){
		System.out.println("#Activation function per layer");
		System.out.println("f = []");
		System.out.println();
	}


	@Override
	public void enterInput_layer(NN_SimulatorParser.Input_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String floatArray = tokens.getText(ctx.float_array());
		System.out.println("#Input layer definition");
		System.out.println("input_layer = np.array([" + floatArray + "])");
		System.out.println();
	}

	@Override
	public void enterHidden_layer(NN_SimulatorParser.Hidden_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String emptyArray = tokens.getText(ctx.empty_array());
		System.out.println("#Creation of hidden_layers vector");
		System.out.println("hidden_layers = " + emptyArray);
		System.out.println();
	}

	@Override
	public void enterWeights(NN_SimulatorParser.WeightsContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String emptyArray = tokens.getText(ctx.empty_array());
		System.out.println("#Creation of weight matrices per layer");
		System.out.println("W = " + emptyArray);
		System.out.println("");
	}

	@Override
	public void enterAdd_hidden(NN_SimulatorParser.Add_hiddenContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.intn() != null){
			String integer = tokens.getText(ctx.intn());
			System.out.println("#Adding a layer");
			System.out.println("hidden_layers.append(" + integer + ")");
			System.out.println("f.append('sigm')");
		}
	}

	@Override
	public void enterAdd_weights(NN_SimulatorParser.Add_weightsContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String integer1 = tokens.getText(ctx.intn().get(0));
		String integer2 = tokens.getText(ctx.intn().get(1));
		System.out.println("#Adding the weight matrix for new layer");
		System.out.println("W.append(np.random.randn("+integer1+","+integer2+"))");
		System.out.println();
	}

	@Override
	public void enterAdd_function(NN_SimulatorParser.Add_functionContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.intn() != null){
			String integer = tokens.getText(ctx.intn());
			String text = tokens.getText(ctx.text());
			int true_int = Integer.parseInt(integer) - 1;
			System.out.println("#Changing activation function of a layer");
			System.out.println("f["+Integer.toString(true_int)+"] = " + text);
			System.out.println();
		}
	}

	@Override
	public void enterOutput_layer(NN_SimulatorParser.Output_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.intn() != null){
			String integer = tokens.getText(ctx.intn());
			System.out.println("#Creating output layer and adding to layers array");
			System.out.println("layers = hidden_layers[:]");
			System.out.println("output_layer = [" + integer + "]");
			System.out.println("layers = layers + output_layer");
			System.out.println("f.append('sigm')");
			System.out.println();
		}
	}

	@Override
	public void enterOutput_function(NN_SimulatorParser.Output_functionContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.text() != null){
			String text = tokens.getText(ctx.text());
			System.out.println("#Changing activation function ");
			System.out.println("f[-1] = " + text);
			System.out.println();
		}
	}

	@Override
	public void enterModify_weights(NN_SimulatorParser.Modify_weightsContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.flotante() != null){
		String integer1 = tokens.getText(ctx.intn().get(0));
		String integer2 = tokens.getText(ctx.intn().get(1));
		String integer3 = tokens.getText(ctx.intn().get(2));
		String floatp = tokens.getText(ctx.flotante());
		int true_int1 = Integer.parseInt(integer1) - 1;
		int true_int2 = Integer.parseInt(integer2) - 1;
		int true_int3 = Integer.parseInt(integer3) - 1;
		System.out.println("#Modifying a weight connection");
		System.out.println("W["+Integer.toString(true_int1)+"]["+
			Integer.toString(true_int2)+"]["+Integer.toString(true_int3)+"] = " + floatp);
		}	
	}

	@Override
	public void enterEpochs(NN_SimulatorParser.EpochsContext ctx){
		System.out.println();
		TokenStream tokens = parser.getTokenStream();
		if(ctx.intn() != null){
			String integer = tokens.getText(ctx.intn());
			System.out.println("#Number of epochs for training");
			System.out.println("epochs = " + integer);
		}
	}

	public void enterLearning_rate(NN_SimulatorParser.Learning_rateContext ctx){
		if(ctx.FLOAT() != null){
			System.out.println("#Learning rate for training");
			System.out.println("alpha = " + ctx.FLOAT());
			System.out.println();
		}
	}

	public void enterPredict(NN_SimulatorParser.PredictContext ctx){
		System.out.println("\n#Section for predictions");
	}

	public void enterPredict_funct(NN_SimulatorParser.Predict_functContext ctx){
		System.out.println("def predict(x, W):");
	}

	public void enterBlock_predict(NN_SimulatorParser.Block_predictContext ctx){
		System.out.println("\tz = [0 for i in range(len(layers))]");
		System.out.println("\ta = [0 for i in range(len(layers))]");
		System.out.println("\tz[0] = np.dot(x, W[0])");
		System.out.println("\tf0 = eval(f[0])");
		System.out.println("\ta[0] = f0(z[0])");
		System.out.println("\tfor i in range(1,len(layers)):");
		System.out.println("\t\tz[i] = np.dot(a[i-1], W[i])");
		System.out.println("\t\tfi = eval(f[i])");
		System.out.println("\t\ta[i] = fi(z[i])");
		System.out.println("\treturn a[-1]");
		System.out.println();
	}

	public void enterPredict_call(NN_SimulatorParser.Predict_callContext ctx){
		System.out.println("y = predict(input_layer, W)");
		System.out.println("print y");
	}
}