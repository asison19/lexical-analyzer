/* The following code was generated by JFlex 1.7.0 */

/* JFlex specification file for Toy Programming Language
*/

// User Code
package lexicalAnalyzer;
import token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>C:/Users/Owner/eclipse-workspace/LexicalAnalyzer/toy.jflex</tt>
 */
public class ToyLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\12\1\2\2\0\1\1\22\0\1\12\1\51\1\7\2\0"+
    "\1\45\1\52\1\0\1\56\1\57\1\11\1\43\1\54\1\44\1\6"+
    "\1\10\12\5\1\0\1\55\1\46\1\50\1\47\2\0\22\4\1\36"+
    "\7\4\1\60\1\0\1\61\3\0\1\20\1\23\1\26\1\27\1\16"+
    "\1\17\1\37\1\40\1\31\1\4\1\42\1\21\1\32\1\25\1\24"+
    "\1\33\1\4\1\14\1\22\1\13\1\15\1\41\1\34\1\30\1\35"+
    "\1\4\1\62\1\53\1\63\115\0\1\3\u1f54\0\1\3\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfef\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\0\1\5\1\6"+
    "\15\3\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\2\0\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\2\0\15\3\1\30\6\3\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\2\1\0\7\3"+
    "\1\37\3\3\1\40\2\3\1\41\5\3\1\0\1\42"+
    "\1\43\2\3\1\44\3\3\1\45\10\3\1\46\1\2"+
    "\3\3\1\47\2\3\1\50\4\3\1\51\1\3\1\52"+
    "\1\53\3\3\1\54\3\3\1\55\1\56\1\57\3\3"+
    "\1\60\1\61\2\3\1\62\1\3\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\64"+
    "\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\64\0\64\0\64"+
    "\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0\0\u0514\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\320\0\64"+
    "\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4"+
    "\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\150"+
    "\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\u0548\0\u098c\0\u09c0\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\150\0\u0b2c\0\u0b60"+
    "\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00"+
    "\0\u0d34\0\u0d68\0\u0d9c\0\150\0\150\0\u0dd0\0\u0e04\0\150"+
    "\0\u0e38\0\u0e6c\0\u0ea0\0\150\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70"+
    "\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\150\0\u098c\0\u1074\0\u10a8"+
    "\0\u10dc\0\150\0\u1110\0\u1144\0\150\0\u1178\0\u11ac\0\u11e0"+
    "\0\u1214\0\150\0\u1248\0\150\0\150\0\u127c\0\u12b0\0\u12e4"+
    "\0\150\0\u1318\0\u134c\0\u1380\0\150\0\150\0\150\0\u13b4"+
    "\0\u13e8\0\u141c\0\150\0\150\0\u1450\0\u1484\0\150\0\u14b8"+
    "\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\0\1\2\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\2\1\11\1\12\1\3\1\13\1\14\3\3"+
    "\1\15\1\3\1\16\1\17\1\20\1\3\1\21\1\3"+
    "\1\22\1\23\1\3\1\24\2\3\1\25\1\3\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\70\0\2\3\5\0\30\3\26\0\1\4\1\47\62\0"+
    "\1\47\56\0\7\6\1\50\54\6\10\0\1\51\1\52"+
    "\56\0\2\3\5\0\1\3\1\53\23\3\1\54\2\3"+
    "\25\0\2\3\5\0\3\3\1\55\24\3\25\0\2\3"+
    "\5\0\6\3\1\56\6\3\1\57\12\3\25\0\2\3"+
    "\5\0\5\3\1\60\3\3\1\61\16\3\25\0\2\3"+
    "\5\0\1\3\1\62\7\3\1\63\16\3\25\0\2\3"+
    "\5\0\2\3\1\64\1\65\24\3\25\0\2\3\5\0"+
    "\6\3\1\66\21\3\25\0\2\3\5\0\11\3\1\67"+
    "\16\3\25\0\2\3\5\0\4\3\1\70\5\3\1\71"+
    "\4\3\1\72\10\3\25\0\2\3\5\0\1\3\1\73"+
    "\26\3\25\0\2\3\5\0\25\3\1\74\2\3\25\0"+
    "\2\3\5\0\1\75\27\3\25\0\2\3\5\0\11\3"+
    "\1\76\16\3\71\0\1\77\63\0\1\100\63\0\1\101"+
    "\63\0\1\102\65\0\1\103\64\0\1\104\11\0\2\105"+
    "\1\51\63\0\1\106\5\0\1\106\56\0\2\3\5\0"+
    "\2\3\1\107\25\3\25\0\2\3\5\0\16\3\1\110"+
    "\11\3\25\0\2\3\5\0\1\111\4\3\1\112\22\3"+
    "\25\0\2\3\5\0\7\3\1\113\20\3\25\0\2\3"+
    "\5\0\1\114\27\3\25\0\2\3\5\0\6\3\1\115"+
    "\21\3\25\0\2\3\5\0\1\3\1\116\26\3\25\0"+
    "\2\3\5\0\3\3\1\117\24\3\25\0\2\3\5\0"+
    "\11\3\1\120\16\3\25\0\2\3\5\0\6\3\1\121"+
    "\21\3\25\0\2\3\5\0\21\3\1\122\6\3\25\0"+
    "\2\3\5\0\5\3\1\123\22\3\25\0\2\3\5\0"+
    "\2\3\1\124\25\3\25\0\2\3\5\0\1\125\27\3"+
    "\25\0\2\3\5\0\20\3\1\126\7\3\25\0\2\3"+
    "\5\0\16\3\1\127\11\3\25\0\2\3\5\0\16\3"+
    "\1\130\11\3\25\0\2\3\5\0\1\3\1\131\26\3"+
    "\25\0\2\3\5\0\16\3\1\132\11\3\24\0\1\106"+
    "\5\0\1\133\56\0\2\3\5\0\3\3\1\134\24\3"+
    "\25\0\2\3\5\0\7\3\1\135\20\3\25\0\2\3"+
    "\5\0\2\3\1\136\25\3\25\0\2\3\5\0\14\3"+
    "\1\137\13\3\25\0\2\3\5\0\3\3\1\140\24\3"+
    "\25\0\2\3\5\0\3\3\1\141\24\3\25\0\2\3"+
    "\5\0\7\3\1\107\20\3\25\0\2\3\5\0\5\3"+
    "\1\142\22\3\25\0\2\3\5\0\6\3\1\143\21\3"+
    "\25\0\2\3\5\0\6\3\1\144\21\3\25\0\2\3"+
    "\5\0\5\3\1\145\22\3\25\0\2\3\5\0\7\3"+
    "\1\146\20\3\25\0\2\3\5\0\10\3\1\147\17\3"+
    "\25\0\2\3\5\0\3\3\1\150\24\3\25\0\2\3"+
    "\5\0\6\3\1\151\21\3\25\0\2\3\5\0\12\3"+
    "\1\152\15\3\25\0\2\3\5\0\6\3\1\153\21\3"+
    "\25\0\2\3\5\0\16\3\1\154\11\3\25\0\2\3"+
    "\5\0\14\3\1\155\13\3\24\0\1\106\4\0\1\156"+
    "\1\133\56\0\2\3\5\0\1\3\1\157\26\3\25\0"+
    "\2\3\5\0\6\3\1\160\21\3\25\0\2\3\5\0"+
    "\12\3\1\161\15\3\25\0\2\3\5\0\27\3\1\162"+
    "\25\0\2\3\5\0\3\3\1\163\24\3\25\0\2\3"+
    "\5\0\1\3\1\164\26\3\25\0\2\3\5\0\7\3"+
    "\1\165\20\3\25\0\2\3\5\0\6\3\1\166\21\3"+
    "\25\0\2\3\5\0\1\3\1\167\26\3\25\0\2\3"+
    "\5\0\3\3\1\170\24\3\25\0\2\3\5\0\1\171"+
    "\27\3\25\0\2\3\5\0\3\3\1\172\24\3\25\0"+
    "\2\3\5\0\12\3\1\173\15\3\25\0\2\3\5\0"+
    "\12\3\1\174\15\3\25\0\2\3\5\0\12\3\1\175"+
    "\15\3\25\0\2\3\5\0\14\3\1\176\13\3\25\0"+
    "\2\3\5\0\5\3\1\177\22\3\25\0\2\3\5\0"+
    "\1\3\1\200\26\3\25\0\2\3\5\0\3\3\1\201"+
    "\24\3\25\0\2\3\5\0\4\3\1\202\23\3\25\0"+
    "\2\3\5\0\17\3\1\203\10\3\25\0\2\3\5\0"+
    "\6\3\1\204\21\3\25\0\2\3\5\0\24\3\1\205"+
    "\3\3\25\0\2\3\5\0\7\3\1\206\20\3\25\0"+
    "\2\3\5\0\12\3\1\207\15\3\25\0\2\3\5\0"+
    "\5\3\1\210\22\3\25\0\2\3\5\0\5\3\1\211"+
    "\22\3\25\0\2\3\5\0\3\3\1\212\24\3\25\0"+
    "\2\3\5\0\12\3\1\213\15\3\25\0\2\3\5\0"+
    "\22\3\1\214\5\3\25\0\2\3\5\0\13\3\1\215"+
    "\14\3\25\0\2\3\5\0\12\3\1\216\15\3\25\0"+
    "\2\3\5\0\3\3\1\217\24\3\25\0\2\3\5\0"+
    "\1\220\27\3\25\0\2\3\5\0\7\3\1\221\20\3"+
    "\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5356];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\3\1\1\0\1\1\1\11\15\1\3\11"+
    "\4\1\2\0\10\11\1\1\1\11\2\0\24\1\6\11"+
    "\1\1\1\0\24\1\1\0\66\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

// trie table goes here; switch, symbol, and next
class entry{
 public char name[] = new char[10];
 public int type;
}
char table[] = new char[100];
TokenDefinitions t = new TokenDefinitions();

int t_index = 0;
int t_flag = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ToyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return (Integer) null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println(yytext() + "\n"); return (t.INTCONSTANT);
            } 
            // fall through
          case 52: break;
          case 2: 
            { 
            } 
            // fall through
          case 53: break;
          case 3: 
            { System.out.println(yytext() + "\n"); return (t.ID);
            } 
            // fall through
          case 54: break;
          case 4: 
            { System.out.println(yytext() + "\n"); return (t.PERIOD);
            } 
            // fall through
          case 55: break;
          case 5: 
            { System.out.println(yytext() + "\n"); return (t.DIVISION);
            } 
            // fall through
          case 56: break;
          case 6: 
            { System.out.println(yytext() + "\n"); return (t.MULTIPLICATION);
            } 
            // fall through
          case 57: break;
          case 7: 
            { System.out.println(yytext() + "\n"); return (t.PLUS);
            } 
            // fall through
          case 58: break;
          case 8: 
            { System.out.println(yytext() + "\n"); return (t.MINUS);
            } 
            // fall through
          case 59: break;
          case 9: 
            { System.out.println(yytext() + "\n"); return (t.MOD);
            } 
            // fall through
          case 60: break;
          case 10: 
            { System.out.println(yytext() + "\n"); return (t.LESS);
            } 
            // fall through
          case 61: break;
          case 11: 
            { System.out.println(yytext() + "\n"); return (t.GREATER);
            } 
            // fall through
          case 62: break;
          case 12: 
            { System.out.println(yytext() + "\n"); return (t.ASSIGNOP);
            } 
            // fall through
          case 63: break;
          case 13: 
            { System.out.println(yytext() + "\n"); return (t.NOT);
            } 
            // fall through
          case 64: break;
          case 14: 
            { System.out.println(yytext() + "\n"); return (t.COMMA);
            } 
            // fall through
          case 65: break;
          case 15: 
            { System.out.println(yytext() + "\n"); return (t.SEMICOLON);
            } 
            // fall through
          case 66: break;
          case 16: 
            { System.out.println(yytext() + "\n"); return (t.LEFTPAREN);
            } 
            // fall through
          case 67: break;
          case 17: 
            { System.out.println(yytext() + "\n"); return (t.RIGHTPAREN);
            } 
            // fall through
          case 68: break;
          case 18: 
            { System.out.println(yytext() + "\n"); return (t.LEFTBRACKET);
            } 
            // fall through
          case 69: break;
          case 19: 
            { System.out.println(yytext() + "\n"); return (t.RIGHTBRACKET);
            } 
            // fall through
          case 70: break;
          case 20: 
            { System.out.println(yytext() + "\n"); return (t.LEFTBRACE);
            } 
            // fall through
          case 71: break;
          case 21: 
            { System.out.println(yytext() + "\n"); return (t.RIGHTBRACE);
            } 
            // fall through
          case 72: break;
          case 22: 
            { System.out.println(yytext() + "\n"); return (t.DOUBLECONSTANT);
            } 
            // fall through
          case 73: break;
          case 23: 
            { System.out.println(yytext() + "\n"); return (t.STRINGCONSTANT);
            } 
            // fall through
          case 74: break;
          case 24: 
            { t_flag = t.IF; System.out.println(yytext() + "\n"); return (t.IF);
            } 
            // fall through
          case 75: break;
          case 25: 
            { System.out.println(yytext() + "\n"); return (t.LESSEQUAL);
            } 
            // fall through
          case 76: break;
          case 26: 
            { System.out.println(yytext() + "\n"); return (t.GREATEREQUAL);
            } 
            // fall through
          case 77: break;
          case 27: 
            { System.out.println(yytext() + "\n"); return (t.EQUAL);
            } 
            // fall through
          case 78: break;
          case 28: 
            { System.out.println(yytext() + "\n"); return (t.NOTEQUAL);
            } 
            // fall through
          case 79: break;
          case 29: 
            { System.out.println(yytext() + "\n"); return (t.AND);
            } 
            // fall through
          case 80: break;
          case 30: 
            { System.out.println(yytext() + "\n"); return (t.OR);
            } 
            // fall through
          case 81: break;
          case 31: 
            { t_flag = t.FOR; System.out.println(yytext() + "\n"); return (t.FOR);
            } 
            // fall through
          case 82: break;
          case 32: 
            { t_flag = t.NEW; System.out.println(yytext() + "\n"); return (t.NEW);
            } 
            // fall through
          case 83: break;
          case 33: 
            { t_flag = t.INT; System.out.println(yytext() + "\n"); return (t.INT);
            } 
            // fall through
          case 84: break;
          case 34: 
            { t_flag = t.BOOLEANCONSTANT; System.out.println(yytext() + "\n"); return (t.BOOLEANCONSTANT);
            } 
            // fall through
          case 85: break;
          case 35: 
            { t_flag = t.THIS; System.out.println(yytext() + "\n"); return (t.THIS);
            } 
            // fall through
          case 86: break;
          case 36: 
            { t_flag = t.ELSE; System.out.println(yytext() + "\n"); return (t.ELSE);
            } 
            // fall through
          case 87: break;
          case 37: 
            { t_flag = t.NULL; System.out.println(yytext() + "\n"); return (t.NULL);
            } 
            // fall through
          case 88: break;
          case 38: 
            { t_flag = t.VOID; System.out.println(yytext() + "\n"); return (t.VOID);
            } 
            // fall through
          case 89: break;
          case 39: 
            { t_flag = t.BREAK; System.out.println(yytext() + "\n"); return (t.BREAK);
            } 
            // fall through
          case 90: break;
          case 40: 
            { t_flag = t.CLASS; System.out.println(yytext() + "\n"); return (t.CLASS);
            } 
            // fall through
          case 91: break;
          case 41: 
            { t_flag = t.WHILE; System.out.println(yytext() + "\n"); return (t.WHILE);
            } 
            // fall through
          case 92: break;
          case 42: 
            { t_flag = t.RETURN; System.out.println(yytext() + "\n"); return (t.RETURN);
            } 
            // fall through
          case 93: break;
          case 43: 
            { t_flag = t.READLN; System.out.println(yytext() + "\n"); return (t.READLN);
            } 
            // fall through
          case 94: break;
          case 44: 
            { t_flag = t.DOUBLE; System.out.println(yytext() + "\n"); return (t.DOUBLE);
            } 
            // fall through
          case 95: break;
          case 45: 
            { t_flag = t.STRING; System.out.println(yytext() + "\n"); return (t.STRING);
            } 
            // fall through
          case 96: break;
          case 46: 
            { t_flag = t.EXTENDS; System.out.println(yytext() + "\n"); return (t.EXTENDS);
            } 
            // fall through
          case 97: break;
          case 47: 
            { t_flag = t.BOOLEAN; System.out.println(yytext() + "\n"); return (t.BOOLEAN);
            } 
            // fall through
          case 98: break;
          case 48: 
            { t_flag = t.PRINTLN; System.out.println(yytext() + "\n"); return (t.PRINTLN);
            } 
            // fall through
          case 99: break;
          case 49: 
            { t_flag = t.NEWARRAY; System.out.println(yytext() + "\n"); return (t.NEWARRAY);
            } 
            // fall through
          case 100: break;
          case 50: 
            { t_flag = t.INTERFACE; System.out.println(yytext() + "\n"); return (t.INTERFACE);
            } 
            // fall through
          case 101: break;
          case 51: 
            { t_flag = t.IMPLEMENTS; System.out.println(yytext() + "\n"); return (t.IMPLEMENTS);
            } 
            // fall through
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
