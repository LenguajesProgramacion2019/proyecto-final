// Generated from NN_Simulator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NN_SimulatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, WS=56, COMMENTS=57, INT=58, FLOAT=59, STRING=60;
	public static final int
		RULE_main_program = 0, RULE_structure = 1, RULE_input_layer = 2, RULE_hidden_layer = 3, 
		RULE_weights = 4, RULE_add_hidden = 5, RULE_add_weights = 6, RULE_add_function = 7, 
		RULE_output_layer = 8, RULE_output_conf = 9, RULE_output_function = 10, 
		RULE_output_error = 11, RULE_general_conf = 12, RULE_epochs = 13, RULE_learning_rate = 14, 
		RULE_execute = 15, RULE_train = 16, RULE_gradient_descent_funct = 17, 
		RULE_block_grad = 18, RULE_gradient_descent_call = 19, RULE_forward_propagate = 20, 
		RULE_backward_propagate = 21, RULE_move_step = 22, RULE_predict = 23, 
		RULE_predict_funct = 24, RULE_block_predict = 25, RULE_predict_call = 26, 
		RULE_float_array = 27, RULE_array_elem = 28, RULE_empty_array = 29;
	public static final String[] ruleNames = {
		"main_program", "structure", "input_layer", "hidden_layer", "weights", 
		"add_hidden", "add_weights", "add_function", "output_layer", "output_conf", 
		"output_function", "output_error", "general_conf", "epochs", "learning_rate", 
		"execute", "train", "gradient_descent_funct", "block_grad", "gradient_descent_call", 
		"forward_propagate", "backward_propagate", "move_step", "predict", "predict_funct", 
		"block_predict", "predict_call", "float_array", "array_elem", "empty_array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'input_layer'", "'('", "')'", "';'", "'hidden_layers'", "'weights'", 
		"'.'", "'add_layer'", "'add_random_matrix'", "','", "'function'", "'output_layer'", 
		"'error'", "'epochs'", "'='", "'alpha'", "'gradient_descent'", "'x'", 
		"'W'", "'activations'", "'iterations'", "'{'", "'}'", "'layers'", "'join'", 
		"'z_1'", "'*'", "'w_1'", "'a_1'", "'f[1]'", "'for'", "'i'", "'in'", "'2...num_layers'", 
		"'z_i'", "'a_{i-1}'", "'w_i'", "'a_i'", "'f[i]'", "'loss'", "'y'", "'-'", 
		"'a_{num_layers}'", "'**'", "'2'", "'j'", "'num_layers...1'", "'a_i-1'", 
		"'w_2'", "'iteration'", "'predict'", "'return'", "'activationS'", "'['", 
		"']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "WS", "COMMENTS", "INT", 
		"FLOAT", "STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NN_Simulator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NN_SimulatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Main_programContext extends ParserRuleContext {
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public General_confContext general_conf() {
			return getRuleContext(General_confContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public Main_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterMain_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitMain_program(this);
		}
	}

	public final Main_programContext main_program() throws RecognitionException {
		Main_programContext _localctx = new Main_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			structure();
			setState(61);
			general_conf();
			setState(62);
			execute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureContext extends ParserRuleContext {
		public Input_layerContext input_layer() {
			return getRuleContext(Input_layerContext.class,0);
		}
		public Hidden_layerContext hidden_layer() {
			return getRuleContext(Hidden_layerContext.class,0);
		}
		public Output_layerContext output_layer() {
			return getRuleContext(Output_layerContext.class,0);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitStructure(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			input_layer();
			setState(65);
			hidden_layer();
			setState(66);
			output_layer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_layerContext extends ParserRuleContext {
		public Float_arrayContext float_array() {
			return getRuleContext(Float_arrayContext.class,0);
		}
		public Input_layerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterInput_layer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitInput_layer(this);
		}
	}

	public final Input_layerContext input_layer() throws RecognitionException {
		Input_layerContext _localctx = new Input_layerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input_layer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(T__1);
			setState(70);
			float_array();
			setState(71);
			match(T__2);
			setState(72);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hidden_layerContext extends ParserRuleContext {
		public Empty_arrayContext empty_array() {
			return getRuleContext(Empty_arrayContext.class,0);
		}
		public WeightsContext weights() {
			return getRuleContext(WeightsContext.class,0);
		}
		public Add_hiddenContext add_hidden() {
			return getRuleContext(Add_hiddenContext.class,0);
		}
		public Hidden_layerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hidden_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterHidden_layer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitHidden_layer(this);
		}
	}

	public final Hidden_layerContext hidden_layer() throws RecognitionException {
		Hidden_layerContext _localctx = new Hidden_layerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hidden_layer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__4);
			setState(75);
			match(T__1);
			setState(76);
			empty_array();
			setState(77);
			match(T__2);
			setState(78);
			match(T__3);
			setState(79);
			weights();
			setState(80);
			add_hidden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightsContext extends ParserRuleContext {
		public Empty_arrayContext empty_array() {
			return getRuleContext(Empty_arrayContext.class,0);
		}
		public WeightsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weights; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterWeights(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitWeights(this);
		}
	}

	public final WeightsContext weights() throws RecognitionException {
		WeightsContext _localctx = new WeightsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_weights);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			match(T__1);
			setState(84);
			empty_array();
			setState(85);
			match(T__2);
			setState(86);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_hiddenContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NN_SimulatorParser.INT, 0); }
		public Add_weightsContext add_weights() {
			return getRuleContext(Add_weightsContext.class,0);
		}
		public Add_functionContext add_function() {
			return getRuleContext(Add_functionContext.class,0);
		}
		public Add_hiddenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_hidden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterAdd_hidden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitAdd_hidden(this);
		}
	}

	public final Add_hiddenContext add_hidden() throws RecognitionException {
		Add_hiddenContext _localctx = new Add_hiddenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add_hidden);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__4);
				setState(89);
				match(T__6);
				setState(90);
				match(T__7);
				setState(91);
				match(T__1);
				setState(92);
				match(INT);
				setState(93);
				match(T__2);
				setState(94);
				match(T__3);
				setState(95);
				add_weights();
				setState(96);
				add_function();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_weightsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(NN_SimulatorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(NN_SimulatorParser.INT, i);
		}
		public Add_weightsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_weights; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterAdd_weights(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitAdd_weights(this);
		}
	}

	public final Add_weightsContext add_weights() throws RecognitionException {
		Add_weightsContext _localctx = new Add_weightsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add_weights);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__5);
			setState(102);
			match(T__6);
			setState(103);
			match(T__8);
			setState(104);
			match(T__1);
			setState(105);
			match(INT);
			setState(106);
			match(T__9);
			setState(107);
			match(INT);
			setState(108);
			match(T__2);
			setState(109);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_functionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NN_SimulatorParser.STRING, 0); }
		public Add_hiddenContext add_hidden() {
			return getRuleContext(Add_hiddenContext.class,0);
		}
		public Add_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterAdd_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitAdd_function(this);
		}
	}

	public final Add_functionContext add_function() throws RecognitionException {
		Add_functionContext _localctx = new Add_functionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_add_function);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__4);
				setState(112);
				match(T__6);
				setState(113);
				match(T__10);
				setState(114);
				match(T__1);
				setState(115);
				match(STRING);
				setState(116);
				match(T__2);
				setState(117);
				match(T__3);
				setState(118);
				add_hidden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				add_hidden();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_layerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NN_SimulatorParser.INT, 0); }
		public Output_confContext output_conf() {
			return getRuleContext(Output_confContext.class,0);
		}
		public Output_layerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterOutput_layer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitOutput_layer(this);
		}
	}

	public final Output_layerContext output_layer() throws RecognitionException {
		Output_layerContext _localctx = new Output_layerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_output_layer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
			setState(123);
			match(T__1);
			setState(124);
			match(INT);
			setState(125);
			match(T__2);
			setState(126);
			match(T__3);
			setState(127);
			output_conf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_confContext extends ParserRuleContext {
		public Output_functionContext output_function() {
			return getRuleContext(Output_functionContext.class,0);
		}
		public Output_errorContext output_error() {
			return getRuleContext(Output_errorContext.class,0);
		}
		public Output_confContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_conf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterOutput_conf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitOutput_conf(this);
		}
	}

	public final Output_confContext output_conf() throws RecognitionException {
		Output_confContext _localctx = new Output_confContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_output_conf);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				output_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				output_error();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_functionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NN_SimulatorParser.STRING, 0); }
		public Output_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterOutput_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitOutput_function(this);
		}
	}

	public final Output_functionContext output_function() throws RecognitionException {
		Output_functionContext _localctx = new Output_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__11);
			setState(135);
			match(T__6);
			setState(136);
			match(T__10);
			setState(137);
			match(T__1);
			setState(138);
			match(STRING);
			setState(139);
			match(T__2);
			setState(140);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_errorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NN_SimulatorParser.STRING, 0); }
		public Output_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterOutput_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitOutput_error(this);
		}
	}

	public final Output_errorContext output_error() throws RecognitionException {
		Output_errorContext _localctx = new Output_errorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__11);
			setState(143);
			match(T__6);
			setState(144);
			match(T__12);
			setState(145);
			match(T__1);
			setState(146);
			match(STRING);
			setState(147);
			match(T__2);
			setState(148);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_confContext extends ParserRuleContext {
		public EpochsContext epochs() {
			return getRuleContext(EpochsContext.class,0);
		}
		public Learning_rateContext learning_rate() {
			return getRuleContext(Learning_rateContext.class,0);
		}
		public General_confContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_conf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterGeneral_conf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitGeneral_conf(this);
		}
	}

	public final General_confContext general_conf() throws RecognitionException {
		General_confContext _localctx = new General_confContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_general_conf);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				epochs();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				learning_rate();
				}
				break;
			case EOF:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpochsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NN_SimulatorParser.INT, 0); }
		public EpochsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epochs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterEpochs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitEpochs(this);
		}
	}

	public final EpochsContext epochs() throws RecognitionException {
		EpochsContext _localctx = new EpochsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_epochs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__13);
			setState(156);
			match(T__14);
			setState(157);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Learning_rateContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(NN_SimulatorParser.FLOAT, 0); }
		public Learning_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_learning_rate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterLearning_rate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitLearning_rate(this);
		}
	}

	public final Learning_rateContext learning_rate() throws RecognitionException {
		Learning_rateContext _localctx = new Learning_rateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_learning_rate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__15);
			setState(160);
			match(T__14);
			setState(161);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteContext extends ParserRuleContext {
		public TrainContext train() {
			return getRuleContext(TrainContext.class,0);
		}
		public PredictContext predict() {
			return getRuleContext(PredictContext.class,0);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitExecute(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_execute);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				train();
				setState(164);
				predict();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrainContext extends ParserRuleContext {
		public Gradient_descent_functContext gradient_descent_funct() {
			return getRuleContext(Gradient_descent_functContext.class,0);
		}
		public Gradient_descent_callContext gradient_descent_call() {
			return getRuleContext(Gradient_descent_callContext.class,0);
		}
		public TrainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_train; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterTrain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitTrain(this);
		}
	}

	public final TrainContext train() throws RecognitionException {
		TrainContext _localctx = new TrainContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_train);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				gradient_descent_funct();
				setState(170);
				gradient_descent_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gradient_descent_functContext extends ParserRuleContext {
		public Block_gradContext block_grad() {
			return getRuleContext(Block_gradContext.class,0);
		}
		public Gradient_descent_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradient_descent_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterGradient_descent_funct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitGradient_descent_funct(this);
		}
	}

	public final Gradient_descent_functContext gradient_descent_funct() throws RecognitionException {
		Gradient_descent_functContext _localctx = new Gradient_descent_functContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gradient_descent_funct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__10);
			setState(176);
			match(T__16);
			setState(177);
			match(T__1);
			setState(178);
			match(T__17);
			setState(179);
			match(T__9);
			setState(180);
			match(T__18);
			setState(181);
			match(T__9);
			setState(182);
			match(T__19);
			setState(183);
			match(T__9);
			setState(184);
			match(T__20);
			setState(185);
			match(T__2);
			setState(186);
			match(T__21);
			setState(187);
			block_grad();
			setState(188);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_gradContext extends ParserRuleContext {
		public Forward_propagateContext forward_propagate() {
			return getRuleContext(Forward_propagateContext.class,0);
		}
		public Backward_propagateContext backward_propagate() {
			return getRuleContext(Backward_propagateContext.class,0);
		}
		public Move_stepContext move_step() {
			return getRuleContext(Move_stepContext.class,0);
		}
		public Block_gradContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_grad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterBlock_grad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitBlock_grad(this);
		}
	}

	public final Block_gradContext block_grad() throws RecognitionException {
		Block_gradContext _localctx = new Block_gradContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block_grad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			forward_propagate();
			setState(191);
			backward_propagate();
			setState(192);
			move_step();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gradient_descent_callContext extends ParserRuleContext {
		public Gradient_descent_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradient_descent_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterGradient_descent_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitGradient_descent_call(this);
		}
	}

	public final Gradient_descent_callContext gradient_descent_call() throws RecognitionException {
		Gradient_descent_callContext _localctx = new Gradient_descent_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gradient_descent_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__16);
			setState(195);
			match(T__1);
			setState(196);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forward_propagateContext extends ParserRuleContext {
		public Forward_propagateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward_propagate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterForward_propagate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitForward_propagate(this);
		}
	}

	public final Forward_propagateContext forward_propagate() throws RecognitionException {
		Forward_propagateContext _localctx = new Forward_propagateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forward_propagate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__23);
			setState(199);
			match(T__14);
			setState(200);
			match(T__24);
			setState(201);
			match(T__1);
			setState(202);
			match(T__4);
			setState(203);
			match(T__9);
			setState(204);
			match(T__11);
			setState(205);
			match(T__2);
			setState(206);
			match(T__3);
			setState(207);
			match(T__25);
			setState(208);
			match(T__14);
			setState(209);
			match(T__17);
			setState(210);
			match(T__26);
			setState(211);
			match(T__27);
			setState(212);
			match(T__3);
			setState(213);
			match(T__28);
			setState(214);
			match(T__14);
			setState(215);
			match(T__29);
			setState(216);
			match(T__1);
			setState(217);
			match(T__25);
			setState(218);
			match(T__2);
			setState(219);
			match(T__3);
			setState(220);
			match(T__30);
			setState(221);
			match(T__31);
			setState(222);
			match(T__32);
			setState(223);
			match(T__33);
			setState(224);
			match(T__21);
			setState(225);
			match(T__34);
			setState(226);
			match(T__14);
			setState(227);
			match(T__35);
			setState(228);
			match(T__26);
			setState(229);
			match(T__36);
			setState(230);
			match(T__3);
			setState(231);
			match(T__37);
			setState(232);
			match(T__14);
			setState(233);
			match(T__38);
			setState(234);
			match(T__1);
			setState(235);
			match(T__34);
			setState(236);
			match(T__2);
			setState(237);
			match(T__3);
			setState(238);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backward_propagateContext extends ParserRuleContext {
		public Backward_propagateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backward_propagate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterBackward_propagate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitBackward_propagate(this);
		}
	}

	public final Backward_propagateContext backward_propagate() throws RecognitionException {
		Backward_propagateContext _localctx = new Backward_propagateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_backward_propagate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__39);
			setState(241);
			match(T__14);
			setState(242);
			match(T__1);
			setState(243);
			match(T__40);
			setState(244);
			match(T__41);
			setState(245);
			match(T__42);
			setState(246);
			match(T__2);
			setState(247);
			match(T__43);
			setState(248);
			match(T__44);
			setState(249);
			match(T__30);
			setState(250);
			match(T__45);
			setState(251);
			match(T__32);
			setState(252);
			match(T__46);
			setState(253);
			match(T__21);
			setState(254);
			match(T__34);
			setState(255);
			match(T__14);
			setState(256);
			match(T__47);
			setState(257);
			match(T__26);
			setState(258);
			match(T__48);
			setState(259);
			match(T__3);
			setState(260);
			match(T__37);
			setState(261);
			match(T__14);
			setState(262);
			match(T__38);
			setState(263);
			match(T__1);
			setState(264);
			match(T__34);
			setState(265);
			match(T__2);
			setState(266);
			match(T__3);
			setState(267);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_stepContext extends ParserRuleContext {
		public Move_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterMove_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitMove_step(this);
		}
	}

	public final Move_stepContext move_step() throws RecognitionException {
		Move_stepContext _localctx = new Move_stepContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_move_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__49);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredictContext extends ParserRuleContext {
		public Predict_functContext predict_funct() {
			return getRuleContext(Predict_functContext.class,0);
		}
		public Predict_callContext predict_call() {
			return getRuleContext(Predict_callContext.class,0);
		}
		public PredictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterPredict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitPredict(this);
		}
	}

	public final PredictContext predict() throws RecognitionException {
		PredictContext _localctx = new PredictContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_predict);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				predict_funct();
				setState(272);
				predict_call();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predict_functContext extends ParserRuleContext {
		public Block_predictContext block_predict() {
			return getRuleContext(Block_predictContext.class,0);
		}
		public Predict_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predict_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterPredict_funct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitPredict_funct(this);
		}
	}

	public final Predict_functContext predict_funct() throws RecognitionException {
		Predict_functContext _localctx = new Predict_functContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_predict_funct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__10);
			setState(278);
			match(T__50);
			setState(279);
			match(T__1);
			setState(280);
			match(T__17);
			setState(281);
			match(T__9);
			setState(282);
			match(T__18);
			setState(283);
			match(T__9);
			setState(284);
			match(T__19);
			setState(285);
			match(T__2);
			setState(286);
			match(T__21);
			setState(287);
			block_predict();
			setState(288);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_predictContext extends ParserRuleContext {
		public Block_predictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_predict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterBlock_predict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitBlock_predict(this);
		}
	}

	public final Block_predictContext block_predict() throws RecognitionException {
		Block_predictContext _localctx = new Block_predictContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block_predict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__23);
			setState(291);
			match(T__14);
			setState(292);
			match(T__24);
			setState(293);
			match(T__1);
			setState(294);
			match(T__4);
			setState(295);
			match(T__9);
			setState(296);
			match(T__11);
			setState(297);
			match(T__2);
			setState(298);
			match(T__3);
			setState(299);
			match(T__25);
			setState(300);
			match(T__14);
			setState(301);
			match(T__17);
			setState(302);
			match(T__26);
			setState(303);
			match(T__27);
			setState(304);
			match(T__3);
			setState(305);
			match(T__28);
			setState(306);
			match(T__14);
			setState(307);
			match(T__29);
			setState(308);
			match(T__1);
			setState(309);
			match(T__25);
			setState(310);
			match(T__2);
			setState(311);
			match(T__3);
			setState(312);
			match(T__30);
			setState(313);
			match(T__31);
			setState(314);
			match(T__32);
			setState(315);
			match(T__33);
			setState(316);
			match(T__21);
			setState(317);
			match(T__34);
			setState(318);
			match(T__14);
			setState(319);
			match(T__35);
			setState(320);
			match(T__26);
			setState(321);
			match(T__48);
			setState(322);
			match(T__3);
			setState(323);
			match(T__37);
			setState(324);
			match(T__14);
			setState(325);
			match(T__38);
			setState(326);
			match(T__1);
			setState(327);
			match(T__34);
			setState(328);
			match(T__2);
			setState(329);
			match(T__3);
			setState(330);
			match(T__22);
			setState(331);
			match(T__51);
			setState(332);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predict_callContext extends ParserRuleContext {
		public Predict_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predict_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterPredict_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitPredict_call(this);
		}
	}

	public final Predict_callContext predict_call() throws RecognitionException {
		Predict_callContext _localctx = new Predict_callContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_predict_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__50);
			setState(335);
			match(T__1);
			setState(336);
			match(T__0);
			setState(337);
			match(T__9);
			setState(338);
			match(T__5);
			setState(339);
			match(T__9);
			setState(340);
			match(T__52);
			setState(341);
			match(T__2);
			setState(342);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_arrayContext extends ParserRuleContext {
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public Float_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterFloat_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitFloat_array(this);
		}
	}

	public final Float_arrayContext float_array() throws RecognitionException {
		Float_arrayContext _localctx = new Float_arrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_float_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__53);
			setState(345);
			array_elem();
			setState(346);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elemContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(NN_SimulatorParser.FLOAT, 0); }
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterArray_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitArray_elem(this);
		}
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_elem);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(FLOAT);
				setState(350);
				match(T__9);
				setState(351);
				array_elem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_arrayContext extends ParserRuleContext {
		public Empty_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterEmpty_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitEmpty_array(this);
		}
	}

	public final Empty_arrayContext empty_array() throws RecognitionException {
		Empty_arrayContext _localctx = new Empty_arrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_empty_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__53);
			setState(355);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u009c\n\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00aa\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00b0\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0116\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u0163\n\36\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u0153\2>\3\2\2\2\4B\3\2\2\2\6"+
		"F\3\2\2\2\bL\3\2\2\2\nT\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20z\3\2\2\2\22"+
		"|\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u0090\3\2\2\2\32\u009b"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u00a1\3\2\2\2 \u00a9\3\2\2\2\"\u00af\3\2"+
		"\2\2$\u00b1\3\2\2\2&\u00c0\3\2\2\2(\u00c4\3\2\2\2*\u00c8\3\2\2\2,\u00f2"+
		"\3\2\2\2.\u010f\3\2\2\2\60\u0115\3\2\2\2\62\u0117\3\2\2\2\64\u0124\3\2"+
		"\2\2\66\u0150\3\2\2\28\u015a\3\2\2\2:\u0162\3\2\2\2<\u0164\3\2\2\2>?\5"+
		"\4\3\2?@\5\32\16\2@A\5 \21\2A\3\3\2\2\2BC\5\6\4\2CD\5\b\5\2DE\5\22\n\2"+
		"E\5\3\2\2\2FG\7\3\2\2GH\7\4\2\2HI\58\35\2IJ\7\5\2\2JK\7\6\2\2K\7\3\2\2"+
		"\2LM\7\7\2\2MN\7\4\2\2NO\5<\37\2OP\7\5\2\2PQ\7\6\2\2QR\5\n\6\2RS\5\f\7"+
		"\2S\t\3\2\2\2TU\7\b\2\2UV\7\4\2\2VW\5<\37\2WX\7\5\2\2XY\7\6\2\2Y\13\3"+
		"\2\2\2Z[\7\7\2\2[\\\7\t\2\2\\]\7\n\2\2]^\7\4\2\2^_\7<\2\2_`\7\5\2\2`a"+
		"\7\6\2\2ab\5\16\b\2bc\5\20\t\2cf\3\2\2\2df\3\2\2\2eZ\3\2\2\2ed\3\2\2\2"+
		"f\r\3\2\2\2gh\7\b\2\2hi\7\t\2\2ij\7\13\2\2jk\7\4\2\2kl\7<\2\2lm\7\f\2"+
		"\2mn\7<\2\2no\7\5\2\2op\7\6\2\2p\17\3\2\2\2qr\7\7\2\2rs\7\t\2\2st\7\r"+
		"\2\2tu\7\4\2\2uv\7>\2\2vw\7\5\2\2wx\7\6\2\2x{\5\f\7\2y{\5\f\7\2zq\3\2"+
		"\2\2zy\3\2\2\2{\21\3\2\2\2|}\7\16\2\2}~\7\4\2\2~\177\7<\2\2\177\u0080"+
		"\7\5\2\2\u0080\u0081\7\6\2\2\u0081\u0082\5\24\13\2\u0082\23\3\2\2\2\u0083"+
		"\u0087\5\26\f\2\u0084\u0087\5\30\r\2\u0085\u0087\3\2\2\2\u0086\u0083\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088"+
		"\u0089\7\16\2\2\u0089\u008a\7\t\2\2\u008a\u008b\7\r\2\2\u008b\u008c\7"+
		"\4\2\2\u008c\u008d\7>\2\2\u008d\u008e\7\5\2\2\u008e\u008f\7\6\2\2\u008f"+
		"\27\3\2\2\2\u0090\u0091\7\16\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7\17"+
		"\2\2\u0093\u0094\7\4\2\2\u0094\u0095\7>\2\2\u0095\u0096\7\5\2\2\u0096"+
		"\u0097\7\6\2\2\u0097\31\3\2\2\2\u0098\u009c\5\34\17\2\u0099\u009c\5\36"+
		"\20\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\33\3\2\2\2\u009d\u009e\7\20\2\2\u009e\u009f\7\21"+
		"\2\2\u009f\u00a0\7<\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3"+
		"\7\21\2\2\u00a3\u00a4\7=\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\5\"\22\2\u00a6"+
		"\u00a7\5\60\31\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ad"+
		"\5(\25\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0#\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\7\23\2\2"+
		"\u00b3\u00b4\7\4\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7"+
		"\7\25\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\7\f\2\2"+
		"\u00ba\u00bb\7\27\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be"+
		"\5&\24\2\u00be\u00bf\7\31\2\2\u00bf%\3\2\2\2\u00c0\u00c1\5*\26\2\u00c1"+
		"\u00c2\5,\27\2\u00c2\u00c3\5.\30\2\u00c3\'\3\2\2\2\u00c4\u00c5\7\23\2"+
		"\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\7\5\2\2\u00c7)\3\2\2\2\u00c8\u00c9"+
		"\7\32\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cc\7\4\2"+
		"\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\7\16\2\2\u00cf"+
		"\u00d0\7\5\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7\34\2\2\u00d2\u00d3\7"+
		"\21\2\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\7\35\2\2\u00d5\u00d6\7\36\2\2"+
		"\u00d6\u00d7\7\6\2\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\7\21\2\2\u00d9\u00da"+
		"\7 \2\2\u00da\u00db\7\4\2\2\u00db\u00dc\7\34\2\2\u00dc\u00dd\7\5\2\2\u00dd"+
		"\u00de\7\6\2\2\u00de\u00df\7!\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\7#\2"+
		"\2\u00e1\u00e2\7$\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\7%\2\2\u00e4\u00e5"+
		"\7\21\2\2\u00e5\u00e6\7&\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\7\'\2\2"+
		"\u00e8\u00e9\7\6\2\2\u00e9\u00ea\7(\2\2\u00ea\u00eb\7\21\2\2\u00eb\u00ec"+
		"\7)\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\7%\2\2\u00ee\u00ef\7\5\2\2\u00ef"+
		"\u00f0\7\6\2\2\u00f0\u00f1\7\31\2\2\u00f1+\3\2\2\2\u00f2\u00f3\7*\2\2"+
		"\u00f3\u00f4\7\21\2\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\7+\2\2\u00f6\u00f7"+
		"\7,\2\2\u00f7\u00f8\7-\2\2\u00f8\u00f9\7\5\2\2\u00f9\u00fa\7.\2\2\u00fa"+
		"\u00fb\7/\2\2\u00fb\u00fc\7!\2\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7#\2"+
		"\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7\30\2\2\u0100\u0101\7%\2\2\u0101"+
		"\u0102\7\21\2\2\u0102\u0103\7\62\2\2\u0103\u0104\7\35\2\2\u0104\u0105"+
		"\7\63\2\2\u0105\u0106\7\6\2\2\u0106\u0107\7(\2\2\u0107\u0108\7\21\2\2"+
		"\u0108\u0109\7)\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7%\2\2\u010b\u010c"+
		"\7\5\2\2\u010c\u010d\7\6\2\2\u010d\u010e\7\31\2\2\u010e-\3\2\2\2\u010f"+
		"\u0110\7\64\2\2\u0110/\3\2\2\2\u0111\u0112\5\62\32\2\u0112\u0113\5\66"+
		"\34\2\u0113\u0116\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0111\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\61\3\2\2\2\u0117\u0118\7\r\2\2\u0118\u0119\7\65\2"+
		"\2\u0119\u011a\7\4\2\2\u011a\u011b\7\24\2\2\u011b\u011c\7\f\2\2\u011c"+
		"\u011d\7\25\2\2\u011d\u011e\7\f\2\2\u011e\u011f\7\26\2\2\u011f\u0120\7"+
		"\5\2\2\u0120\u0121\7\30\2\2\u0121\u0122\5\64\33\2\u0122\u0123\7\31\2\2"+
		"\u0123\63\3\2\2\2\u0124\u0125\7\32\2\2\u0125\u0126\7\21\2\2\u0126\u0127"+
		"\7\33\2\2\u0127\u0128\7\4\2\2\u0128\u0129\7\7\2\2\u0129\u012a\7\f\2\2"+
		"\u012a\u012b\7\16\2\2\u012b\u012c\7\5\2\2\u012c\u012d\7\6\2\2\u012d\u012e"+
		"\7\34\2\2\u012e\u012f\7\21\2\2\u012f\u0130\7\24\2\2\u0130\u0131\7\35\2"+
		"\2\u0131\u0132\7\36\2\2\u0132\u0133\7\6\2\2\u0133\u0134\7\37\2\2\u0134"+
		"\u0135\7\21\2\2\u0135\u0136\7 \2\2\u0136\u0137\7\4\2\2\u0137\u0138\7\34"+
		"\2\2\u0138\u0139\7\5\2\2\u0139\u013a\7\6\2\2\u013a\u013b\7!\2\2\u013b"+
		"\u013c\7\"\2\2\u013c\u013d\7#\2\2\u013d\u013e\7$\2\2\u013e\u013f\7\30"+
		"\2\2\u013f\u0140\7%\2\2\u0140\u0141\7\21\2\2\u0141\u0142\7&\2\2\u0142"+
		"\u0143\7\35\2\2\u0143\u0144\7\63\2\2\u0144\u0145\7\6\2\2\u0145\u0146\7"+
		"(\2\2\u0146\u0147\7\21\2\2\u0147\u0148\7)\2\2\u0148\u0149\7\4\2\2\u0149"+
		"\u014a\7%\2\2\u014a\u014b\7\5\2\2\u014b\u014c\7\6\2\2\u014c\u014d\7\31"+
		"\2\2\u014d\u014e\7\66\2\2\u014e\u014f\7-\2\2\u014f\65\3\2\2\2\u0150\u0151"+
		"\7\65\2\2\u0151\u0152\7\4\2\2\u0152\u0153\7\3\2\2\u0153\u0154\7\f\2\2"+
		"\u0154\u0155\7\b\2\2\u0155\u0156\7\f\2\2\u0156\u0157\7\67\2\2\u0157\u0158"+
		"\7\5\2\2\u0158\u0159\7\6\2\2\u0159\67\3\2\2\2\u015a\u015b\78\2\2\u015b"+
		"\u015c\5:\36\2\u015c\u015d\79\2\2\u015d9\3\2\2\2\u015e\u0163\7=\2\2\u015f"+
		"\u0160\7=\2\2\u0160\u0161\7\f\2\2\u0161\u0163\5:\36\2\u0162\u015e\3\2"+
		"\2\2\u0162\u015f\3\2\2\2\u0163;\3\2\2\2\u0164\u0165\78\2\2\u0165\u0166"+
		"\79\2\2\u0166=\3\2\2\2\nez\u0086\u009b\u00a9\u00af\u0115\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}