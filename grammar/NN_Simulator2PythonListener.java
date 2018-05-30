// Generated from NN_Simulator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class NN_Simulator2PythonListener extends NN_SimulatorListener {
	NN_SimulatorParser parser;

	@override
	void enterMain_program(NN_SimulatorParser.Main_programContext ctx){
		System.out.println("import numpy as np");
	}
	
	@override
	void exitMain_program(NN_SimulatorParser.Main_programContext ctx){}
	
	@override
	void enterStructure(NN_SimulatorParser.StructureContext ctx){}
	
	@override
	void exitStructure(NN_SimulatorParser.StructureContext ctx){}
	
	@override
	void enterInput_layer(NN_SimulatorParser.Input_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String floatArray = tokens.getText(ctx.float_array());
		System.out.println("input_layer = np.array(" + floatArray + ")");
	}

	@override
	void exitInput_layer(NN_SimulatorParser.Input_layerContext ctx){}

	@override
	void enterHidden_layer(NN_SimulatorParser.Hidden_layerContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String emptyArray = tokens.getText(ctx.empty_array());
		System.out.println("hidden_layers = " + emptyArray);
	}

	@override
	void exitHidden_layer(NN_SimulatorParser.Hidden_layerContext ctx){}

	@override
	void enterWeights(NN_SimulatorParser.WeightsContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String emptyArray = tokens.getText(ctx.empty_array());
		System.out.println("W = " + emptyArray);	
	}

	@override
	void exitWeights(NN_SimulatorParser.WeightsContext ctx){}
	
	@override
	void enterAdd_hidden(NN_SimulatorParser.Add_hiddenContext ctx){
		TokenStream tokens = parser.getTokenStream();
		if(ctx.INT() != null){
			System.out.println("hidden_layers.append(" + INT() + ")");
		}
	}

	@override
	void exitAdd_hidden(NN_SimulatorParser.Add_hiddenContext ctx){}

	@override
	void enterAdd_weights(NN_SimulatorParser.Add_weightsContext ctx){
		
	}
	
	@override
	void exitAdd_weights(NN_SimulatorParser.Add_weightsContext ctx){}

	@override
	void enterAdd_function(NN_SimulatorParser.Add_functionContext ctx){}
	
	@override
	void exitAdd_function(NN_SimulatorParser.Add_functionContext ctx){}

	@override
	void enterOutput_layer(NN_SimulatorParser.Output_layerContext ctx){}
	
	@override
	void exitOutput_layer(NN_SimulatorParser.Output_layerContext ctx){}

	@override
	void enterOutput_conf(NN_SimulatorParser.Output_confContext ctx){}
	
	@override
	void exitOutput_conf(NN_SimulatorParser.Output_confContext ctx){}

	@override
	void enterOutput_function(NN_SimulatorParser.Output_functionContext ctx){}
	
	@override
	void exitOutput_function(NN_SimulatorParser.Output_functionContext ctx){}

	@override
	void enterOutput_error(NN_SimulatorParser.Output_errorContext ctx){}
	
	void exitOutput_error(NN_SimulatorParser.Output_errorContext ctx){}

	void enterGeneral_conf(NN_SimulatorParser.General_confContext ctx){}

	void exitGeneral_conf(NN_SimulatorParser.General_confContext ctx){}
	
	void enterEpochs(NN_SimulatorParser.EpochsContext ctx){}

	void exitEpochs(NN_SimulatorParser.EpochsContext ctx){}
	
	void enterLearning_rate(NN_SimulatorParser.Learning_rateContext ctx){}

	void exitLearning_rate(NN_SimulatorParser.Learning_rateContext ctx){}
	
	void enterExecute(NN_SimulatorParser.ExecuteContext ctx){}
	
	void exitExecute(NN_SimulatorParser.ExecuteContext ctx){}

	void enterTrain(NN_SimulatorParser.TrainContext ctx){}

	void exitTrain(NN_SimulatorParser.TrainContext ctx){}
	
	void enterGradient_descent_funct(NN_SimulatorParser.Gradient_descent_functContext ctx){}

	void exitGradient_descent_funct(NN_SimulatorParser.Gradient_descent_functContext ctx){}
	
	void enterBlock_grad(NN_SimulatorParser.Block_gradContext ctx){}

	void exitBlock_grad(NN_SimulatorParser.Block_gradContext ctx){}
	
	void enterGradient_descent_call(NN_SimulatorParser.Gradient_descent_callContext ctx){}
	
	void exitGradient_descent_call(NN_SimulatorParser.Gradient_descent_callContext ctx){}
	
	void enterForward_propagate(NN_SimulatorParser.Forward_propagateContext ctx){}

	void exitForward_propagate(NN_SimulatorParser.Forward_propagateContext ctx){}
	
	void enterBackward_propagate(NN_SimulatorParser.Backward_propagateContext ctx){}
	
	void exitBackward_propagate(NN_SimulatorParser.Backward_propagateContext ctx){}

	void enterMove_step(NN_SimulatorParser.Move_stepContext ctx){}

	void exitMove_step(NN_SimulatorParser.Move_stepContext ctx){}
	
	void enterPredict(NN_SimulatorParser.PredictContext ctx){}

	void exitPredict(NN_SimulatorParser.PredictContext ctx){}

	void enterPredict_funct(NN_SimulatorParser.Predict_functContext ctx){}

	void exitPredict_funct(NN_SimulatorParser.Predict_functContext ctx){}

	void enterBlock_predict(NN_SimulatorParser.Block_predictContext ctx){}

	void exitBlock_predict(NN_SimulatorParser.Block_predictContext ctx){}

	void enterPredict_call(NN_SimulatorParser.Predict_callContext ctx){}
	
	void exitPredict_call(NN_SimulatorParser.Predict_callContext ctx){}

	void enterFloat_array(NN_SimulatorParser.Float_arrayContext ctx){}

	void exitFloat_array(NN_SimulatorParser.Float_arrayContext ctx){}

	void enterArray_elem(NN_SimulatorParser.Array_elemContext ctx){}

	void exitArray_elem(NN_SimulatorParser.Array_elemContext ctx){}
	
	void enterEmpty_array(NN_SimulatorParser.Empty_arrayContext ctx){}

	void exitEmpty_array(NN_SimulatorParser.Empty_arrayContext ctx){}
}