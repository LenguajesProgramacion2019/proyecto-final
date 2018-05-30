// Generated from NN_Simulator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class NN_Simulator2PythonListener extends NN_SimulatorBaseListener {
	NN_SimulatorParser parser;
	
	public NN_Simulator2PythonListener (NN_SimulatorParser parser) {this.parser = parser;}
	
	@Override
	public void enterMain_program(NN_SimulatorParser.Main_programContext ctx){
		System.out.println("import numpy as np");
	}
		
	@Override
	public void enterInput_layer(NN_SimulatorParser.Input_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String floatArray = tokens.getText(ctx.float_array());
		System.out.println("input_layer = np.array(" + floatArray + ")");
	}

	@Override
	public void enterHidden_layer(NN_SimulatorParser.Hidden_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String emptyArray = tokens.getText(ctx.empty_array());
		System.out.println("hidden_layers = " + emptyArray);
	}

	@Override
	public void enterWeights(NN_SimulatorParser.WeightsContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String emptyArray = tokens.getText(ctx.empty_array());
		System.out.println("W = " + emptyArray);	
	}

	@Override
	public void enterAdd_hidden(NN_SimulatorParser.Add_hiddenContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.INT() != null){
			System.out.println("hidden_layers.append(" + ctx.INT() + ")");
		}
	}
	
}