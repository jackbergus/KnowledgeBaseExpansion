// Generated from ref/schema.g4 by ANTLR 4.7.1
package ref;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class schemaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BIND=8, TRANSFER=9, 
		TRYEXPAND=10, RELATION=11, FUTURECHECK=12, EVENT=13, UNIQUE=14, ENTITY=15, 
		FD=16, RULE=17, FOR=18, DECLARE=19, SET=20, WITH=21, BEGIN=22, END=23, 
		EXIST=24, EXCEPT=25, MACRO=26, MARROW=27, IMPLIES=28, LPAR=29, RPAR=30, 
		LT=31, GT=32, LEQ=33, GEQ=34, COMMA=35, TYPE=36, NEG=37, BOT=38, VALUE=39, 
		STRING=40, WS=41, COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_program = 0, RULE_commands = 1, RULE_fol_two = 2, RULE_except = 3, 
		RULE_intime = 4, RULE_inspace = 5, RULE_setOptions = 6, RULE_paramDeclared = 7, 
		RULE_stringlist = 8, RULE_moreClauses = 9, RULE_clause = 10, RULE_forall = 11, 
		RULE_exists = 12, RULE_predicates = 13, RULE_angestrengend = 14, RULE_lbound = 15, 
		RULE_ubound = 16;
	public static final String[] ruleNames = {
		"program", "commands", "fol_two", "except", "intime", "inspace", "setOptions", 
		"paramDeclared", "stringlist", "moreClauses", "clause", "forall", "exists", 
		"predicates", "angestrengend", "lbound", "ubound"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'in time'", "'and space'", "'\\forall'", "'\\exists'", 
		"'notnull'", "'bind'", "'transfer'", "'try-expand'", "'relation'", "'future-check'", 
		"'event'", "'unique'", "'entity'", "'MVD'", "'rule'", "'for'", "'as'", 
		"'set'", "'with'", "'begin'", "'end'", "'exist'", "'except'", "'macro'", 
		"'->>'", "'=>'", "'('", "')'", "'<'", "'>'", "'<='", "'>='", "','", "':'", 
		"'~'", "'False'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BIND", "TRANSFER", "TRYEXPAND", 
		"RELATION", "FUTURECHECK", "EVENT", "UNIQUE", "ENTITY", "FD", "RULE", 
		"FOR", "DECLARE", "SET", "WITH", "BEGIN", "END", "EXIST", "EXCEPT", "MACRO", 
		"MARROW", "IMPLIES", "LPAR", "RPAR", "LT", "GT", "LEQ", "GEQ", "COMMA", 
		"TYPE", "NEG", "BOT", "VALUE", "STRING", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "schema.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public schemaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					commands();
					setState(35);
					match(T__0);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			commands();
			setState(43);
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

	public static class CommandsContext extends ParserRuleContext {
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	 
		public CommandsContext() { }
		public void copyFrom(CommandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fdep_declareContext extends CommandsContext {
		public TerminalNode FD() { return getToken(schemaParser.FD, 0); }
		public TerminalNode FOR() { return getToken(schemaParser.FOR, 0); }
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode DECLARE() { return getToken(schemaParser.DECLARE, 0); }
		public List<StringlistContext> stringlist() {
			return getRuleContexts(StringlistContext.class);
		}
		public StringlistContext stringlist(int i) {
			return getRuleContext(StringlistContext.class,i);
		}
		public TerminalNode MARROW() { return getToken(schemaParser.MARROW, 0); }
		public Fdep_declareContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterFdep_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitFdep_declare(this);
		}
	}
	public static class Fol_two_multiple_bindsContext extends CommandsContext {
		public TerminalNode FOR() { return getToken(schemaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public List<Fol_twoContext> fol_two() {
			return getRuleContexts(Fol_twoContext.class);
		}
		public Fol_twoContext fol_two(int i) {
			return getRuleContext(Fol_twoContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public Fol_two_multiple_bindsContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterFol_two_multiple_binds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitFol_two_multiple_binds(this);
		}
	}
	public static class Beginend_declareContext extends CommandsContext {
		public StringlistContext orig;
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public IntimeContext intime() {
			return getRuleContext(IntimeContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(schemaParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(schemaParser.END, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(schemaParser.UNIQUE, 0); }
		public Beginend_declareContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterBeginend_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitBeginend_declare(this);
		}
	}
	public static class RuleContext extends CommandsContext {
		public TerminalNode RULE() { return getToken(schemaParser.RULE, 0); }
		public List<MoreClausesContext> moreClauses() {
			return getRuleContexts(MoreClausesContext.class);
		}
		public MoreClausesContext moreClauses(int i) {
			return getRuleContext(MoreClausesContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(schemaParser.IMPLIES, 0); }
		public TerminalNode BOT() { return getToken(schemaParser.BOT, 0); }
		public TerminalNode WITH() { return getToken(schemaParser.WITH, 0); }
		public List<PredicatesContext> predicates() {
			return getRuleContexts(PredicatesContext.class);
		}
		public PredicatesContext predicates(int i) {
			return getRuleContext(PredicatesContext.class,i);
		}
		public RuleContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitRule(this);
		}
	}
	public static class Macro_expandContext extends CommandsContext {
		public TerminalNode TRYEXPAND() { return getToken(schemaParser.TRYEXPAND, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode FOR() { return getToken(schemaParser.FOR, 0); }
		public TerminalNode RELATION() { return getToken(schemaParser.RELATION, 0); }
		public TerminalNode EVENT() { return getToken(schemaParser.EVENT, 0); }
		public Macro_expandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterMacro_expand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitMacro_expand(this);
		}
	}
	public static class Macro_definitionContext extends CommandsContext {
		public TerminalNode MACRO() { return getToken(schemaParser.MACRO, 0); }
		public List<TerminalNode> STRING() { return getTokens(schemaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(schemaParser.STRING, i);
		}
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public TerminalNode DECLARE() { return getToken(schemaParser.DECLARE, 0); }
		public TerminalNode COMMA() { return getToken(schemaParser.COMMA, 0); }
		public TerminalNode RULE() { return getToken(schemaParser.RULE, 0); }
		public List<MoreClausesContext> moreClauses() {
			return getRuleContexts(MoreClausesContext.class);
		}
		public MoreClausesContext moreClauses(int i) {
			return getRuleContext(MoreClausesContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(schemaParser.IMPLIES, 0); }
		public TerminalNode BOT() { return getToken(schemaParser.BOT, 0); }
		public TerminalNode WITH() { return getToken(schemaParser.WITH, 0); }
		public List<PredicatesContext> predicates() {
			return getRuleContexts(PredicatesContext.class);
		}
		public PredicatesContext predicates(int i) {
			return getRuleContext(PredicatesContext.class,i);
		}
		public Macro_definitionContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterMacro_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitMacro_definition(this);
		}
	}
	public static class Transfer_macroContext extends CommandsContext {
		public StringlistContext orig;
		public StringlistContext dest;
		public TerminalNode TRANSFER() { return getToken(schemaParser.TRANSFER, 0); }
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public IntimeContext intime() {
			return getRuleContext(IntimeContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(schemaParser.DECLARE, 0); }
		public List<StringlistContext> stringlist() {
			return getRuleContexts(StringlistContext.class);
		}
		public StringlistContext stringlist(int i) {
			return getRuleContext(StringlistContext.class,i);
		}
		public Transfer_macroContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterTransfer_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitTransfer_macro(this);
		}
	}
	public static class Rel_delcareContext extends CommandsContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public TerminalNode RELATION() { return getToken(schemaParser.RELATION, 0); }
		public TerminalNode EVENT() { return getToken(schemaParser.EVENT, 0); }
		public Rel_delcareContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterRel_delcare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitRel_delcare(this);
		}
	}
	public static class EnexistsContext extends CommandsContext {
		public TerminalNode ENTITY() { return getToken(schemaParser.ENTITY, 0); }
		public TerminalNode EXIST() { return getToken(schemaParser.EXIST, 0); }
		public IntimeContext intime() {
			return getRuleContext(IntimeContext.class,0);
		}
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public ExceptContext except() {
			return getRuleContext(ExceptContext.class,0);
		}
		public InspaceContext inspace() {
			return getRuleContext(InspaceContext.class,0);
		}
		public EnexistsContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterEnexists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitEnexists(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATION:
			case EVENT:
				_localctx = new Rel_delcareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==RELATION || _la==EVENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(46);
				match(STRING);
				setState(47);
				match(LPAR);
				setState(48);
				stringlist();
				setState(49);
				match(RPAR);
				}
				break;
			case FD:
				_localctx = new Fdep_declareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(FD);
				setState(52);
				match(FOR);
				setState(53);
				match(STRING);
				setState(54);
				match(DECLARE);
				setState(55);
				stringlist();
				setState(56);
				match(MARROW);
				setState(57);
				stringlist();
				}
				break;
			case BIND:
				_localctx = new Fol_two_multiple_bindsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					fol_two();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIND );
				setState(64);
				match(FOR);
				setState(65);
				match(LPAR);
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					commands();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIND) | (1L << TRANSFER) | (1L << TRYEXPAND) | (1L << RELATION) | (1L << EVENT) | (1L << UNIQUE) | (1L << ENTITY) | (1L << FD) | (1L << RULE) | (1L << BEGIN) | (1L << END) | (1L << MACRO))) != 0) );
				setState(71);
				match(RPAR);
				}
				break;
			case RULE:
				_localctx = new RuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(RULE);
				setState(74);
				moreClauses();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(75);
					match(WITH);
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(76);
						predicates();
						}
						}
						setState(79); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STRING );
					}
				}

				setState(83);
				match(IMPLIES);
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case NEG:
				case STRING:
					{
					setState(84);
					moreClauses();
					}
					break;
				case BOT:
					{
					setState(85);
					match(BOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ENTITY:
				_localctx = new EnexistsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(ENTITY);
				setState(89);
				match(EXIST);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE || _la==STRING) {
					{
					setState(90);
					stringlist();
					}
				}

				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCEPT) {
					{
					setState(93);
					except();
					}
				}

				setState(96);
				intime();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(97);
					inspace();
					}
				}

				}
				break;
			case MACRO:
				_localctx = new Macro_definitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(MACRO);
				setState(101);
				match(STRING);
				setState(102);
				match(LPAR);
				setState(103);
				stringlist();
				setState(104);
				match(RPAR);
				setState(105);
				match(DECLARE);
				setState(106);
				match(STRING);
				setState(107);
				match(COMMA);
				setState(108);
				match(RULE);
				setState(109);
				moreClauses();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(110);
					match(WITH);
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(111);
						predicates();
						}
						}
						setState(114); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STRING );
					}
				}

				setState(118);
				match(IMPLIES);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case NEG:
				case STRING:
					{
					setState(119);
					moreClauses();
					}
					break;
				case BOT:
					{
					setState(120);
					match(BOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TRYEXPAND:
				_localctx = new Macro_expandContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(TRYEXPAND);
				setState(124);
				stringlist();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(125);
					match(FOR);
					setState(126);
					_la = _input.LA(1);
					if ( !(_la==RELATION || _la==EVENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case UNIQUE:
			case BEGIN:
			case END:
				_localctx = new Beginend_declareContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(129);
					match(UNIQUE);
					}
				}

				setState(132);
				_la = _input.LA(1);
				if ( !(_la==BEGIN || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				match(STRING);
				setState(134);
				match(LPAR);
				setState(135);
				((Beginend_declareContext)_localctx).orig = stringlist();
				setState(136);
				match(RPAR);
				setState(137);
				intime();
				}
				break;
			case TRANSFER:
				_localctx = new Transfer_macroContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				match(TRANSFER);
				setState(140);
				match(STRING);
				setState(141);
				match(LPAR);
				setState(142);
				((Transfer_macroContext)_localctx).orig = stringlist();
				setState(143);
				match(RPAR);
				setState(144);
				intime();
				setState(145);
				match(DECLARE);
				setState(146);
				((Transfer_macroContext)_localctx).dest = stringlist();
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

	public static class Fol_twoContext extends ParserRuleContext {
		public Token variable;
		public TerminalNode BIND() { return getToken(schemaParser.BIND, 0); }
		public TerminalNode DECLARE() { return getToken(schemaParser.DECLARE, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public Fol_twoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fol_two; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterFol_two(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitFol_two(this);
		}
	}

	public final Fol_twoContext fol_two() throws RecognitionException {
		Fol_twoContext _localctx = new Fol_twoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fol_two);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(BIND);
			setState(151);
			((Fol_twoContext)_localctx).variable = match(STRING);
			setState(152);
			match(DECLARE);
			setState(153);
			match(LPAR);
			setState(154);
			stringlist();
			setState(155);
			match(RPAR);
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

	public static class ExceptContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(schemaParser.EXCEPT, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public ExceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterExcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitExcept(this);
		}
	}

	public final ExceptContext except() throws RecognitionException {
		ExceptContext _localctx = new ExceptContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_except);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(EXCEPT);
			setState(158);
			stringlist();
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

	public static class IntimeContext extends ParserRuleContext {
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public IntimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterIntime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitIntime(this);
		}
	}

	public final IntimeContext intime() throws RecognitionException {
		IntimeContext _localctx = new IntimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__2);
			setState(161);
			stringlist();
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

	public static class InspaceContext extends ParserRuleContext {
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public InspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterInspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitInspace(this);
		}
	}

	public final InspaceContext inspace() throws RecognitionException {
		InspaceContext _localctx = new InspaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__3);
			setState(164);
			stringlist();
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

	public static class SetOptionsContext extends ParserRuleContext {
		public SetOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOptions; }
	 
		public SetOptionsContext() { }
		public void copyFrom(SetOptionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Set_relationContext extends SetOptionsContext {
		public TerminalNode RELATION() { return getToken(schemaParser.RELATION, 0); }
		public List<TerminalNode> STRING() { return getTokens(schemaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(schemaParser.STRING, i);
		}
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(schemaParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public Set_relationContext(SetOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterSet_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitSet_relation(this);
		}
	}
	public static class Set_entityContext extends SetOptionsContext {
		public TerminalNode ENTITY() { return getToken(schemaParser.ENTITY, 0); }
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public Set_entityContext(SetOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterSet_entity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitSet_entity(this);
		}
	}
	public static class Set_eventContext extends SetOptionsContext {
		public TerminalNode EVENT() { return getToken(schemaParser.EVENT, 0); }
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public Set_eventContext(SetOptionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterSet_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitSet_event(this);
		}
	}

	public final SetOptionsContext setOptions() throws RecognitionException {
		SetOptionsContext _localctx = new SetOptionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setOptions);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATION:
				_localctx = new Set_relationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(RELATION);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(167);
					match(STRING);
					setState(168);
					match(LPAR);
					setState(169);
					match(STRING);
					setState(170);
					match(COMMA);
					setState(171);
					match(STRING);
					setState(172);
					match(RPAR);
					}
				}

				}
				break;
			case EVENT:
				_localctx = new Set_eventContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(EVENT);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(176);
					match(STRING);
					setState(177);
					match(LPAR);
					setState(178);
					stringlist();
					setState(179);
					match(RPAR);
					}
				}

				}
				break;
			case ENTITY:
				_localctx = new Set_entityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(ENTITY);
				setState(184);
				match(STRING);
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

	public static class ParamDeclaredContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(schemaParser.FOR, 0); }
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public ParamDeclaredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDeclared; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterParamDeclared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitParamDeclared(this);
		}
	}

	public final ParamDeclaredContext paramDeclared() throws RecognitionException {
		ParamDeclaredContext _localctx = new ParamDeclaredContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramDeclared);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FOR);
			setState(188);
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

	public static class StringlistContext extends ParserRuleContext {
		public List<AngestrengendContext> angestrengend() {
			return getRuleContexts(AngestrengendContext.class);
		}
		public AngestrengendContext angestrengend(int i) {
			return getRuleContext(AngestrengendContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(schemaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(schemaParser.COMMA, i);
		}
		public StringlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterStringlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitStringlist(this);
		}
	}

	public final StringlistContext stringlist() throws RecognitionException {
		StringlistContext _localctx = new StringlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					angestrengend();
					setState(191);
					match(COMMA);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(198);
			angestrengend();
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

	public static class MoreClausesContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public MoreClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterMoreClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitMoreClauses(this);
		}
	}

	public final MoreClausesContext moreClauses() throws RecognitionException {
		MoreClausesContext _localctx = new MoreClausesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moreClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				clause();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << NEG) | (1L << STRING))) != 0) );
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

	public static class ClauseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(schemaParser.LPAR, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(schemaParser.RPAR, 0); }
		public List<ForallContext> forall() {
			return getRuleContexts(ForallContext.class);
		}
		public ForallContext forall(int i) {
			return getRuleContext(ForallContext.class,i);
		}
		public List<ExistsContext> exists() {
			return getRuleContexts(ExistsContext.class);
		}
		public ExistsContext exists(int i) {
			return getRuleContext(ExistsContext.class,i);
		}
		public TerminalNode NEG() { return getToken(schemaParser.NEG, 0); }
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(205);
				forall();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(211);
				exists();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG) {
				{
				setState(217);
				match(NEG);
				}
			}

			setState(220);
			match(STRING);
			setState(221);
			match(LPAR);
			setState(222);
			stringlist();
			setState(223);
			match(RPAR);
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

	public static class ForallContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(schemaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(schemaParser.STRING, i);
		}
		public TerminalNode TYPE() { return getToken(schemaParser.TYPE, 0); }
		public TerminalNode WITH() { return getToken(schemaParser.WITH, 0); }
		public List<PredicatesContext> predicates() {
			return getRuleContexts(PredicatesContext.class);
		}
		public PredicatesContext predicates(int i) {
			return getRuleContext(PredicatesContext.class,i);
		}
		public ForallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterForall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitForall(this);
		}
	}

	public final ForallContext forall() throws RecognitionException {
		ForallContext _localctx = new ForallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__4);
			setState(226);
			match(STRING);
			setState(227);
			match(TYPE);
			setState(228);
			match(STRING);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(229);
				match(WITH);
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					predicates();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
			}

			setState(237);
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

	public static class ExistsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(schemaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(schemaParser.STRING, i);
		}
		public TerminalNode TYPE() { return getToken(schemaParser.TYPE, 0); }
		public TerminalNode WITH() { return getToken(schemaParser.WITH, 0); }
		public List<PredicatesContext> predicates() {
			return getRuleContexts(PredicatesContext.class);
		}
		public PredicatesContext predicates(int i) {
			return getRuleContext(PredicatesContext.class,i);
		}
		public ExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitExists(this);
		}
	}

	public final ExistsContext exists() throws RecognitionException {
		ExistsContext _localctx = new ExistsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__5);
			setState(240);
			match(STRING);
			setState(241);
			match(TYPE);
			setState(242);
			match(STRING);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(243);
				match(WITH);
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(244);
					predicates();
					}
					}
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
			}

			setState(251);
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

	public static class PredicatesContext extends ParserRuleContext {
		public PredicatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicates; }
	 
		public PredicatesContext() { }
		public void copyFrom(PredicatesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuantificationContext extends PredicatesContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public LboundContext lbound() {
			return getRuleContext(LboundContext.class,0);
		}
		public UboundContext ubound() {
			return getRuleContext(UboundContext.class,0);
		}
		public QuantificationContext(PredicatesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterQuantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitQuantification(this);
		}
	}
	public static class Var_notnullContext extends PredicatesContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public Var_notnullContext(PredicatesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterVar_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitVar_notnull(this);
		}
	}

	public final PredicatesContext predicates() throws RecognitionException {
		PredicatesContext _localctx = new PredicatesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicates);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new Var_notnullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(STRING);
				setState(254);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new QuantificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(255);
					lbound();
					}
					break;
				}
				setState(258);
				match(STRING);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT || _la==GEQ) {
					{
					setState(259);
					ubound();
					}
				}

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

	public static class AngestrengendContext extends ParserRuleContext {
		public AngestrengendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angestrengend; }
	 
		public AngestrengendContext() { }
		public void copyFrom(AngestrengendContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsstringContext extends AngestrengendContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public IsstringContext(AngestrengendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterIsstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitIsstring(this);
		}
	}
	public static class IsvalueContext extends AngestrengendContext {
		public TerminalNode VALUE() { return getToken(schemaParser.VALUE, 0); }
		public IsvalueContext(AngestrengendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterIsvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitIsvalue(this);
		}
	}

	public final AngestrengendContext angestrengend() throws RecognitionException {
		AngestrengendContext _localctx = new AngestrengendContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_angestrengend);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new IsstringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(STRING);
				}
				break;
			case VALUE:
				_localctx = new IsvalueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(VALUE);
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

	public static class LboundContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode LT() { return getToken(schemaParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(schemaParser.LEQ, 0); }
		public LboundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterLbound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitLbound(this);
		}
	}

	public final LboundContext lbound() throws RecognitionException {
		LboundContext _localctx = new LboundContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lbound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(STRING);
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==LT || _la==LEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UboundContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(schemaParser.STRING, 0); }
		public TerminalNode GT() { return getToken(schemaParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(schemaParser.GEQ, 0); }
		public UboundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ubound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).enterUbound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof schemaListener ) ((schemaListener)listener).exitUbound(this);
		}
	}

	public final UboundContext ubound() throws RecognitionException {
		UboundContext _localctx = new UboundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ubound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==GT || _la==GEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3?\n\3\r\3\16\3@\3\3\3\3\3\3"+
		"\6\3F\n\3\r\3\16\3G\3\3\3\3\3\3\3\3\3\3\3\3\6\3P\n\3\r\3\16\3Q\5\3T\n"+
		"\3\3\3\3\3\3\3\5\3Y\n\3\3\3\3\3\3\3\5\3^\n\3\3\3\5\3a\n\3\3\3\3\3\5\3"+
		"e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3s\n\3\r\3\16"+
		"\3t\5\3w\n\3\3\3\3\3\3\3\5\3|\n\3\3\3\3\3\3\3\3\3\5\3\u0082\n\3\3\3\5"+
		"\3\u0085\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u0097\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00b8\n\b\3\b\3\b\5\b\u00bc\n\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\7\n\u00c4\n\n\f\n\16\n\u00c7\13\n\3\n\3\n\3\13\6\13\u00cc\n\13\r\13\16"+
		"\13\u00cd\3\f\7\f\u00d1\n\f\f\f\16\f\u00d4\13\f\3\f\7\f\u00d7\n\f\f\f"+
		"\16\f\u00da\13\f\3\f\5\f\u00dd\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\6\r\u00ea\n\r\r\r\16\r\u00eb\5\r\u00ee\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u00f8\n\16\r\16\16\16\u00f9\5\16\u00fc\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u0103\n\17\3\17\3\17\5\17\u0107\n\17\5"+
		"\17\u0109\n\17\3\20\3\20\5\20\u010d\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2\r\r\17"+
		"\17\3\2\30\31\4\2!!##\4\2\"\"$$\2\u012a\2)\3\2\2\2\4\u0096\3\2\2\2\6\u0098"+
		"\3\2\2\2\b\u009f\3\2\2\2\n\u00a2\3\2\2\2\f\u00a5\3\2\2\2\16\u00bb\3\2"+
		"\2\2\20\u00bd\3\2\2\2\22\u00c5\3\2\2\2\24\u00cb\3\2\2\2\26\u00d2\3\2\2"+
		"\2\30\u00e3\3\2\2\2\32\u00f1\3\2\2\2\34\u0108\3\2\2\2\36\u010c\3\2\2\2"+
		" \u010e\3\2\2\2\"\u0111\3\2\2\2$%\5\4\3\2%&\7\3\2\2&(\3\2\2\2\'$\3\2\2"+
		"\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\4\3\2-.\7\4"+
		"\2\2.\3\3\2\2\2/\60\t\2\2\2\60\61\7*\2\2\61\62\7\37\2\2\62\63\5\22\n\2"+
		"\63\64\7 \2\2\64\u0097\3\2\2\2\65\66\7\22\2\2\66\67\7\24\2\2\678\7*\2"+
		"\289\7\25\2\29:\5\22\n\2:;\7\35\2\2;<\5\22\n\2<\u0097\3\2\2\2=?\5\6\4"+
		"\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\24\2\2CE\7\37"+
		"\2\2DF\5\4\3\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7 "+
		"\2\2J\u0097\3\2\2\2KL\7\23\2\2LS\5\24\13\2MO\7\27\2\2NP\5\34\17\2ON\3"+
		"\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SM\3\2\2\2ST\3\2\2\2TU\3"+
		"\2\2\2UX\7\36\2\2VY\5\24\13\2WY\7(\2\2XV\3\2\2\2XW\3\2\2\2Y\u0097\3\2"+
		"\2\2Z[\7\21\2\2[]\7\32\2\2\\^\5\22\n\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2"+
		"_a\5\b\5\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\5\n\6\2ce\5\f\7\2dc\3\2\2\2"+
		"de\3\2\2\2e\u0097\3\2\2\2fg\7\34\2\2gh\7*\2\2hi\7\37\2\2ij\5\22\n\2jk"+
		"\7 \2\2kl\7\25\2\2lm\7*\2\2mn\7%\2\2no\7\23\2\2ov\5\24\13\2pr\7\27\2\2"+
		"qs\5\34\17\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vp\3\2\2"+
		"\2vw\3\2\2\2wx\3\2\2\2x{\7\36\2\2y|\5\24\13\2z|\7(\2\2{y\3\2\2\2{z\3\2"+
		"\2\2|\u0097\3\2\2\2}~\7\f\2\2~\u0081\5\22\n\2\177\u0080\7\24\2\2\u0080"+
		"\u0082\t\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0097\3\2\2"+
		"\2\u0083\u0085\7\20\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\t\3\2\2\u0087\u0088\7*\2\2\u0088\u0089\7\37"+
		"\2\2\u0089\u008a\5\22\n\2\u008a\u008b\7 \2\2\u008b\u008c\5\n\6\2\u008c"+
		"\u0097\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7*\2\2\u008f\u0090\7\37"+
		"\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7 \2\2\u0092\u0093\5\n\6\2\u0093"+
		"\u0094\7\25\2\2\u0094\u0095\5\22\n\2\u0095\u0097\3\2\2\2\u0096/\3\2\2"+
		"\2\u0096\65\3\2\2\2\u0096>\3\2\2\2\u0096K\3\2\2\2\u0096Z\3\2\2\2\u0096"+
		"f\3\2\2\2\u0096}\3\2\2\2\u0096\u0084\3\2\2\2\u0096\u008d\3\2\2\2\u0097"+
		"\5\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7*\2\2\u009a\u009b\7\25\2\2"+
		"\u009b\u009c\7\37\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7 \2\2\u009e\7"+
		"\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5\22\n\2\u00a1\t\3\2\2\2\u00a2"+
		"\u00a3\7\5\2\2\u00a3\u00a4\5\22\n\2\u00a4\13\3\2\2\2\u00a5\u00a6\7\6\2"+
		"\2\u00a6\u00a7\5\22\n\2\u00a7\r\3\2\2\2\u00a8\u00af\7\r\2\2\u00a9\u00aa"+
		"\7*\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ad\7%\2\2\u00ad"+
		"\u00ae\7*\2\2\u00ae\u00b0\7 \2\2\u00af\u00a9\3\2\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\u00bc\3\2\2\2\u00b1\u00b7\7\17\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b4"+
		"\7\37\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7 \2\2\u00b6\u00b8\3\2\2\2"+
		"\u00b7\u00b2\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00ba"+
		"\7\21\2\2\u00ba\u00bc\7*\2\2\u00bb\u00a8\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\17\3\2\2\2\u00bd\u00be\7\24\2\2\u00be\u00bf\7*\2"+
		"\2\u00bf\21\3\2\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7%\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5\36"+
		"\20\2\u00c9\23\3\2\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\25\3\2\2"+
		"\2\u00cf\u00d1\5\30\r\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dd\7\'\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7*\2\2\u00df\u00e0\7\37\2\2\u00e0\u00e1\5\22"+
		"\n\2\u00e1\u00e2\7 \2\2\u00e2\27\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5"+
		"\7*\2\2\u00e5\u00e6\7&\2\2\u00e6\u00ed\7*\2\2\u00e7\u00e9\7\27\2\2\u00e8"+
		"\u00ea\5\34\17\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\4\2\2\u00f0\31\3\2\2"+
		"\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\7&\2\2\u00f4\u00fb"+
		"\7*\2\2\u00f5\u00f7\7\27\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\7\4\2\2\u00fe\33\3\2\2\2\u00ff\u0100\7*\2\2\u0100\u0109\7\t\2\2"+
		"\u0101\u0103\5 \21\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\7*\2\2\u0105\u0107\5\"\22\2\u0106\u0105\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0102\3\2"+
		"\2\2\u0109\35\3\2\2\2\u010a\u010d\7*\2\2\u010b\u010d\7)\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010d\37\3\2\2\2\u010e\u010f\7*\2\2\u010f"+
		"\u0110\t\4\2\2\u0110!\3\2\2\2\u0111\u0112\t\5\2\2\u0112\u0113\7*\2\2\u0113"+
		"#\3\2\2\2!)@GQSX]`dtv{\u0081\u0084\u0096\u00af\u00b7\u00bb\u00c5\u00cd"+
		"\u00d2\u00d8\u00dc\u00eb\u00ed\u00f9\u00fb\u0102\u0106\u0108\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}