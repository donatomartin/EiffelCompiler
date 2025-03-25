// Generated from java-escape by ANTLR 4.11.1
package compiler.parser;

	import compiler.ast.*;
	import compiler.ast.type.*;
	import compiler.ast.statement.*;
	import compiler.ast.expression.*;
	import compiler.ast.definition.*;

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, LINE_COMMENT=52, 
		MULTILINE_COMMENT=53, WHITESPACE=54, INT_LITERAL=55, REAL_LITERAL=56, 
		CHAR_LITERAL=57, IDENT=58;
	public static final int
		RULE_program = 0, RULE_globalSection = 1, RULE_globalTypesSection = 2, 
		RULE_typeDefinition = 3, RULE_globalVarsSection = 4, RULE_createSection = 5, 
		RULE_featureCreations = 6, RULE_featureDefinition = 7, RULE_localVarsSection = 8, 
		RULE_parameters = 9, RULE_varDefinitions = 10, RULE_varDefinition = 11, 
		RULE_run = 12, RULE_expression = 13, RULE_arguments = 14, RULE_expressions = 15, 
		RULE_statement = 16, RULE_fromClause = 17, RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalSection", "globalTypesSection", "typeDefinition", "globalVarsSection", 
			"createSection", "featureCreations", "featureDefinition", "localVarsSection", 
			"parameters", "varDefinitions", "varDefinition", "run", "expression", 
			"arguments", "expressions", "statement", "fromClause", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'end'", "'global'", "'types'", "'deftuple'", 
			"'as'", "'vars'", "'create'", "'feature'", "':'", "'is'", "'do'", "'local'", 
			"'('", "','", "')'", "'run'", "'['", "']'", "'.'", "'-'", "'not'", "'to'", 
			"'<'", "'>'", "'*'", "'/'", "'%'", "'+'", "'<='", "'>='", "'<>'", "'='", 
			"'and'", "'or'", "'print'", "'println'", "'read'", "':='", "'if'", "'{'", 
			"'}'", "'else'", "'until'", "'loop'", "'return'", "'from'", "'INTEGER'", 
			"'DOUBLE'", "'CHARACTER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE", 
			"INT_LITERAL", "REAL_LITERAL", "CHAR_LITERAL", "IDENT"
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
		public Program ast;
		public Token IDENT;
		public GlobalSectionContext globalSection;
		public CreateSectionContext createSection;
		public FeatureDefinitionContext featureDefinition;
		public List<FeatureDefinitionContext> featureDefinitions = new ArrayList<FeatureDefinitionContext>();
		public RunContext run;
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
			setState(38);
			match(T__0);
			setState(39);
			((ProgramContext)_localctx).IDENT = match(IDENT);
			setState(40);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(41);
				((ProgramContext)_localctx).globalSection = globalSection();
				}
			}

			setState(44);
			((ProgramContext)_localctx).createSection = createSection();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(45);
				((ProgramContext)_localctx).featureDefinition = featureDefinition();
				((ProgramContext)_localctx).featureDefinitions.add(((ProgramContext)_localctx).featureDefinition);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__2);
			setState(52);
			((ProgramContext)_localctx).run = run();
			setState(53);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).IDENT, ((ProgramContext)_localctx).globalSection.ast, ((ProgramContext)_localctx).createSection.list, ((ProgramContext)_localctx).featureDefinitions, ((ProgramContext)_localctx).run.ast); 
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
		public GlobalSection ast;
		public GlobalTypesSectionContext globalTypesSection;
		public GlobalVarsSectionContext globalVarsSection;
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
			setState(56);
			match(T__3);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(57);
				((GlobalSectionContext)_localctx).globalTypesSection = globalTypesSection();
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(60);
				((GlobalSectionContext)_localctx).globalVarsSection = globalVarsSection();
				}
			}

			}
			 ((GlobalSectionContext)_localctx).ast =  new GlobalSection(((GlobalSectionContext)_localctx).globalTypesSection.list, ((GlobalSectionContext)_localctx).globalVarsSection.list); 
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
		public List<StructDefinition> list = new ArrayList<StructDefinition>();
		public TypeDefinitionContext typeDefinition;
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
			setState(65);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(66);
				((GlobalTypesSectionContext)_localctx).typeDefinition = typeDefinition();
				 _localctx.list.add(((GlobalTypesSectionContext)_localctx).typeDefinition.ast); 
				}
				}
				setState(73);
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
		public StructDefinition ast;
		public Token IDENT;
		public VarDefinitionsContext varDefinitions;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__5);
			setState(75);
			((TypeDefinitionContext)_localctx).IDENT = match(IDENT);
			setState(76);
			match(T__6);
			setState(77);
			((TypeDefinitionContext)_localctx).varDefinitions = varDefinitions();
			setState(78);
			match(T__2);
			 ((TypeDefinitionContext)_localctx).ast =  new StructDefinition(((TypeDefinitionContext)_localctx).IDENT, ((TypeDefinitionContext)_localctx).varDefinitions.list); 
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
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public VarDefinitionsContext varDefinitions;
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public GlobalVarsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVarsSection; }
	}

	public final GlobalVarsSectionContext globalVarsSection() throws RecognitionException {
		GlobalVarsSectionContext _localctx = new GlobalVarsSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalVarsSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__7);
			setState(82);
			((GlobalVarsSectionContext)_localctx).varDefinitions = varDefinitions();
			 ((GlobalVarsSectionContext)_localctx).list =  ((GlobalVarsSectionContext)_localctx).varDefinitions.list; 
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
		public List<FunctionCreation> list = new ArrayList<FunctionCreation>();
		public FeatureCreationsContext featureCreations;
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
			setState(85);
			match(T__8);
			setState(86);
			((CreateSectionContext)_localctx).featureCreations = featureCreations();
			 ((CreateSectionContext)_localctx).list =  ((CreateSectionContext)_localctx).featureCreations.list; 
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
		public List<FunctionCreation> list = new ArrayList<FunctionCreation>();
		public Token IDENT;
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
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(89);
				((FeatureCreationsContext)_localctx).IDENT = match(IDENT);
				 _localctx.list.add(new FunctionCreation(((FeatureCreationsContext)_localctx).IDENT)); 
				setState(91);
				match(T__1);
				}
				}
				setState(96);
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
		public FunctionDefinition ast;
		public Token IDENT;
		public ParametersContext parameters;
		public TypeContext type;
		public LocalVarsSectionContext localVarsSection;
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__9);
				setState(98);
				((FeatureDefinitionContext)_localctx).IDENT = match(IDENT);
				setState(99);
				((FeatureDefinitionContext)_localctx).parameters = parameters();
				setState(100);
				match(T__10);
				setState(101);
				((FeatureDefinitionContext)_localctx).type = type();
				setState(102);
				match(T__11);
				setState(103);
				((FeatureDefinitionContext)_localctx).localVarsSection = localVarsSection();
				setState(104);
				match(T__12);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 540892513246937088L) != 0) {
					{
					{
					setState(105);
					((FeatureDefinitionContext)_localctx).statement = statement();
					((FeatureDefinitionContext)_localctx).statements.add(((FeatureDefinitionContext)_localctx).statement);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__2);
				 ((FeatureDefinitionContext)_localctx).ast =  new FunctionDefinition(((FeatureDefinitionContext)_localctx).IDENT, ((FeatureDefinitionContext)_localctx).parameters.list, ((FeatureDefinitionContext)_localctx).type.ast, ((FeatureDefinitionContext)_localctx).localVarsSection.list, ((FeatureDefinitionContext)_localctx).statements); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__9);
				setState(115);
				((FeatureDefinitionContext)_localctx).IDENT = match(IDENT);
				setState(116);
				((FeatureDefinitionContext)_localctx).parameters = parameters();
				setState(117);
				match(T__11);
				setState(118);
				((FeatureDefinitionContext)_localctx).localVarsSection = localVarsSection();
				setState(119);
				match(T__12);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 540892513246937088L) != 0) {
					{
					{
					setState(120);
					((FeatureDefinitionContext)_localctx).statement = statement();
					((FeatureDefinitionContext)_localctx).statements.add(((FeatureDefinitionContext)_localctx).statement);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__2);
				 ((FeatureDefinitionContext)_localctx).ast =  new FunctionDefinition(((FeatureDefinitionContext)_localctx).IDENT, ((FeatureDefinitionContext)_localctx).parameters.list, null, ((FeatureDefinitionContext)_localctx).localVarsSection.list, ((FeatureDefinitionContext)_localctx).statements); 
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
	public static class LocalVarsSectionContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public VarDefinitionsContext varDefinitions;
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(131);
				match(T__13);
				setState(132);
				((LocalVarsSectionContext)_localctx).varDefinitions = varDefinitions();
				 ((LocalVarsSectionContext)_localctx).list =  ((LocalVarsSectionContext)_localctx).varDefinitions.list; 
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
	public static class ParametersContext extends ParserRuleContext {
		public List<Parameter> list = new ArrayList<Parameter>();
		public Token i1;
		public TypeContext t1;
		public Token i2;
		public TypeContext t2;
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
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(137);
				match(T__14);
				setState(138);
				((ParametersContext)_localctx).i1 = match(IDENT);
				setState(139);
				match(T__10);
				setState(140);
				((ParametersContext)_localctx).t1 = type();
				 _localctx.list.add(new Parameter(((ParametersContext)_localctx).i1.getText(), ((ParametersContext)_localctx).t1.ast)); 
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(142);
					match(T__15);
					setState(143);
					((ParametersContext)_localctx).i2 = match(IDENT);
					setState(144);
					match(T__10);
					setState(145);
					((ParametersContext)_localctx).t2 = type();
					 _localctx.list.add(new Parameter(((ParametersContext)_localctx).i2.getText(), ((ParametersContext)_localctx).t2.ast)); 
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__16);
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
	public static class VarDefinitionsContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public VarDefinitionContext varDefinition;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(157);
				((VarDefinitionsContext)_localctx).varDefinition = varDefinition();
				setState(158);
				match(T__1);
				 _localctx.list.add(((VarDefinitionsContext)_localctx).varDefinition.ast); 
				}
				}
				setState(165);
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
	public static class VarDefinitionContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token IDENT;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((VarDefinitionContext)_localctx).IDENT = match(IDENT);
			((VarDefinitionContext)_localctx).ids.add(((VarDefinitionContext)_localctx).IDENT);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(167);
				match(T__15);
				setState(168);
				((VarDefinitionContext)_localctx).IDENT = match(IDENT);
				((VarDefinitionContext)_localctx).ids.add(((VarDefinitionContext)_localctx).IDENT);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__10);
			setState(175);
			((VarDefinitionContext)_localctx).type = type();
			 
			          List<String> variableNames = new ArrayList<>();
			          for (Token id : ((VarDefinitionContext)_localctx).ids) {
			              variableNames.add(id.getText());
			          }
			          ((VarDefinitionContext)_localctx).ast =  new VarDefinition(variableNames, ((VarDefinitionContext)_localctx).type.ast); 
			      
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
		public Run ast;
		public Token IDENT;
		public ArgumentsContext arguments;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_run);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__17);
			setState(179);
			((RunContext)_localctx).IDENT = match(IDENT);
			setState(180);
			match(T__14);
			setState(181);
			((RunContext)_localctx).arguments = arguments();
			setState(182);
			match(T__16);
			setState(183);
			match(T__1);
			 ((RunContext)_localctx).ast =  new Run(((RunContext)_localctx).IDENT, ((RunContext)_localctx).arguments.list); 
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
		public Expression ast;
		public ExpressionContext left;
		public ExpressionContext e;
		public Token IDENT;
		public Token INT_LITERAL;
		public Token REAL_LITERAL;
		public Token CHAR_LITERAL;
		public ArgumentsContext arguments;
		public Token operator;
		public ExpressionContext expression;
		public TypeContext type;
		public ExpressionContext right;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(GrammarParser.REAL_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(187);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).IDENT); 
				}
				break;
			case 2:
				{
				setState(189);
				((ExpressionContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_LITERAL); 
				}
				break;
			case 3:
				{
				setState(191);
				((ExpressionContext)_localctx).REAL_LITERAL = match(REAL_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_LITERAL); 
				}
				break;
			case 4:
				{
				setState(193);
				((ExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_LITERAL); 
				}
				break;
			case 5:
				{
				setState(195);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				setState(196);
				match(T__14);
				setState(197);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(198);
				match(T__16);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).IDENT, ((ExpressionContext)_localctx).arguments.list); 
				}
				break;
			case 6:
				{
				setState(201);
				((ExpressionContext)_localctx).operator = match(T__21);
				setState(202);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(10);
				 ((ExpressionContext)_localctx).ast =  new ArithmeticUnary(((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).e.ast); 
				}
				break;
			case 7:
				{
				setState(205);
				match(T__14);
				setState(206);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(0);
				setState(207);
				match(T__16);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e.ast; 
				}
				break;
			case 8:
				{
				setState(210);
				((ExpressionContext)_localctx).operator = match(T__22);
				setState(211);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(8);
				 ((ExpressionContext)_localctx).ast =  new LogicUnary(((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).e.ast); 
				}
				break;
			case 9:
				{
				setState(214);
				match(T__23);
				setState(215);
				match(T__24);
				setState(216);
				((ExpressionContext)_localctx).type = type();
				setState(217);
				match(T__25);
				setState(218);
				match(T__14);
				setState(219);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(220);
				match(T__16);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new ArithmeticBinary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(231);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__29) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						 ((ExpressionContext)_localctx).ast =  new ArithmeticBinary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(236);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6543114240L) != 0) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(237);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						 ((ExpressionContext)_localctx).ast =  new LogicBinary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						 ((ExpressionContext)_localctx).ast =  new LogicBinary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						((ExpressionContext)_localctx).operator = match(T__34);
						setState(247);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
						 ((ExpressionContext)_localctx).ast =  new LogicBinary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(251);
						((ExpressionContext)_localctx).operator = match(T__35);
						setState(252);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(2);
						 ((ExpressionContext)_localctx).ast =  new LogicBinary(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operator, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(256);
						match(T__18);
						setState(257);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(258);
						match(T__19);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(262);
						match(T__20);
						setState(263);
						((ExpressionContext)_localctx).IDENT = match(IDENT);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).e.ast, ((ExpressionContext)_localctx).IDENT); 
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955313852416L) != 0) {
				{
				setState(270);
				((ArgumentsContext)_localctx).e1 = expression(0);
				 _localctx.list.add(((ArgumentsContext)_localctx).e1.ast); 
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(272);
					match(T__15);
					setState(273);
					((ArgumentsContext)_localctx).e2 = expression(0);
					 _localctx.list.add(((ArgumentsContext)_localctx).e2.ast); 
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955313852416L) != 0) {
				{
				setState(283);
				((ExpressionsContext)_localctx).e1 = expression(0);
				 _localctx.list.add(((ExpressionsContext)_localctx).e1.ast); 
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(285);
					match(T__15);
					setState(286);
					((ExpressionsContext)_localctx).e2 = expression(0);
					 _localctx.list.add(((ExpressionsContext)_localctx).e2.ast); 
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionsContext expressions;
		public ExpressionContext expression;
		public ExpressionContext e;
		public ExpressionContext left;
		public ExpressionContext right;
		public StatementContext statement;
		public List<StatementContext> ifStatements = new ArrayList<StatementContext>();
		public List<StatementContext> elseStatements = new ArrayList<StatementContext>();
		public FromClauseContext fromClause;
		public List<StatementContext> loopStatements = new ArrayList<StatementContext>();
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
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
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				((StatementContext)_localctx).expressions = expressions();
				setState(298);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).expressions.list); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__38);
				setState(302);
				((StatementContext)_localctx).expression = expression(0);
				setState(303);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				((StatementContext)_localctx).e = expression(0);
				setState(307);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Call(((StatementContext)_localctx).e.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				((StatementContext)_localctx).left = expression(0);
				setState(311);
				match(T__39);
				setState(312);
				((StatementContext)_localctx).right = expression(0);
				setState(313);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				match(T__40);
				setState(317);
				match(T__14);
				setState(318);
				((StatementContext)_localctx).e = expression(0);
				setState(319);
				match(T__16);
				setState(320);
				match(T__41);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 540892513246937088L) != 0) {
					{
					{
					setState(321);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(T__42);
				setState(328);
				match(T__43);
				setState(329);
				match(T__41);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 540892513246937088L) != 0) {
					{
					{
					setState(330);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).elseStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(T__42);
				 ((StatementContext)_localctx).ast =  new Conditional(((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).ifStatements, ((StatementContext)_localctx).elseStatements); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(T__40);
				setState(340);
				match(T__14);
				setState(341);
				((StatementContext)_localctx).e = expression(0);
				setState(342);
				match(T__16);
				setState(343);
				match(T__41);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 540892513246937088L) != 0) {
					{
					{
					setState(344);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(T__42);
				 ((StatementContext)_localctx).ast =  new Conditional(((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).ifStatements, null); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(353);
					((StatementContext)_localctx).fromClause = fromClause();
					}
				}

				setState(356);
				match(T__44);
				setState(357);
				((StatementContext)_localctx).e = expression(0);
				setState(358);
				match(T__45);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 540892513246937088L) != 0) {
					{
					{
					setState(359);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).loopStatements.add(((StatementContext)_localctx).statement);
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				match(T__2);
				 ((StatementContext)_localctx).ast =  new Loop(((StatementContext)_localctx).fromClause.list, ((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).loopStatements); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				match(T__46);
				setState(369);
				((StatementContext)_localctx).e = expression(0);
				setState(370);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).e.ast); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(373);
				match(T__46);
				setState(374);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Return(null); 
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
	public static class FromClauseContext extends ParserRuleContext {
		public List<Statement> list = new ArrayList<Statement>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__47);
			{
			setState(379);
			((FromClauseContext)_localctx).e1 = expression(0);
			setState(380);
			match(T__39);
			setState(381);
			((FromClauseContext)_localctx).e2 = expression(0);
			setState(382);
			match(T__1);
			 _localctx.list.add(new Assignment(((FromClauseContext)_localctx).e1.ast, ((FromClauseContext)_localctx).e2.ast)); 
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
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token INT_LITERAL;
		public TypeContext type;
		public Token IDENT;
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
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T__48);
				 ((TypeContext)_localctx).ast =  new IntType(); 
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__49);
				 ((TypeContext)_localctx).ast =  new RealType(); 
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(T__50);
				 ((TypeContext)_localctx).ast =  new CharType(); 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(T__18);
				setState(392);
				((TypeContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(393);
				match(T__19);
				setState(394);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).INT_LITERAL, ((TypeContext)_localctx).type.ast); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).IDENT); 
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u0192\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006]\b\u0006\n\u0006"+
		"\f\u0006`\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007k\b"+
		"\u0007\n\u0007\f\u0007n\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0095\b\t\n\t\f\t\u0098\t\t"+
		"\u0001\t\u0001\t\u0003\t\u009c\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00a2\b\n\n\n\f\n\u00a5\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00aa\b\u000b\n\u000b\f\u000b\u00ad\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e0\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u010a\b\r\n\r\f\r\u010d\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0115\b\u000e\n\u000e"+
		"\f\u000e\u0118\t\u000e\u0003\u000e\u011a\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0122\b\u000f"+
		"\n\u000f\f\u000f\u0125\t\u000f\u0003\u000f\u0127\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0143\b\u0010\n\u0010\f\u0010\u0146\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u014c\b\u0010\n\u0010"+
		"\f\u0010\u014f\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u015a\b\u0010\n\u0010\f\u0010\u015d\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0163\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0169\b\u0010\n\u0010\f\u0010\u016c\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0179\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0190\b\u0012"+
		"\u0001\u0012\u0000\u0001\u001a\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0001"+
		"\u0000\u001b\u001d\u0002\u0000\u0016\u0016\u001e\u001e\u0002\u0000\u0019"+
		"\u001a\u001f \u0001\u0000!\"\u0001\u0000%&\u01b1\u0000&\u0001\u0000\u0000"+
		"\u0000\u00028\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006"+
		"J\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000"+
		"\u0000\f^\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000"+
		"\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000"+
		"\u0014\u00a3\u0001\u0000\u0000\u0000\u0016\u00a6\u0001\u0000\u0000\u0000"+
		"\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00df\u0001\u0000\u0000\u0000"+
		"\u001c\u0119\u0001\u0000\u0000\u0000\u001e\u0126\u0001\u0000\u0000\u0000"+
		" \u0178\u0001\u0000\u0000\u0000\"\u017a\u0001\u0000\u0000\u0000$\u018f"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005:\u0000\u0000"+
		"(*\u0005\u0002\u0000\u0000)+\u0003\u0002\u0001\u0000*)\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,0\u0003\n\u0005"+
		"\u0000-/\u0003\u000e\u0007\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0003\u0000\u0000"+
		"45\u0003\u0018\f\u000056\u0005\u0000\u0000\u000167\u0006\u0000\uffff\uffff"+
		"\u00007\u0001\u0001\u0000\u0000\u00008:\u0005\u0004\u0000\u00009;\u0003"+
		"\u0004\u0002\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<>\u0003\b\u0004\u0000=<\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\u0001\uffff"+
		"\uffff\u0000@\u0003\u0001\u0000\u0000\u0000AG\u0005\u0005\u0000\u0000"+
		"BC\u0003\u0006\u0003\u0000CD\u0006\u0002\uffff\uffff\u0000DF\u0001\u0000"+
		"\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KL\u0005:\u0000"+
		"\u0000LM\u0005\u0007\u0000\u0000MN\u0003\u0014\n\u0000NO\u0005\u0003\u0000"+
		"\u0000OP\u0006\u0003\uffff\uffff\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QR\u0005\b\u0000\u0000RS\u0003\u0014\n\u0000ST\u0006\u0004\uffff\uffff"+
		"\u0000T\t\u0001\u0000\u0000\u0000UV\u0005\t\u0000\u0000VW\u0003\f\u0006"+
		"\u0000WX\u0006\u0005\uffff\uffff\u0000X\u000b\u0001\u0000\u0000\u0000"+
		"YZ\u0005:\u0000\u0000Z[\u0006\u0006\uffff\uffff\u0000[]\u0005\u0002\u0000"+
		"\u0000\\Y\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_\r\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ab\u0005\n\u0000\u0000bc\u0005:\u0000\u0000cd\u0003"+
		"\u0012\t\u0000de\u0005\u000b\u0000\u0000ef\u0003$\u0012\u0000fg\u0005"+
		"\f\u0000\u0000gh\u0003\u0010\b\u0000hl\u0005\r\u0000\u0000ik\u0003 \u0010"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0006\u0007\uffff\uffff"+
		"\u0000q\u0082\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0005:\u0000"+
		"\u0000tu\u0003\u0012\t\u0000uv\u0005\f\u0000\u0000vw\u0003\u0010\b\u0000"+
		"w{\u0005\r\u0000\u0000xz\u0003 \u0010\u0000yx\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u0003\u0000\u0000\u007f\u0080\u0006\u0007\uffff\uffff\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081a\u0001\u0000\u0000\u0000\u0081r\u0001\u0000"+
		"\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000e"+
		"\u0000\u0000\u0084\u0085\u0003\u0014\n\u0000\u0085\u0086\u0006\b\uffff"+
		"\uffff\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0011\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u000f\u0000\u0000\u008a\u008b\u0005:\u0000"+
		"\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u008d\u0003$\u0012\u0000"+
		"\u008d\u0096\u0006\t\uffff\uffff\u0000\u008e\u008f\u0005\u0010\u0000\u0000"+
		"\u008f\u0090\u0005:\u0000\u0000\u0090\u0091\u0005\u000b\u0000\u0000\u0091"+
		"\u0092\u0003$\u0012\u0000\u0092\u0093\u0006\t\uffff\uffff\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0011\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0089\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0003\u0016\u000b\u0000\u009e\u009f\u0005\u0002\u0000\u0000\u009f"+
		"\u00a0\u0006\n\uffff\uffff\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009d\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u0015\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00ab\u0005:\u0000\u0000\u00a7\u00a8\u0005\u0010\u0000\u0000\u00a8\u00aa"+
		"\u0005:\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u00b0\u0003"+
		"$\u0012\u0000\u00b0\u00b1\u0006\u000b\uffff\uffff\u0000\u00b1\u0017\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u0012\u0000\u0000\u00b3\u00b4\u0005"+
		":\u0000\u0000\u00b4\u00b5\u0005\u000f\u0000\u0000\u00b5\u00b6\u0003\u001c"+
		"\u000e\u0000\u00b6\u00b7\u0005\u0011\u0000\u0000\u00b7\u00b8\u0005\u0002"+
		"\u0000\u0000\u00b8\u00b9\u0006\f\uffff\uffff\u0000\u00b9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0006\r\uffff\uffff\u0000\u00bb\u00bc\u0005:"+
		"\u0000\u0000\u00bc\u00e0\u0006\r\uffff\uffff\u0000\u00bd\u00be\u00057"+
		"\u0000\u0000\u00be\u00e0\u0006\r\uffff\uffff\u0000\u00bf\u00c0\u00058"+
		"\u0000\u0000\u00c0\u00e0\u0006\r\uffff\uffff\u0000\u00c1\u00c2\u00059"+
		"\u0000\u0000\u00c2\u00e0\u0006\r\uffff\uffff\u0000\u00c3\u00c4\u0005:"+
		"\u0000\u0000\u00c4\u00c5\u0005\u000f\u0000\u0000\u00c5\u00c6\u0003\u001c"+
		"\u000e\u0000\u00c6\u00c7\u0005\u0011\u0000\u0000\u00c7\u00c8\u0006\r\uffff"+
		"\uffff\u0000\u00c8\u00e0\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0016"+
		"\u0000\u0000\u00ca\u00cb\u0003\u001a\r\n\u00cb\u00cc\u0006\r\uffff\uffff"+
		"\u0000\u00cc\u00e0\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u000f\u0000"+
		"\u0000\u00ce\u00cf\u0003\u001a\r\u0000\u00cf\u00d0\u0005\u0011\u0000\u0000"+
		"\u00d0\u00d1\u0006\r\uffff\uffff\u0000\u00d1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0017\u0000\u0000\u00d3\u00d4\u0003\u001a\r\b\u00d4"+
		"\u00d5\u0006\r\uffff\uffff\u0000\u00d5\u00e0\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\u0018\u0000\u0000\u00d7\u00d8\u0005\u0019\u0000\u0000\u00d8"+
		"\u00d9\u0003$\u0012\u0000\u00d9\u00da\u0005\u001a\u0000\u0000\u00da\u00db"+
		"\u0005\u000f\u0000\u0000\u00db\u00dc\u0003\u001a\r\u0000\u00dc\u00dd\u0005"+
		"\u0011\u0000\u0000\u00dd\u00de\u0006\r\uffff\uffff\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00ba\u0001\u0000\u0000\u0000\u00df\u00bd\u0001"+
		"\u0000\u0000\u0000\u00df\u00bf\u0001\u0000\u0000\u0000\u00df\u00c1\u0001"+
		"\u0000\u0000\u0000\u00df\u00c3\u0001\u0000\u0000\u0000\u00df\u00c9\u0001"+
		"\u0000\u0000\u0000\u00df\u00cd\u0001\u0000\u0000\u0000\u00df\u00d2\u0001"+
		"\u0000\u0000\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00e0\u010b\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\n\u0006\u0000\u0000\u00e2\u00e3\u0007\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003\u001a\r\u0007\u00e4\u00e5\u0006\r\uffff"+
		"\uffff\u0000\u00e5\u010a\u0001\u0000\u0000\u0000\u00e6\u00e7\n\u0005\u0000"+
		"\u0000\u00e7\u00e8\u0007\u0001\u0000\u0000\u00e8\u00e9\u0003\u001a\r\u0006"+
		"\u00e9\u00ea\u0006\r\uffff\uffff\u0000\u00ea\u010a\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\n\u0004\u0000\u0000\u00ec\u00ed\u0007\u0002\u0000\u0000\u00ed"+
		"\u00ee\u0003\u001a\r\u0005\u00ee\u00ef\u0006\r\uffff\uffff\u0000\u00ef"+
		"\u010a\u0001\u0000\u0000\u0000\u00f0\u00f1\n\u0003\u0000\u0000\u00f1\u00f2"+
		"\u0007\u0003\u0000\u0000\u00f2\u00f3\u0003\u001a\r\u0004\u00f3\u00f4\u0006"+
		"\r\uffff\uffff\u0000\u00f4\u010a\u0001\u0000\u0000\u0000\u00f5\u00f6\n"+
		"\u0002\u0000\u0000\u00f6\u00f7\u0005#\u0000\u0000\u00f7\u00f8\u0003\u001a"+
		"\r\u0003\u00f8\u00f9\u0006\r\uffff\uffff\u0000\u00f9\u010a\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\n\u0001\u0000\u0000\u00fb\u00fc\u0005$\u0000"+
		"\u0000\u00fc\u00fd\u0003\u001a\r\u0002\u00fd\u00fe\u0006\r\uffff\uffff"+
		"\u0000\u00fe\u010a\u0001\u0000\u0000\u0000\u00ff\u0100\n\f\u0000\u0000"+
		"\u0100\u0101\u0005\u0013\u0000\u0000\u0101\u0102\u0003\u001a\r\u0000\u0102"+
		"\u0103\u0005\u0014\u0000\u0000\u0103\u0104\u0006\r\uffff\uffff\u0000\u0104"+
		"\u010a\u0001\u0000\u0000\u0000\u0105\u0106\n\u000b\u0000\u0000\u0106\u0107"+
		"\u0005\u0015\u0000\u0000\u0107\u0108\u0005:\u0000\u0000\u0108\u010a\u0006"+
		"\r\uffff\uffff\u0000\u0109\u00e1\u0001\u0000\u0000\u0000\u0109\u00e6\u0001"+
		"\u0000\u0000\u0000\u0109\u00eb\u0001\u0000\u0000\u0000\u0109\u00f0\u0001"+
		"\u0000\u0000\u0000\u0109\u00f5\u0001\u0000\u0000\u0000\u0109\u00fa\u0001"+
		"\u0000\u0000\u0000\u0109\u00ff\u0001\u0000\u0000\u0000\u0109\u0105\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u001b\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0003"+
		"\u001a\r\u0000\u010f\u0116\u0006\u000e\uffff\uffff\u0000\u0110\u0111\u0005"+
		"\u0010\u0000\u0000\u0111\u0112\u0003\u001a\r\u0000\u0112\u0113\u0006\u000e"+
		"\uffff\uffff\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0110\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u010e\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u001d\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0003\u001a\r\u0000\u011c\u0123\u0006\u000f"+
		"\uffff\uffff\u0000\u011d\u011e\u0005\u0010\u0000\u0000\u011e\u011f\u0003"+
		"\u001a\r\u0000\u011f\u0120\u0006\u000f\uffff\uffff\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0126\u011b\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u001f\u0001\u0000\u0000\u0000\u0128\u0129\u0007"+
		"\u0004\u0000\u0000\u0129\u012a\u0003\u001e\u000f\u0000\u012a\u012b\u0005"+
		"\u0002\u0000\u0000\u012b\u012c\u0006\u0010\uffff\uffff\u0000\u012c\u0179"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005\'\u0000\u0000\u012e\u012f\u0003"+
		"\u001a\r\u0000\u012f\u0130\u0005\u0002\u0000\u0000\u0130\u0131\u0006\u0010"+
		"\uffff\uffff\u0000\u0131\u0179\u0001\u0000\u0000\u0000\u0132\u0133\u0003"+
		"\u001a\r\u0000\u0133\u0134\u0005\u0002\u0000\u0000\u0134\u0135\u0006\u0010"+
		"\uffff\uffff\u0000\u0135\u0179\u0001\u0000\u0000\u0000\u0136\u0137\u0003"+
		"\u001a\r\u0000\u0137\u0138\u0005(\u0000\u0000\u0138\u0139\u0003\u001a"+
		"\r\u0000\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u013b\u0006\u0010\uffff"+
		"\uffff\u0000\u013b\u0179\u0001\u0000\u0000\u0000\u013c\u013d\u0005)\u0000"+
		"\u0000\u013d\u013e\u0005\u000f\u0000\u0000\u013e\u013f\u0003\u001a\r\u0000"+
		"\u013f\u0140\u0005\u0011\u0000\u0000\u0140\u0144\u0005*\u0000\u0000\u0141"+
		"\u0143\u0003 \u0010\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146"+
		"\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0005+\u0000\u0000\u0148\u0149\u0005"+
		",\u0000\u0000\u0149\u014d\u0005*\u0000\u0000\u014a\u014c\u0003 \u0010"+
		"\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005+\u0000\u0000\u0151\u0152\u0006\u0010\uffff\uffff"+
		"\u0000\u0152\u0179\u0001\u0000\u0000\u0000\u0153\u0154\u0005)\u0000\u0000"+
		"\u0154\u0155\u0005\u000f\u0000\u0000\u0155\u0156\u0003\u001a\r\u0000\u0156"+
		"\u0157\u0005\u0011\u0000\u0000\u0157\u015b\u0005*\u0000\u0000\u0158\u015a"+
		"\u0003 \u0010\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005+\u0000\u0000\u015f\u0160\u0006\u0010"+
		"\uffff\uffff\u0000\u0160\u0179\u0001\u0000\u0000\u0000\u0161\u0163\u0003"+
		"\"\u0011\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0005-\u0000"+
		"\u0000\u0165\u0166\u0003\u001a\r\u0000\u0166\u016a\u0005.\u0000\u0000"+
		"\u0167\u0169\u0003 \u0010\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e"+
		"\u016f\u0006\u0010\uffff\uffff\u0000\u016f\u0179\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005/\u0000\u0000\u0171\u0172\u0003\u001a\r\u0000\u0172"+
		"\u0173\u0005\u0002\u0000\u0000\u0173\u0174\u0006\u0010\uffff\uffff\u0000"+
		"\u0174\u0179\u0001\u0000\u0000\u0000\u0175\u0176\u0005/\u0000\u0000\u0176"+
		"\u0177\u0005\u0002\u0000\u0000\u0177\u0179\u0006\u0010\uffff\uffff\u0000"+
		"\u0178\u0128\u0001\u0000\u0000\u0000\u0178\u012d\u0001\u0000\u0000\u0000"+
		"\u0178\u0132\u0001\u0000\u0000\u0000\u0178\u0136\u0001\u0000\u0000\u0000"+
		"\u0178\u013c\u0001\u0000\u0000\u0000\u0178\u0153\u0001\u0000\u0000\u0000"+
		"\u0178\u0162\u0001\u0000\u0000\u0000\u0178\u0170\u0001\u0000\u0000\u0000"+
		"\u0178\u0175\u0001\u0000\u0000\u0000\u0179!\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u00050\u0000\u0000\u017b\u017c\u0003\u001a\r\u0000\u017c\u017d"+
		"\u0005(\u0000\u0000\u017d\u017e\u0003\u001a\r\u0000\u017e\u017f\u0005"+
		"\u0002\u0000\u0000\u017f\u0180\u0006\u0011\uffff\uffff\u0000\u0180#\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u00051\u0000\u0000\u0182\u0190\u0006\u0012"+
		"\uffff\uffff\u0000\u0183\u0184\u00052\u0000\u0000\u0184\u0190\u0006\u0012"+
		"\uffff\uffff\u0000\u0185\u0186\u00053\u0000\u0000\u0186\u0190\u0006\u0012"+
		"\uffff\uffff\u0000\u0187\u0188\u0005\u0013\u0000\u0000\u0188\u0189\u0005"+
		"7\u0000\u0000\u0189\u018a\u0005\u0014\u0000\u0000\u018a\u018b\u0003$\u0012"+
		"\u0000\u018b\u018c\u0006\u0012\uffff\uffff\u0000\u018c\u0190\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005:\u0000\u0000\u018e\u0190\u0006\u0012\uffff"+
		"\uffff\u0000\u018f\u0181\u0001\u0000\u0000\u0000\u018f\u0183\u0001\u0000"+
		"\u0000\u0000\u018f\u0185\u0001\u0000\u0000\u0000\u018f\u0187\u0001\u0000"+
		"\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190%\u0001\u0000\u0000"+
		"\u0000\u001c*0:=G^l{\u0081\u0087\u0096\u009b\u00a3\u00ab\u00df\u0109\u010b"+
		"\u0116\u0119\u0123\u0126\u0144\u014d\u015b\u0162\u016a\u0178\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}