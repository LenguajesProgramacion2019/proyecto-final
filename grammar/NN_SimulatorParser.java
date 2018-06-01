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
		T__52=53, WS=54, COMMENTS=55, INT=56, FLOAT=57, STRING=58;
	public static final int
		RULE_main_program = 0, RULE_structure = 1, RULE_input_layer = 2, RULE_hidden_layer = 3, 
		RULE_weights = 4, RULE_add_hidden = 5, RULE_add_weights = 6, RULE_add_function = 7, 
		RULE_output_layer = 8, RULE_output_function = 9, RULE_modify_weights = 10, 
		RULE_general_conf = 11, RULE_epochs = 12, RULE_learning_rate = 13, RULE_execute = 14, 
		RULE_train = 15, RULE_gradient_descent_funct = 16, RULE_block_grad = 17, 
		RULE_gradient_descent_call = 18, RULE_forward_propagate = 19, RULE_backward_propagate = 20, 
		RULE_move_step = 21, RULE_predict = 22, RULE_predict_funct = 23, RULE_block_predict = 24, 
		RULE_predict_call = 25, RULE_float_array = 26, RULE_array_elem = 27, RULE_empty_array = 28, 
		RULE_intn = 29, RULE_text = 30, RULE_flotante = 31;
	public static final String[] ruleNames = {
		"main_program", "structure", "input_layer", "hidden_layer", "weights", 
		"add_hidden", "add_weights", "add_function", "output_layer", "output_function", 
		"modify_weights", "general_conf", "epochs", "learning_rate", "execute", 
		"train", "gradient_descent_funct", "block_grad", "gradient_descent_call", 
		"forward_propagate", "backward_propagate", "move_step", "predict", "predict_funct", 
		"block_predict", "predict_call", "float_array", "array_elem", "empty_array", 
		"intn", "text", "flotante"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'input_layer'", "'('", "')'", "';'", "'hidden_layers'", "'weights'", 
		"'.'", "'add_layer'", "'add_random_matrix'", "','", "'['", "']'", "'function'", 
		"'output_layer'", "'='", "'epochs'", "'alpha'", "'gradient_descent'", 
		"'x'", "'W'", "'activations'", "'iterations'", "'{'", "'}'", "'layers'", 
		"'join'", "'z_1'", "'*'", "'w_1'", "'a_1'", "'f[1]'", "'for'", "'i'", 
		"'in'", "'2...num_layers'", "'z_i'", "'a_{i-1}'", "'w_i'", "'a_i'", "'f[i]'", 
		"'loss'", "'y'", "'-'", "'a_{num_layers}'", "'**'", "'2'", "'j'", "'num_layers...1'", 
		"'a_i-1'", "'w_2'", "'iteration'", "'predict'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WS", "COMMENTS", "INT", "FLOAT", 
		"STRING"
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
			setState(64);
			structure();
			setState(65);
			general_conf();
			setState(66);
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
		public Modify_weightsContext modify_weights() {
			return getRuleContext(Modify_weightsContext.class,0);
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
			setState(68);
			input_layer();
			setState(69);
			hidden_layer();
			setState(70);
			output_layer();
			setState(71);
			modify_weights();
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
			setState(73);
			match(T__0);
			setState(74);
			match(T__1);
			setState(75);
			float_array();
			setState(76);
			match(T__2);
			setState(77);
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
		public Add_functionContext add_function() {
			return getRuleContext(Add_functionContext.class,0);
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
			setState(79);
			match(T__4);
			setState(80);
			match(T__1);
			setState(81);
			empty_array();
			setState(82);
			match(T__2);
			setState(83);
			match(T__3);
			setState(84);
			weights();
			setState(85);
			add_hidden();
			setState(86);
			add_function();
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
			setState(88);
			match(T__5);
			setState(89);
			match(T__1);
			setState(90);
			empty_array();
			setState(91);
			match(T__2);
			setState(92);
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
		public IntnContext intn() {
			return getRuleContext(IntnContext.class,0);
		}
		public Add_weightsContext add_weights() {
			return getRuleContext(Add_weightsContext.class,0);
		}
		public Add_hiddenContext add_hidden() {
			return getRuleContext(Add_hiddenContext.class,0);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(T__6);
				setState(96);
				match(T__7);
				setState(97);
				match(T__1);
				setState(98);
				intn();
				setState(99);
				match(T__2);
				setState(100);
				match(T__3);
				setState(101);
				add_weights();
				setState(102);
				add_hidden();
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

	public static class Add_weightsContext extends ParserRuleContext {
		public List<IntnContext> intn() {
			return getRuleContexts(IntnContext.class);
		}
		public IntnContext intn(int i) {
			return getRuleContext(IntnContext.class,i);
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
			setState(107);
			match(T__5);
			setState(108);
			match(T__6);
			setState(109);
			match(T__8);
			setState(110);
			match(T__1);
			setState(111);
			intn();
			setState(112);
			match(T__9);
			setState(113);
			intn();
			setState(114);
			match(T__2);
			setState(115);
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
		public IntnContext intn() {
			return getRuleContext(IntnContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public Add_functionContext add_function() {
			return getRuleContext(Add_functionContext.class,0);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__4);
				setState(118);
				match(T__10);
				setState(119);
				intn();
				setState(120);
				match(T__11);
				setState(121);
				match(T__6);
				setState(122);
				match(T__12);
				setState(123);
				match(T__1);
				setState(124);
				text();
				setState(125);
				match(T__2);
				setState(126);
				match(T__3);
				setState(127);
				add_function();
				}
				break;
			case T__13:
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

	public static class Output_layerContext extends ParserRuleContext {
		public IntnContext intn() {
			return getRuleContext(IntnContext.class,0);
		}
		public Add_weightsContext add_weights() {
			return getRuleContext(Add_weightsContext.class,0);
		}
		public Output_functionContext output_function() {
			return getRuleContext(Output_functionContext.class,0);
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
			setState(132);
			match(T__13);
			setState(133);
			match(T__1);
			setState(134);
			intn();
			setState(135);
			match(T__2);
			setState(136);
			match(T__3);
			setState(137);
			add_weights();
			setState(138);
			output_function();
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_output_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__13);
			setState(141);
			match(T__6);
			setState(142);
			match(T__12);
			setState(143);
			match(T__1);
			setState(144);
			text();
			setState(145);
			match(T__2);
			setState(146);
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

	public static class Modify_weightsContext extends ParserRuleContext {
		public List<IntnContext> intn() {
			return getRuleContexts(IntnContext.class);
		}
		public IntnContext intn(int i) {
			return getRuleContext(IntnContext.class,i);
		}
		public FlotanteContext flotante() {
			return getRuleContext(FlotanteContext.class,0);
		}
		public Modify_weightsContext modify_weights() {
			return getRuleContext(Modify_weightsContext.class,0);
		}
		public Modify_weightsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modify_weights; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterModify_weights(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitModify_weights(this);
		}
	}

	public final Modify_weightsContext modify_weights() throws RecognitionException {
		Modify_weightsContext _localctx = new Modify_weightsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modify_weights);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__5);
				setState(149);
				match(T__10);
				setState(150);
				intn();
				setState(151);
				match(T__11);
				setState(152);
				match(T__10);
				setState(153);
				intn();
				setState(154);
				match(T__11);
				setState(155);
				match(T__10);
				setState(156);
				intn();
				setState(157);
				match(T__11);
				setState(158);
				match(T__14);
				setState(159);
				flotante();
				setState(160);
				match(T__3);
				setState(161);
				modify_weights();
				}
				break;
			case EOF:
			case T__12:
			case T__15:
			case T__16:
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
		enterRule(_localctx, 22, RULE_general_conf);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				epochs();
				setState(167);
				learning_rate();
				}
				break;
			case EOF:
			case T__12:
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

	public static class EpochsContext extends ParserRuleContext {
		public IntnContext intn() {
			return getRuleContext(IntnContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_epochs);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__15);
				setState(173);
				match(T__14);
				setState(174);
				intn();
				setState(175);
				match(T__3);
				}
				break;
			case T__16:
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
		enterRule(_localctx, 26, RULE_learning_rate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__16);
			setState(181);
			match(T__14);
			setState(182);
			match(FLOAT);
			setState(183);
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
		enterRule(_localctx, 28, RULE_execute);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				train();
				setState(186);
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
		enterRule(_localctx, 30, RULE_train);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				gradient_descent_funct();
				setState(192);
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
		enterRule(_localctx, 32, RULE_gradient_descent_funct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__12);
			setState(198);
			match(T__17);
			setState(199);
			match(T__1);
			setState(200);
			match(T__18);
			setState(201);
			match(T__9);
			setState(202);
			match(T__19);
			setState(203);
			match(T__9);
			setState(204);
			match(T__20);
			setState(205);
			match(T__9);
			setState(206);
			match(T__21);
			setState(207);
			match(T__2);
			setState(208);
			match(T__22);
			setState(209);
			block_grad();
			setState(210);
			match(T__23);
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
		enterRule(_localctx, 34, RULE_block_grad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			forward_propagate();
			setState(213);
			backward_propagate();
			setState(214);
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
		enterRule(_localctx, 36, RULE_gradient_descent_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__17);
			setState(217);
			match(T__1);
			setState(218);
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
		enterRule(_localctx, 38, RULE_forward_propagate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__24);
			setState(221);
			match(T__14);
			setState(222);
			match(T__25);
			setState(223);
			match(T__1);
			setState(224);
			match(T__4);
			setState(225);
			match(T__9);
			setState(226);
			match(T__13);
			setState(227);
			match(T__2);
			setState(228);
			match(T__3);
			setState(229);
			match(T__26);
			setState(230);
			match(T__14);
			setState(231);
			match(T__18);
			setState(232);
			match(T__27);
			setState(233);
			match(T__28);
			setState(234);
			match(T__3);
			setState(235);
			match(T__29);
			setState(236);
			match(T__14);
			setState(237);
			match(T__30);
			setState(238);
			match(T__1);
			setState(239);
			match(T__26);
			setState(240);
			match(T__2);
			setState(241);
			match(T__3);
			setState(242);
			match(T__31);
			setState(243);
			match(T__32);
			setState(244);
			match(T__33);
			setState(245);
			match(T__34);
			setState(246);
			match(T__22);
			setState(247);
			match(T__35);
			setState(248);
			match(T__14);
			setState(249);
			match(T__36);
			setState(250);
			match(T__27);
			setState(251);
			match(T__37);
			setState(252);
			match(T__3);
			setState(253);
			match(T__38);
			setState(254);
			match(T__14);
			setState(255);
			match(T__39);
			setState(256);
			match(T__1);
			setState(257);
			match(T__35);
			setState(258);
			match(T__2);
			setState(259);
			match(T__3);
			setState(260);
			match(T__23);
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
		enterRule(_localctx, 40, RULE_backward_propagate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__40);
			setState(263);
			match(T__14);
			setState(264);
			match(T__1);
			setState(265);
			match(T__41);
			setState(266);
			match(T__42);
			setState(267);
			match(T__43);
			setState(268);
			match(T__2);
			setState(269);
			match(T__44);
			setState(270);
			match(T__45);
			setState(271);
			match(T__31);
			setState(272);
			match(T__46);
			setState(273);
			match(T__33);
			setState(274);
			match(T__47);
			setState(275);
			match(T__22);
			setState(276);
			match(T__35);
			setState(277);
			match(T__14);
			setState(278);
			match(T__48);
			setState(279);
			match(T__27);
			setState(280);
			match(T__49);
			setState(281);
			match(T__3);
			setState(282);
			match(T__38);
			setState(283);
			match(T__14);
			setState(284);
			match(T__39);
			setState(285);
			match(T__1);
			setState(286);
			match(T__35);
			setState(287);
			match(T__2);
			setState(288);
			match(T__3);
			setState(289);
			match(T__23);
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
		enterRule(_localctx, 42, RULE_move_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__50);
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
		enterRule(_localctx, 44, RULE_predict);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				predict_funct();
				setState(294);
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
		enterRule(_localctx, 46, RULE_predict_funct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__12);
			setState(300);
			match(T__51);
			setState(301);
			match(T__1);
			setState(302);
			match(T__18);
			setState(303);
			match(T__9);
			setState(304);
			match(T__19);
			setState(305);
			match(T__2);
			setState(306);
			match(T__22);
			setState(307);
			block_predict();
			setState(308);
			match(T__23);
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
		enterRule(_localctx, 48, RULE_block_predict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__26);
			setState(311);
			match(T__14);
			setState(312);
			match(T__18);
			setState(313);
			match(T__27);
			setState(314);
			match(T__28);
			setState(315);
			match(T__3);
			setState(316);
			match(T__29);
			setState(317);
			match(T__14);
			setState(318);
			match(T__30);
			setState(319);
			match(T__1);
			setState(320);
			match(T__26);
			setState(321);
			match(T__2);
			setState(322);
			match(T__3);
			setState(323);
			match(T__31);
			setState(324);
			match(T__32);
			setState(325);
			match(T__33);
			setState(326);
			match(T__34);
			setState(327);
			match(T__22);
			setState(328);
			match(T__35);
			setState(329);
			match(T__14);
			setState(330);
			match(T__36);
			setState(331);
			match(T__27);
			setState(332);
			match(T__37);
			setState(333);
			match(T__3);
			setState(334);
			match(T__38);
			setState(335);
			match(T__14);
			setState(336);
			match(T__39);
			setState(337);
			match(T__1);
			setState(338);
			match(T__35);
			setState(339);
			match(T__2);
			setState(340);
			match(T__3);
			setState(341);
			match(T__23);
			setState(342);
			match(T__52);
			setState(343);
			match(T__43);
			setState(344);
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
		enterRule(_localctx, 50, RULE_predict_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__51);
			setState(347);
			match(T__1);
			setState(348);
			match(T__0);
			setState(349);
			match(T__9);
			setState(350);
			match(T__5);
			setState(351);
			match(T__2);
			setState(352);
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
		public Empty_arrayContext empty_array() {
			return getRuleContext(Empty_arrayContext.class,0);
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
		enterRule(_localctx, 52, RULE_float_array);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__10);
				setState(355);
				array_elem();
				setState(356);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				empty_array();
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
		enterRule(_localctx, 54, RULE_array_elem);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(FLOAT);
				setState(363);
				match(T__9);
				setState(364);
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
		enterRule(_localctx, 56, RULE_empty_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__10);
			setState(368);
			match(T__11);
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

	public static class IntnContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NN_SimulatorParser.INT, 0); }
		public IntnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterIntn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitIntn(this);
		}
	}

	public final IntnContext intn() throws RecognitionException {
		IntnContext _localctx = new IntnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_intn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NN_SimulatorParser.STRING, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(STRING);
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

	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(NN_SimulatorParser.FLOAT, 0); }
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).enterFlotante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NN_SimulatorListener ) ((NN_SimulatorListener)listener).exitFlotante(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00a7\n\f\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"\u00c0\n\20\3\21\3\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u012c"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u016a\n\34\3\35\3\35\3\35\3\35\5\35\u0170"+
		"\n\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\2\2\u0164\2B\3\2\2\2"+
		"\4F\3\2\2\2\6K\3\2\2\2\bQ\3\2\2\2\nZ\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20"+
		"\u0084\3\2\2\2\22\u0086\3\2\2\2\24\u008e\3\2\2\2\26\u00a6\3\2\2\2\30\u00ac"+
		"\3\2\2\2\32\u00b4\3\2\2\2\34\u00b6\3\2\2\2\36\u00bf\3\2\2\2 \u00c5\3\2"+
		"\2\2\"\u00c7\3\2\2\2$\u00d6\3\2\2\2&\u00da\3\2\2\2(\u00de\3\2\2\2*\u0108"+
		"\3\2\2\2,\u0125\3\2\2\2.\u012b\3\2\2\2\60\u012d\3\2\2\2\62\u0138\3\2\2"+
		"\2\64\u015c\3\2\2\2\66\u0169\3\2\2\28\u016f\3\2\2\2:\u0171\3\2\2\2<\u0174"+
		"\3\2\2\2>\u0176\3\2\2\2@\u0178\3\2\2\2BC\5\4\3\2CD\5\30\r\2DE\5\36\20"+
		"\2E\3\3\2\2\2FG\5\6\4\2GH\5\b\5\2HI\5\22\n\2IJ\5\26\f\2J\5\3\2\2\2KL\7"+
		"\3\2\2LM\7\4\2\2MN\5\66\34\2NO\7\5\2\2OP\7\6\2\2P\7\3\2\2\2QR\7\7\2\2"+
		"RS\7\4\2\2ST\5:\36\2TU\7\5\2\2UV\7\6\2\2VW\5\n\6\2WX\5\f\7\2XY\5\20\t"+
		"\2Y\t\3\2\2\2Z[\7\b\2\2[\\\7\4\2\2\\]\5:\36\2]^\7\5\2\2^_\7\6\2\2_\13"+
		"\3\2\2\2`a\7\7\2\2ab\7\t\2\2bc\7\n\2\2cd\7\4\2\2de\5<\37\2ef\7\5\2\2f"+
		"g\7\6\2\2gh\5\16\b\2hi\5\f\7\2il\3\2\2\2jl\3\2\2\2k`\3\2\2\2kj\3\2\2\2"+
		"l\r\3\2\2\2mn\7\b\2\2no\7\t\2\2op\7\13\2\2pq\7\4\2\2qr\5<\37\2rs\7\f\2"+
		"\2st\5<\37\2tu\7\5\2\2uv\7\6\2\2v\17\3\2\2\2wx\7\7\2\2xy\7\r\2\2yz\5<"+
		"\37\2z{\7\16\2\2{|\7\t\2\2|}\7\17\2\2}~\7\4\2\2~\177\5> \2\177\u0080\7"+
		"\5\2\2\u0080\u0081\7\6\2\2\u0081\u0082\5\20\t\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084w\3\2\2\2\u0084\u0083\3\2\2\2\u0085\21\3\2\2\2\u0086"+
		"\u0087\7\20\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5<\37\2\u0089\u008a\7"+
		"\5\2\2\u008a\u008b\7\6\2\2\u008b\u008c\5\16\b\2\u008c\u008d\5\24\13\2"+
		"\u008d\23\3\2\2\2\u008e\u008f\7\20\2\2\u008f\u0090\7\t\2\2\u0090\u0091"+
		"\7\17\2\2\u0091\u0092\7\4\2\2\u0092\u0093\5> \2\u0093\u0094\7\5\2\2\u0094"+
		"\u0095\7\6\2\2\u0095\25\3\2\2\2\u0096\u0097\7\b\2\2\u0097\u0098\7\r\2"+
		"\2\u0098\u0099\5<\37\2\u0099\u009a\7\16\2\2\u009a\u009b\7\r\2\2\u009b"+
		"\u009c\5<\37\2\u009c\u009d\7\16\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5"+
		"<\37\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2\5@!\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\27\3\2\2\2\u00a8"+
		"\u00a9\5\32\16\2\u00a9\u00aa\5\34\17\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\31\3\2\2\2\u00ae"+
		"\u00af\7\22\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\5<\37\2\u00b1\u00b2\7"+
		"\6\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\7\21"+
		"\2\2\u00b8\u00b9\7;\2\2\u00b9\u00ba\7\6\2\2\u00ba\35\3\2\2\2\u00bb\u00bc"+
		"\5 \21\2\u00bc\u00bd\5.\30\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\5\"\22"+
		"\2\u00c2\u00c3\5&\24\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6!\3\2\2\2\u00c7\u00c8\7\17\2\2\u00c8"+
		"\u00c9\7\24\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7"+
		"\f\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\7\27\2\2\u00cf"+
		"\u00d0\7\f\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\7"+
		"\31\2\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\7\32\2\2\u00d5#\3\2\2\2\u00d6"+
		"\u00d7\5(\25\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\5,\27\2\u00d9%\3\2\2\2"+
		"\u00da\u00db\7\24\2\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\7\5\2\2\u00dd\'"+
		"\3\2\2\2\u00de\u00df\7\33\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\7\34\2"+
		"\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5"+
		"\7\20\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8\7\35\2\2"+
		"\u00e8\u00e9\7\21\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00eb\7\36\2\2\u00eb"+
		"\u00ec\7\37\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\7\21"+
		"\2\2\u00ef\u00f0\7!\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\7\35\2\2\u00f2"+
		"\u00f3\7\5\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7#"+
		"\2\2\u00f6\u00f7\7$\2\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\7\31\2\2\u00f9"+
		"\u00fa\7&\2\2\u00fa\u00fb\7\21\2\2\u00fb\u00fc\7\'\2\2\u00fc\u00fd\7\36"+
		"\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0100\7)\2\2\u0100\u0101"+
		"\7\21\2\2\u0101\u0102\7*\2\2\u0102\u0103\7\4\2\2\u0103\u0104\7&\2\2\u0104"+
		"\u0105\7\5\2\2\u0105\u0106\7\6\2\2\u0106\u0107\7\32\2\2\u0107)\3\2\2\2"+
		"\u0108\u0109\7+\2\2\u0109\u010a\7\21\2\2\u010a\u010b\7\4\2\2\u010b\u010c"+
		"\7,\2\2\u010c\u010d\7-\2\2\u010d\u010e\7.\2\2\u010e\u010f\7\5\2\2\u010f"+
		"\u0110\7/\2\2\u0110\u0111\7\60\2\2\u0111\u0112\7\"\2\2\u0112\u0113\7\61"+
		"\2\2\u0113\u0114\7$\2\2\u0114\u0115\7\62\2\2\u0115\u0116\7\31\2\2\u0116"+
		"\u0117\7&\2\2\u0117\u0118\7\21\2\2\u0118\u0119\7\63\2\2\u0119\u011a\7"+
		"\36\2\2\u011a\u011b\7\64\2\2\u011b\u011c\7\6\2\2\u011c\u011d\7)\2\2\u011d"+
		"\u011e\7\21\2\2\u011e\u011f\7*\2\2\u011f\u0120\7\4\2\2\u0120\u0121\7&"+
		"\2\2\u0121\u0122\7\5\2\2\u0122\u0123\7\6\2\2\u0123\u0124\7\32\2\2\u0124"+
		"+\3\2\2\2\u0125\u0126\7\65\2\2\u0126-\3\2\2\2\u0127\u0128\5\60\31\2\u0128"+
		"\u0129\5\64\33\2\u0129\u012c\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0127\3"+
		"\2\2\2\u012b\u012a\3\2\2\2\u012c/\3\2\2\2\u012d\u012e\7\17\2\2\u012e\u012f"+
		"\7\66\2\2\u012f\u0130\7\4\2\2\u0130\u0131\7\25\2\2\u0131\u0132\7\f\2\2"+
		"\u0132\u0133\7\26\2\2\u0133\u0134\7\5\2\2\u0134\u0135\7\31\2\2\u0135\u0136"+
		"\5\62\32\2\u0136\u0137\7\32\2\2\u0137\61\3\2\2\2\u0138\u0139\7\35\2\2"+
		"\u0139\u013a\7\21\2\2\u013a\u013b\7\25\2\2\u013b\u013c\7\36\2\2\u013c"+
		"\u013d\7\37\2\2\u013d\u013e\7\6\2\2\u013e\u013f\7 \2\2\u013f\u0140\7\21"+
		"\2\2\u0140\u0141\7!\2\2\u0141\u0142\7\4\2\2\u0142\u0143\7\35\2\2\u0143"+
		"\u0144\7\5\2\2\u0144\u0145\7\6\2\2\u0145\u0146\7\"\2\2\u0146\u0147\7#"+
		"\2\2\u0147\u0148\7$\2\2\u0148\u0149\7%\2\2\u0149\u014a\7\31\2\2\u014a"+
		"\u014b\7&\2\2\u014b\u014c\7\21\2\2\u014c\u014d\7\'\2\2\u014d\u014e\7\36"+
		"\2\2\u014e\u014f\7(\2\2\u014f\u0150\7\6\2\2\u0150\u0151\7)\2\2\u0151\u0152"+
		"\7\21\2\2\u0152\u0153\7*\2\2\u0153\u0154\7\4\2\2\u0154\u0155\7&\2\2\u0155"+
		"\u0156\7\5\2\2\u0156\u0157\7\6\2\2\u0157\u0158\7\32\2\2\u0158\u0159\7"+
		"\67\2\2\u0159\u015a\7.\2\2\u015a\u015b\7\6\2\2\u015b\63\3\2\2\2\u015c"+
		"\u015d\7\66\2\2\u015d\u015e\7\4\2\2\u015e\u015f\7\3\2\2\u015f\u0160\7"+
		"\f\2\2\u0160\u0161\7\b\2\2\u0161\u0162\7\5\2\2\u0162\u0163\7\6\2\2\u0163"+
		"\65\3\2\2\2\u0164\u0165\7\r\2\2\u0165\u0166\58\35\2\u0166\u0167\7\16\2"+
		"\2\u0167\u016a\3\2\2\2\u0168\u016a\5:\36\2\u0169\u0164\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\67\3\2\2\2\u016b\u0170\7;\2\2\u016c\u016d\7;\2\2\u016d"+
		"\u016e\7\f\2\2\u016e\u0170\58\35\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2"+
		"\2\2\u01709\3\2\2\2\u0171\u0172\7\r\2\2\u0172\u0173\7\16\2\2\u0173;\3"+
		"\2\2\2\u0174\u0175\7:\2\2\u0175=\3\2\2\2\u0176\u0177\7<\2\2\u0177?\3\2"+
		"\2\2\u0178\u0179\7;\2\2\u0179A\3\2\2\2\fk\u0084\u00a6\u00ac\u00b4\u00bf"+
		"\u00c5\u012b\u0169\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}