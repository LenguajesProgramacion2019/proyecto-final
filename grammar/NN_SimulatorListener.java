// Generated from NN_Simulator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NN_SimulatorParser}.
 */
public interface NN_SimulatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#main_program}.
	 * @param ctx the parse tree
	 */
	void enterMain_program(NN_SimulatorParser.Main_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#main_program}.
	 * @param ctx the parse tree
	 */
	void exitMain_program(NN_SimulatorParser.Main_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(NN_SimulatorParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(NN_SimulatorParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#input_layer}.
	 * @param ctx the parse tree
	 */
	void enterInput_layer(NN_SimulatorParser.Input_layerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#input_layer}.
	 * @param ctx the parse tree
	 */
	void exitInput_layer(NN_SimulatorParser.Input_layerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#hidden_layer}.
	 * @param ctx the parse tree
	 */
	void enterHidden_layer(NN_SimulatorParser.Hidden_layerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#hidden_layer}.
	 * @param ctx the parse tree
	 */
	void exitHidden_layer(NN_SimulatorParser.Hidden_layerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#weights}.
	 * @param ctx the parse tree
	 */
	void enterWeights(NN_SimulatorParser.WeightsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#weights}.
	 * @param ctx the parse tree
	 */
	void exitWeights(NN_SimulatorParser.WeightsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#add_hidden}.
	 * @param ctx the parse tree
	 */
	void enterAdd_hidden(NN_SimulatorParser.Add_hiddenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#add_hidden}.
	 * @param ctx the parse tree
	 */
	void exitAdd_hidden(NN_SimulatorParser.Add_hiddenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#add_weights}.
	 * @param ctx the parse tree
	 */
	void enterAdd_weights(NN_SimulatorParser.Add_weightsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#add_weights}.
	 * @param ctx the parse tree
	 */
	void exitAdd_weights(NN_SimulatorParser.Add_weightsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#add_function}.
	 * @param ctx the parse tree
	 */
	void enterAdd_function(NN_SimulatorParser.Add_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#add_function}.
	 * @param ctx the parse tree
	 */
	void exitAdd_function(NN_SimulatorParser.Add_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#output_layer}.
	 * @param ctx the parse tree
	 */
	void enterOutput_layer(NN_SimulatorParser.Output_layerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#output_layer}.
	 * @param ctx the parse tree
	 */
	void exitOutput_layer(NN_SimulatorParser.Output_layerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#output_function}.
	 * @param ctx the parse tree
	 */
	void enterOutput_function(NN_SimulatorParser.Output_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#output_function}.
	 * @param ctx the parse tree
	 */
	void exitOutput_function(NN_SimulatorParser.Output_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#general_conf}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_conf(NN_SimulatorParser.General_confContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#general_conf}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_conf(NN_SimulatorParser.General_confContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#epochs}.
	 * @param ctx the parse tree
	 */
	void enterEpochs(NN_SimulatorParser.EpochsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#epochs}.
	 * @param ctx the parse tree
	 */
	void exitEpochs(NN_SimulatorParser.EpochsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#learning_rate}.
	 * @param ctx the parse tree
	 */
	void enterLearning_rate(NN_SimulatorParser.Learning_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#learning_rate}.
	 * @param ctx the parse tree
	 */
	void exitLearning_rate(NN_SimulatorParser.Learning_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(NN_SimulatorParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(NN_SimulatorParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#train}.
	 * @param ctx the parse tree
	 */
	void enterTrain(NN_SimulatorParser.TrainContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#train}.
	 * @param ctx the parse tree
	 */
	void exitTrain(NN_SimulatorParser.TrainContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#gradient_descent_funct}.
	 * @param ctx the parse tree
	 */
	void enterGradient_descent_funct(NN_SimulatorParser.Gradient_descent_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#gradient_descent_funct}.
	 * @param ctx the parse tree
	 */
	void exitGradient_descent_funct(NN_SimulatorParser.Gradient_descent_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#block_grad}.
	 * @param ctx the parse tree
	 */
	void enterBlock_grad(NN_SimulatorParser.Block_gradContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#block_grad}.
	 * @param ctx the parse tree
	 */
	void exitBlock_grad(NN_SimulatorParser.Block_gradContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#gradient_descent_call}.
	 * @param ctx the parse tree
	 */
	void enterGradient_descent_call(NN_SimulatorParser.Gradient_descent_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#gradient_descent_call}.
	 * @param ctx the parse tree
	 */
	void exitGradient_descent_call(NN_SimulatorParser.Gradient_descent_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#forward_propagate}.
	 * @param ctx the parse tree
	 */
	void enterForward_propagate(NN_SimulatorParser.Forward_propagateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#forward_propagate}.
	 * @param ctx the parse tree
	 */
	void exitForward_propagate(NN_SimulatorParser.Forward_propagateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#backward_propagate}.
	 * @param ctx the parse tree
	 */
	void enterBackward_propagate(NN_SimulatorParser.Backward_propagateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#backward_propagate}.
	 * @param ctx the parse tree
	 */
	void exitBackward_propagate(NN_SimulatorParser.Backward_propagateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#move_step}.
	 * @param ctx the parse tree
	 */
	void enterMove_step(NN_SimulatorParser.Move_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#move_step}.
	 * @param ctx the parse tree
	 */
	void exitMove_step(NN_SimulatorParser.Move_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterPredict(NN_SimulatorParser.PredictContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitPredict(NN_SimulatorParser.PredictContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#predict_funct}.
	 * @param ctx the parse tree
	 */
	void enterPredict_funct(NN_SimulatorParser.Predict_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#predict_funct}.
	 * @param ctx the parse tree
	 */
	void exitPredict_funct(NN_SimulatorParser.Predict_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#block_predict}.
	 * @param ctx the parse tree
	 */
	void enterBlock_predict(NN_SimulatorParser.Block_predictContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#block_predict}.
	 * @param ctx the parse tree
	 */
	void exitBlock_predict(NN_SimulatorParser.Block_predictContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#predict_call}.
	 * @param ctx the parse tree
	 */
	void enterPredict_call(NN_SimulatorParser.Predict_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#predict_call}.
	 * @param ctx the parse tree
	 */
	void exitPredict_call(NN_SimulatorParser.Predict_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#float_array}.
	 * @param ctx the parse tree
	 */
	void enterFloat_array(NN_SimulatorParser.Float_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#float_array}.
	 * @param ctx the parse tree
	 */
	void exitFloat_array(NN_SimulatorParser.Float_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#array_elem}.
	 * @param ctx the parse tree
	 */
	void enterArray_elem(NN_SimulatorParser.Array_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#array_elem}.
	 * @param ctx the parse tree
	 */
	void exitArray_elem(NN_SimulatorParser.Array_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#empty_array}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_array(NN_SimulatorParser.Empty_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#empty_array}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_array(NN_SimulatorParser.Empty_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#intn}.
	 * @param ctx the parse tree
	 */
	void enterIntn(NN_SimulatorParser.IntnContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#intn}.
	 * @param ctx the parse tree
	 */
	void exitIntn(NN_SimulatorParser.IntnContext ctx);
	/**
	 * Enter a parse tree produced by {@link NN_SimulatorParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(NN_SimulatorParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link NN_SimulatorParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(NN_SimulatorParser.TextContext ctx);
}