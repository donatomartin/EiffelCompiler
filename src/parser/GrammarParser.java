// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, LINE_COMMENT=50, MULTILINE_COMMENT=51, 
		WHITESPACE=52, INT_LITERAL=53, REAL_LITERAL=54, CHAR_LITERAL=55, IDENT=56;
	public static final int
		RULE_program = 0, RULE_globalSection = 1, RULE_globalTypesSection = 2, 
		RULE_typeDefinition = 3, RULE_globalVarsSection = 4, RULE_createSection = 5, 
		RULE_featureCreations = 6, RULE_featureDefinition = 7, RULE_localVarsSection = 8, 
		RULE_run = 9, RULE_expression = 10, RULE_statement = 11, RULE_varDefinition = 12, 
		RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalSection", "globalTypesSection", "typeDefinition", "globalVarsSection", 
			"createSection", "featureCreations", "featureDefinition", "localVarsSection", 
			"run", "expression", "statement", "varDefinition", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'end'", "'global'", "'types'", "'deftuple'", 
			"'as'", "'vars'", "'create'", "'feature'", "'('", "':'", "','", "')'", 
			"'is'", "'do'", "'local'", "'run'", "'.'", "'['", "']'", "'to'", "'<'", 
			"'>'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<='", "'>='", "'!='", "'=='", 
			"'&&'", "'||'", "'!'", "'print'", "'println'", "'read'", "':='", "'if'", 
			"'{'", "'}'", "'else'", "'while'", "'return'", "'INTEGER'", "'DOUBLE'", 
			"'CHARACTER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE", "INT_LITERAL", 
			"REAL_LITERAL", "CHAR_LITERAL", "IDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CreateSectionContext createSection() {
			return getRuleContext(CreateSectionContext.class,0);
		}
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public GlobalSectionContext globalSection() {
			return getRuleContext(GlobalSectionContext.class,0);
		}
		public List<FeatureDefinitionContext> featureDefinition() {
			return getRuleContexts(FeatureDefinitionContext.class);
		}
		public FeatureDefinitionContext featureDefinition(int i) {
			return getRuleContext(FeatureDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(IDENT);
			setState(30);
			match(T__1);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(31);
				globalSection();
				}
			}

			setState(34);
			createSection();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(35);
				featureDefinition();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(T__2);
			setState(42);
			run();
			setState(43);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalSectionContext extends ParserRuleContext {
		public GlobalTypesSectionContext globalTypesSection() {
			return getRuleContext(GlobalTypesSectionContext.class,0);
		}
		public GlobalVarsSectionContext globalVarsSection() {
			return getRuleContext(GlobalVarsSectionContext.class,0);
		}
		public GlobalSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalSection; }
	}

	public final GlobalSectionContext globalSection() throws RecognitionException {
		GlobalSectionContext _localctx = new GlobalSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(46);
				globalTypesSection();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(49);
				globalVarsSection();
				}
			}

			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalTypesSectionContext extends ParserRuleContext {
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public GlobalTypesSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalTypesSection; }
	}

	public final GlobalTypesSectionContext globalTypesSection() throws RecognitionException {
		GlobalTypesSectionContext _localctx = new GlobalTypesSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalTypesSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(53);
				typeDefinition();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__5);
			setState(60);
			match(IDENT);
			setState(61);
			match(T__6);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(62);
				varDefinition();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVarsSectionContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public GlobalVarsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVarsSection; }
	}

	public final GlobalVarsSectionContext globalVarsSection() throws RecognitionException {
		GlobalVarsSectionContext _localctx = new GlobalVarsSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalVarsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__7);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(71);
				varDefinition();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateSectionContext extends ParserRuleContext {
		public FeatureCreationsContext featureCreations() {
			return getRuleContext(FeatureCreationsContext.class,0);
		}
		public CreateSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSection; }
	}

	public final CreateSectionContext createSection() throws RecognitionException {
		CreateSectionContext _localctx = new CreateSectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__8);
			setState(78);
			featureCreations();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureCreationsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public FeatureCreationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureCreations; }
	}

	public final FeatureCreationsContext featureCreations() throws RecognitionException {
		FeatureCreationsContext _localctx = new FeatureCreationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_featureCreations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(80);
				match(IDENT);
				setState(81);
				match(T__1);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public LocalVarsSectionContext localVarsSection() {
			return getRuleContext(LocalVarsSectionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FeatureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDefinition; }
	}

	public final FeatureDefinitionContext featureDefinition() throws RecognitionException {
		FeatureDefinitionContext _localctx = new FeatureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_featureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__9);
			setState(88);
			match(IDENT);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(89);
				match(T__10);
				setState(90);
				match(IDENT);
				setState(91);
				match(T__11);
				setState(92);
				type();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(93);
					match(T__12);
					setState(94);
					match(IDENT);
					setState(95);
					match(T__11);
					setState(96);
					type();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(T__13);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(106);
				match(T__11);
				setState(107);
				type();
				}
			}

			setState(110);
			match(T__14);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(111);
				localVarsSection();
				}
			}

			setState(114);
			match(T__15);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 135216771756984320L) != 0) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarsSectionContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public LocalVarsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarsSection; }
	}

	public final LocalVarsSectionContext localVarsSection() throws RecognitionException {
		LocalVarsSectionContext _localctx = new LocalVarsSectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localVarsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__16);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(124);
				varDefinition();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RunContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__17);
			setState(131);
			match(IDENT);
			setState(132);
			match(T__10);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 135108057544787968L) != 0) {
				{
				setState(133);
				expression(0);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(134);
					match(T__12);
					setState(135);
					expression(0);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			match(T__13);
			setState(144);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext e;
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(GrammarParser.REAL_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(147);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(148);
				match(INT_LITERAL);
				}
				break;
			case 3:
				{
				setState(149);
				match(REAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(150);
				match(CHAR_LITERAL);
				}
				break;
			case 5:
				{
				setState(151);
				match(IDENT);
				setState(152);
				match(T__10);
				setState(153);
				expression(0);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(154);
					match(T__12);
					setState(155);
					expression(0);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(163);
				match(T__10);
				setState(164);
				expression(0);
				setState(165);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(167);
				match(T__21);
				setState(168);
				match(T__22);
				setState(169);
				type();
				setState(170);
				match(T__23);
				setState(171);
				match(T__10);
				setState(172);
				expression(0);
				setState(173);
				match(T__13);
				}
				break;
			case 8:
				{
				setState(175);
				match(T__35);
				setState(176);
				((ExpressionContext)_localctx).e = expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(180);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						((ExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(183);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						((ExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(186);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3246391296L) != 0) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						((ExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(192);
						match(T__33);
						setState(193);
						((ExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						match(T__34);
						setState(196);
						((ExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(198);
						match(T__18);
						setState(199);
						match(IDENT);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(201);
						match(T__19);
						setState(202);
						((ExpressionContext)_localctx).right = expression(0);
						setState(203);
						match(T__20);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext e;
		public ExpressionContext left;
		public ExpressionContext right;
		public StatementContext statement;
		public List<StatementContext> ifStatements = new ArrayList<StatementContext>();
		public List<StatementContext> elseStatements = new ArrayList<StatementContext>();
		public List<StatementContext> loopStatements = new ArrayList<StatementContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				expression(0);
				setState(212);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__38);
				setState(215);
				expression(0);
				setState(216);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				((StatementContext)_localctx).e = expression(0);
				setState(219);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				((StatementContext)_localctx).left = expression(0);
				setState(222);
				match(T__39);
				setState(223);
				((StatementContext)_localctx).right = expression(0);
				setState(224);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(T__40);
				setState(227);
				match(T__10);
				setState(228);
				((StatementContext)_localctx).e = expression(0);
				setState(229);
				match(T__13);
				setState(230);
				match(T__41);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 135216771756984320L) != 0) {
					{
					{
					setState(231);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__42);
				setState(238);
				match(T__43);
				setState(239);
				match(T__41);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 135216771756984320L) != 0) {
					{
					{
					setState(240);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).elseStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__42);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(T__40);
				setState(249);
				match(T__10);
				setState(250);
				((StatementContext)_localctx).e = expression(0);
				setState(251);
				match(T__13);
				setState(252);
				match(T__41);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 135216771756984320L) != 0) {
					{
					{
					setState(253);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(T__42);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				match(T__44);
				setState(262);
				match(T__10);
				setState(263);
				((StatementContext)_localctx).e = expression(0);
				setState(264);
				match(T__13);
				setState(265);
				match(T__41);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 135216771756984320L) != 0) {
					{
					{
					setState(266);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).loopStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__42);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				match(T__45);
				setState(275);
				((StatementContext)_localctx).e = expression(0);
				setState(276);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(278);
				match(T__45);
				setState(279);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IDENT);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(283);
				match(T__12);
				setState(284);
				match(IDENT);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(T__11);
			setState(291);
			type();
			setState(292);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(T__48);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(T__19);
				setState(298);
				match(INT_LITERAL);
				setState(299);
				match(T__20);
				setState(300);
				type();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				match(IDENT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0131\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000!\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000\n\u0000"+
		"\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0003\u00013\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002:\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003@\b\u0003"+
		"\n\u0003\f\u0003C\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006S\b\u0006\n\u0006\f\u0006"+
		"V\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"b\b\u0007\n\u0007\f\u0007e\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"i\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007q\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007"+
		"\n\u0007\f\u0007x\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005"+
		"\b~\b\b\n\b\f\b\u0081\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0089\b\t\n\t\f\t\u008c\t\t\u0003\t\u008e\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u009d\b\n\n\n\f\n\u00a0\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n"+
		"\n\f\n\u00d1\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00e9\b\u000b\n\u000b\f\u000b\u00ec\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f2\b\u000b\n\u000b\f\u000b\u00f5"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ff\b\u000b\n\u000b\f\u000b"+
		"\u0102\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010c\b\u000b\n\u000b"+
		"\f\u000b\u010f\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0119\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u011e\b\f\n\f\f\f\u0121\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u012f\b\r\u0001\r\u0000\u0001\u0014\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0005"+
		"\u0001\u0000\u0019\u001b\u0001\u0000\u001c\u001d\u0002\u0000\u0017\u0018"+
		"\u001e\u001f\u0001\u0000 !\u0001\u0000%&\u0153\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000"+
		"\u0006;\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nM\u0001\u0000"+
		"\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000"+
		"\u0010{\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014"+
		"\u00b1\u0001\u0000\u0000\u0000\u0016\u0118\u0001\u0000\u0000\u0000\u0018"+
		"\u011a\u0001\u0000\u0000\u0000\u001a\u012e\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u00058\u0000\u0000\u001e \u0005"+
		"\u0002\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"&\u0003\n"+
		"\u0005\u0000#%\u0003\u000e\u0007\u0000$#\u0001\u0000\u0000\u0000%(\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u0003\u0000"+
		"\u0000*+\u0003\u0012\t\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000"+
		"\u0000\u0000-/\u0005\u0004\u0000\u0000.0\u0003\u0004\u0002\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u0000"+
		"13\u0003\b\u0004\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3\u0003\u0001\u0000\u0000\u000048\u0005\u0005\u0000\u000057\u0003\u0006"+
		"\u0003\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0006\u0000\u0000<=\u00058\u0000"+
		"\u0000=A\u0005\u0007\u0000\u0000>@\u0003\u0018\f\u0000?>\u0001\u0000\u0000"+
		"\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0003\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FJ\u0005\b\u0000\u0000"+
		"GI\u0003\u0018\f\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\t\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\t\u0000\u0000NO\u0003\f\u0006"+
		"\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u00058\u0000\u0000QS\u0005\u0002"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0005\n\u0000\u0000Xh\u00058\u0000\u0000"+
		"YZ\u0005\u000b\u0000\u0000Z[\u00058\u0000\u0000[\\\u0005\f\u0000\u0000"+
		"\\c\u0003\u001a\r\u0000]^\u0005\r\u0000\u0000^_\u00058\u0000\u0000_`\u0005"+
		"\f\u0000\u0000`b\u0003\u001a\r\u0000a]\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u000e\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hY\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jk\u0005\f\u0000\u0000km\u0003\u001a"+
		"\r\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0005\u000f\u0000\u0000oq\u0003\u0010\b\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0005"+
		"\u0010\u0000\u0000su\u0003\u0016\u000b\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0003"+
		"\u0000\u0000z\u000f\u0001\u0000\u0000\u0000{\u007f\u0005\u0011\u0000\u0000"+
		"|~\u0003\u0018\f\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u0012\u0000\u0000\u0083\u0084\u00058\u0000\u0000\u0084"+
		"\u008d\u0005\u000b\u0000\u0000\u0085\u008a\u0003\u0014\n\u0000\u0086\u0087"+
		"\u0005\r\u0000\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0085\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0005"+
		"\u0002\u0000\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0093\u0006"+
		"\n\uffff\uffff\u0000\u0093\u00b2\u00058\u0000\u0000\u0094\u00b2\u0005"+
		"5\u0000\u0000\u0095\u00b2\u00056\u0000\u0000\u0096\u00b2\u00057\u0000"+
		"\u0000\u0097\u0098\u00058\u0000\u0000\u0098\u0099\u0005\u000b\u0000\u0000"+
		"\u0099\u009e\u0003\u0014\n\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b"+
		"\u009d\u0003\u0014\n\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000\u00a2\u00b2"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4\u00a5"+
		"\u0003\u0014\n\u0000\u00a5\u00a6\u0005\u000e\u0000\u0000\u00a6\u00b2\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0017\u0000\u0000\u00a9\u00aa\u0003\u001a\r\u0000\u00aa\u00ab\u0005\u0018"+
		"\u0000\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac\u00ad\u0003\u0014"+
		"\n\u0000\u00ad\u00ae\u0005\u000e\u0000\u0000\u00ae\u00b2\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005$\u0000\u0000\u00b0\u00b2\u0003\u0014\n\u0001"+
		"\u00b1\u0092\u0001\u0000\u0000\u0000\u00b1\u0094\u0001\u0000\u0000\u0000"+
		"\u00b1\u0095\u0001\u0000\u0000\u0000\u00b1\u0096\u0001\u0000\u0000\u0000"+
		"\u00b1\u0097\u0001\u0000\u0000\u0000\u00b1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00cf\u0001\u0000\u0000\u0000\u00b3\u00b4\n\u0007\u0000\u0000\u00b4"+
		"\u00b5\u0007\u0000\u0000\u0000\u00b5\u00ce\u0003\u0014\n\b\u00b6\u00b7"+
		"\n\u0006\u0000\u0000\u00b7\u00b8\u0007\u0001\u0000\u0000\u00b8\u00ce\u0003"+
		"\u0014\n\u0007\u00b9\u00ba\n\u0005\u0000\u0000\u00ba\u00bb\u0007\u0002"+
		"\u0000\u0000\u00bb\u00ce\u0003\u0014\n\u0006\u00bc\u00bd\n\u0004\u0000"+
		"\u0000\u00bd\u00be\u0007\u0003\u0000\u0000\u00be\u00ce\u0003\u0014\n\u0005"+
		"\u00bf\u00c0\n\u0003\u0000\u0000\u00c0\u00c1\u0005\"\u0000\u0000\u00c1"+
		"\u00ce\u0003\u0014\n\u0004\u00c2\u00c3\n\u0002\u0000\u0000\u00c3\u00c4"+
		"\u0005#\u0000\u0000\u00c4\u00ce\u0003\u0014\n\u0003\u00c5\u00c6\n\u000b"+
		"\u0000\u0000\u00c6\u00c7\u0005\u0013\u0000\u0000\u00c7\u00ce\u00058\u0000"+
		"\u0000\u00c8\u00c9\n\n\u0000\u0000\u00c9\u00ca\u0005\u0014\u0000\u0000"+
		"\u00ca\u00cb\u0003\u0014\n\u0000\u00cb\u00cc\u0005\u0015\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00b3\u0001\u0000\u0000\u0000\u00cd"+
		"\u00b6\u0001\u0000\u0000\u0000\u00cd\u00b9\u0001\u0000\u0000\u0000\u00cd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00cd\u00bf\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c2\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u0015\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0007\u0004\u0000\u0000\u00d3\u00d4\u0003\u0014\n\u0000\u00d4\u00d5"+
		"\u0005\u0002\u0000\u0000\u00d5\u0119\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\'\u0000\u0000\u00d7\u00d8\u0003\u0014\n\u0000\u00d8\u00d9\u0005"+
		"\u0002\u0000\u0000\u00d9\u0119\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"\u0014\n\u0000\u00db\u00dc\u0005\u0002\u0000\u0000\u00dc\u0119\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0003\u0014\n\u0000\u00de\u00df\u0005(\u0000"+
		"\u0000\u00df\u00e0\u0003\u0014\n\u0000\u00e0\u00e1\u0005\u0002\u0000\u0000"+
		"\u00e1\u0119\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005)\u0000\u0000\u00e3"+
		"\u00e4\u0005\u000b\u0000\u0000\u00e4\u00e5\u0003\u0014\n\u0000\u00e5\u00e6"+
		"\u0005\u000e\u0000\u0000\u00e6\u00ea\u0005*\u0000\u0000\u00e7\u00e9\u0003"+
		"\u0016\u000b\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee\u00ef\u0005,\u0000"+
		"\u0000\u00ef\u00f3\u0005*\u0000\u0000\u00f0\u00f2\u0003\u0016\u000b\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005+\u0000\u0000\u00f7\u0119\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005)\u0000\u0000\u00f9\u00fa\u0005\u000b\u0000\u0000\u00fa\u00fb"+
		"\u0003\u0014\n\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000\u00fc\u0100\u0005"+
		"*\u0000\u0000\u00fd\u00ff\u0003\u0016\u000b\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005+\u0000"+
		"\u0000\u0104\u0119\u0001\u0000\u0000\u0000\u0105\u0106\u0005-\u0000\u0000"+
		"\u0106\u0107\u0005\u000b\u0000\u0000\u0107\u0108\u0003\u0014\n\u0000\u0108"+
		"\u0109\u0005\u000e\u0000\u0000\u0109\u010d\u0005*\u0000\u0000\u010a\u010c"+
		"\u0003\u0016\u000b\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0005+\u0000\u0000\u0111\u0119\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005.\u0000\u0000\u0113\u0114\u0003\u0014"+
		"\n\u0000\u0114\u0115\u0005\u0002\u0000\u0000\u0115\u0119\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005.\u0000\u0000\u0117\u0119\u0005\u0002\u0000\u0000"+
		"\u0118\u00d2\u0001\u0000\u0000\u0000\u0118\u00d6\u0001\u0000\u0000\u0000"+
		"\u0118\u00da\u0001\u0000\u0000\u0000\u0118\u00dd\u0001\u0000\u0000\u0000"+
		"\u0118\u00e2\u0001\u0000\u0000\u0000\u0118\u00f8\u0001\u0000\u0000\u0000"+
		"\u0118\u0105\u0001\u0000\u0000\u0000\u0118\u0112\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u0017\u0001\u0000\u0000\u0000"+
		"\u011a\u011f\u00058\u0000\u0000\u011b\u011c\u0005\r\u0000\u0000\u011c"+
		"\u011e\u00058\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0005\f\u0000\u0000\u0123\u0124\u0003"+
		"\u001a\r\u0000\u0124\u0125\u0005\u0002\u0000\u0000\u0125\u0019\u0001\u0000"+
		"\u0000\u0000\u0126\u012f\u0005/\u0000\u0000\u0127\u012f\u00050\u0000\u0000"+
		"\u0128\u012f\u00051\u0000\u0000\u0129\u012a\u0005\u0014\u0000\u0000\u012a"+
		"\u012b\u00055\u0000\u0000\u012b\u012c\u0005\u0015\u0000\u0000\u012c\u012f"+
		"\u0003\u001a\r\u0000\u012d\u012f\u00058\u0000\u0000\u012e\u0126\u0001"+
		"\u0000\u0000\u0000\u012e\u0127\u0001\u0000\u0000\u0000\u012e\u0128\u0001"+
		"\u0000\u0000\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u001b\u0001\u0000\u0000\u0000\u001b &/28AJTc"+
		"hlpv\u007f\u008a\u008d\u009e\u00b1\u00cd\u00cf\u00ea\u00f3\u0100\u010d"+
		"\u0118\u011f\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}