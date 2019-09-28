/* The following code was generated by JFlex 1.7.0 */

/* JFlex specification file for Toy Programming Language*/
// User Code
package lexicalAnalyzer;
import token.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>D:/eclipse/java-oxygen/eclipse-workspace/lexical-analyzer/src/lexicalAnalyzer/toy.jflex</tt>
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
    "\11\0\1\17\1\6\1\10\1\7\1\7\22\0\1\17\1\56\1\4"+
    "\2\0\1\52\1\57\1\0\1\63\1\64\1\16\1\50\1\61\1\51"+
    "\1\3\1\15\12\2\1\0\1\62\1\53\1\55\1\54\2\0\22\1"+
    "\1\43\7\1\1\65\1\5\1\66\3\0\1\25\1\30\1\33\1\34"+
    "\1\23\1\24\1\44\1\45\1\36\1\1\1\47\1\26\1\37\1\32"+
    "\1\31\1\40\1\1\1\21\1\27\1\20\1\22\1\46\1\41\1\35"+
    "\1\42\1\1\1\67\1\60\1\70\7\0\1\10\134\0\1\11\160\0"+
    "\1\13\u1ed4\0\1\10\1\10\202\0\1\12\udf50\0\1\14\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\22\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\0\1\4\1\5\1\0"+
    "\1\6\1\7\15\1\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\2\0\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\2\0\1\5\1\0"+
    "\15\1\1\31\6\1\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\3\0\7\1\1\40\3\1\1\41\2\1\1\42"+
    "\5\1\2\0\1\43\1\44\2\1\1\45\3\1\1\46"+
    "\10\1\1\47\2\0\3\1\1\50\2\1\1\51\4\1"+
    "\1\52\1\1\1\53\1\54\3\1\1\55\3\1\1\56"+
    "\1\57\1\60\3\1\1\61\1\62\2\1\1\63\1\1"+
    "\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[152];
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
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u011d\0\u0156"+
    "\0\u018f\0\u011d\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5"+
    "\0\u031e\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u011d"+
    "\0\u011d\0\u011d\0\u04ad\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca"+
    "\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d"+
    "\0\253\0\u011d\0\u0603\0\u063c\0\u0675\0\u06ae\0\u06e7\0\u0720"+
    "\0\u0759\0\u0792\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\u08e8"+
    "\0\u0921\0\u095a\0\u0993\0\71\0\u09cc\0\u0a05\0\u0a3e\0\u0a77"+
    "\0\u0ab0\0\u0ae9\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d"+
    "\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1"+
    "\0\u0cea\0\u0d23\0\71\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0e40"+
    "\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008"+
    "\0\u1041\0\71\0\71\0\u107a\0\u10b3\0\71\0\u10ec\0\u1125"+
    "\0\u115e\0\71\0\u1197\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4"+
    "\0\u12ed\0\u1326\0\71\0\u135f\0\u1398\0\u13d1\0\u140a\0\u1443"+
    "\0\71\0\u147c\0\u14b5\0\71\0\u14ee\0\u1527\0\u1560\0\u1599"+
    "\0\71\0\u15d2\0\71\0\71\0\u160b\0\u1644\0\u167d\0\71"+
    "\0\u16b6\0\u16ef\0\u1728\0\71\0\71\0\71\0\u1761\0\u179a"+
    "\0\u17d3\0\71\0\71\0\u180c\0\u1845\0\71\0\u187e\0\71";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[152];
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
    "\1\0\1\2\1\3\1\4\1\5\1\0\1\6\1\7"+
    "\1\0\1\10\3\0\1\11\1\12\1\7\1\13\1\14"+
    "\1\2\1\15\1\16\3\2\1\17\1\2\1\20\1\21"+
    "\1\22\1\2\1\23\1\2\1\24\1\25\1\2\1\26"+
    "\2\2\1\27\1\2\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\0\2\2\15\0\30\2"+
    "\23\0\1\3\1\51\67\0\1\51\66\0\4\5\1\52"+
    "\1\53\63\5\103\0\1\54\73\0\1\55\1\56\53\0"+
    "\2\2\15\0\1\2\1\57\23\2\1\60\2\2\22\0"+
    "\2\2\15\0\3\2\1\61\24\2\22\0\2\2\15\0"+
    "\6\2\1\62\6\2\1\63\12\2\22\0\2\2\15\0"+
    "\5\2\1\64\3\2\1\65\16\2\22\0\2\2\15\0"+
    "\1\2\1\66\7\2\1\67\16\2\22\0\2\2\15\0"+
    "\2\2\1\70\1\71\24\2\22\0\2\2\15\0\6\2"+
    "\1\72\21\2\22\0\2\2\15\0\11\2\1\73\16\2"+
    "\22\0\2\2\15\0\4\2\1\74\5\2\1\75\4\2"+
    "\1\76\10\2\22\0\2\2\15\0\1\2\1\77\26\2"+
    "\22\0\2\2\15\0\25\2\1\100\2\2\22\0\2\2"+
    "\15\0\1\101\27\2\22\0\2\2\15\0\11\2\1\102"+
    "\16\2\76\0\1\103\70\0\1\104\70\0\1\105\70\0"+
    "\1\106\72\0\1\107\71\0\1\110\15\0\1\111\76\0"+
    "\1\112\55\0\6\55\3\0\60\55\16\56\1\113\52\56"+
    "\1\0\2\2\15\0\2\2\1\114\25\2\22\0\2\2"+
    "\15\0\16\2\1\115\11\2\22\0\2\2\15\0\1\116"+
    "\4\2\1\117\22\2\22\0\2\2\15\0\7\2\1\120"+
    "\20\2\22\0\2\2\15\0\1\121\27\2\22\0\2\2"+
    "\15\0\6\2\1\122\21\2\22\0\2\2\15\0\1\2"+
    "\1\123\26\2\22\0\2\2\15\0\3\2\1\124\24\2"+
    "\22\0\2\2\15\0\11\2\1\125\16\2\22\0\2\2"+
    "\15\0\6\2\1\126\21\2\22\0\2\2\15\0\21\2"+
    "\1\127\6\2\22\0\2\2\15\0\5\2\1\130\22\2"+
    "\22\0\2\2\15\0\2\2\1\131\25\2\22\0\2\2"+
    "\15\0\1\132\27\2\22\0\2\2\15\0\20\2\1\133"+
    "\7\2\22\0\2\2\15\0\16\2\1\134\11\2\22\0"+
    "\2\2\15\0\16\2\1\135\11\2\22\0\2\2\15\0"+
    "\1\2\1\136\26\2\22\0\2\2\15\0\16\2\1\137"+
    "\11\2\21\0\6\5\3\0\60\5\5\112\1\140\3\112"+
    "\1\141\1\0\1\112\1\0\54\112\15\56\1\7\1\113"+
    "\52\56\1\0\2\2\15\0\3\2\1\142\24\2\22\0"+
    "\2\2\15\0\7\2\1\143\20\2\22\0\2\2\15\0"+
    "\2\2\1\144\25\2\22\0\2\2\15\0\14\2\1\145"+
    "\13\2\22\0\2\2\15\0\3\2\1\146\24\2\22\0"+
    "\2\2\15\0\3\2\1\147\24\2\22\0\2\2\15\0"+
    "\7\2\1\114\20\2\22\0\2\2\15\0\5\2\1\150"+
    "\22\2\22\0\2\2\15\0\6\2\1\151\21\2\22\0"+
    "\2\2\15\0\6\2\1\152\21\2\22\0\2\2\15\0"+
    "\5\2\1\153\22\2\22\0\2\2\15\0\7\2\1\154"+
    "\20\2\22\0\2\2\15\0\10\2\1\155\17\2\22\0"+
    "\2\2\15\0\3\2\1\156\24\2\22\0\2\2\15\0"+
    "\6\2\1\157\21\2\22\0\2\2\15\0\12\2\1\160"+
    "\15\2\22\0\2\2\15\0\6\2\1\161\21\2\22\0"+
    "\2\2\15\0\16\2\1\162\11\2\22\0\2\2\15\0"+
    "\14\2\1\163\13\2\26\0\1\164\75\0\1\165\57\0"+
    "\2\2\15\0\1\2\1\166\26\2\22\0\2\2\15\0"+
    "\6\2\1\167\21\2\22\0\2\2\15\0\12\2\1\170"+
    "\15\2\22\0\2\2\15\0\27\2\1\171\22\0\2\2"+
    "\15\0\3\2\1\172\24\2\22\0\2\2\15\0\1\2"+
    "\1\173\26\2\22\0\2\2\15\0\7\2\1\174\20\2"+
    "\22\0\2\2\15\0\6\2\1\175\21\2\22\0\2\2"+
    "\15\0\1\2\1\176\26\2\22\0\2\2\15\0\3\2"+
    "\1\177\24\2\22\0\2\2\15\0\1\200\27\2\22\0"+
    "\2\2\15\0\3\2\1\201\24\2\22\0\2\2\15\0"+
    "\12\2\1\202\15\2\21\0\6\112\3\0\60\112\14\0"+
    "\1\52\55\0\2\2\15\0\12\2\1\203\15\2\22\0"+
    "\2\2\15\0\12\2\1\204\15\2\22\0\2\2\15\0"+
    "\14\2\1\205\13\2\22\0\2\2\15\0\5\2\1\206"+
    "\22\2\22\0\2\2\15\0\1\2\1\207\26\2\22\0"+
    "\2\2\15\0\3\2\1\210\24\2\22\0\2\2\15\0"+
    "\4\2\1\211\23\2\22\0\2\2\15\0\17\2\1\212"+
    "\10\2\22\0\2\2\15\0\6\2\1\213\21\2\22\0"+
    "\2\2\15\0\24\2\1\214\3\2\22\0\2\2\15\0"+
    "\7\2\1\215\20\2\22\0\2\2\15\0\12\2\1\216"+
    "\15\2\22\0\2\2\15\0\5\2\1\217\22\2\22\0"+
    "\2\2\15\0\5\2\1\220\22\2\22\0\2\2\15\0"+
    "\3\2\1\221\24\2\22\0\2\2\15\0\12\2\1\222"+
    "\15\2\22\0\2\2\15\0\22\2\1\223\5\2\22\0"+
    "\2\2\15\0\13\2\1\224\14\2\22\0\2\2\15\0"+
    "\12\2\1\225\15\2\22\0\2\2\15\0\3\2\1\226"+
    "\24\2\22\0\2\2\15\0\1\227\27\2\22\0\2\2"+
    "\15\0\7\2\1\230\20\2\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6327];
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
    "\1\0\3\1\1\0\2\11\1\0\1\1\1\11\15\1"+
    "\3\11\4\1\2\0\10\11\1\1\1\11\2\0\1\1"+
    "\1\0\24\1\6\11\3\0\24\1\2\0\22\1\2\0"+
    "\43\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[152];
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
static final int BOOLEANCONSTANT = 0;
static final int BOOLEAN = 1;
static final int CLASS = 2;
static final int DOUBLE = 3;
static final int ELSE = 4;
static final int EXTENDS = 5;
static final int FOR = 6;
static final int IF = 7;
static final int IMPLEMENTS = 8;
static final int INTERFACE = 9;
static final int NEW = 10;
static final int NEWARRAY = 11;
static final int PRINTLN = 12;
static final int READLN = 13;
static final int RETURN = 14;
static final int STRING = 15;
static final int THIS = 16;
static final int VOID = 17;
static final int WHILE = 18;
static final int BREAK = 19;
static final int NULL = 20;
static final int INT = 21;
int t_flag = 0;
int yylval;
// trie table that contains the identifiers and keywords
TrieTable trie = new TrieTable();

public void outputTrie() {
	trie.output();
}

// end of user code


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ToyLexer(java.io.Reader in) {
  // Add keyword identifiers to the trie table.
Scanner s;
try {
	s = new Scanner(new FileReader("src/lexicalAnalyzer/keywords.txt"));
	while (s.hasNext()) {
		trie.insert(s.next());
	}
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
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
    while (i < 190) {
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
  public Integer yylex() throws java.io.IOException {
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print("id" + " "); trie.insert(yytext()); return(TokenDefinitions.ID);
            } 
            // fall through
          case 53: break;
          case 2: 
            { System.out.print("intconstant" + " "); return (TokenDefinitions.INTCONSTANT);
            } 
            // fall through
          case 54: break;
          case 3: 
            { System.out.print("period" + " "); return (TokenDefinitions.PERIOD);
            } 
            // fall through
          case 55: break;
          case 4: 
            { System.out.print("\n");
            } 
            // fall through
          case 56: break;
          case 5: 
            { 
            } 
            // fall through
          case 57: break;
          case 6: 
            { System.out.print("division" + " "); return (TokenDefinitions.DIVISION);
            } 
            // fall through
          case 58: break;
          case 7: 
            { System.out.print("multipication" + " "); return (TokenDefinitions.MULTIPLICATION);
            } 
            // fall through
          case 59: break;
          case 8: 
            { System.out.print("plus" + " "); return (TokenDefinitions.PLUS);
            } 
            // fall through
          case 60: break;
          case 9: 
            { System.out.print("minus" + " "); return (TokenDefinitions.MINUS);
            } 
            // fall through
          case 61: break;
          case 10: 
            { System.out.print("mod" + " "); return (TokenDefinitions.MOD);
            } 
            // fall through
          case 62: break;
          case 11: 
            { System.out.print("less" + " "); return (TokenDefinitions.LESS);
            } 
            // fall through
          case 63: break;
          case 12: 
            { System.out.print("greater" + " "); return (TokenDefinitions.GREATER);
            } 
            // fall through
          case 64: break;
          case 13: 
            { System.out.print("assignop" + " "); return (TokenDefinitions.ASSIGNOP);
            } 
            // fall through
          case 65: break;
          case 14: 
            { System.out.print("not" + " "); return (TokenDefinitions.NOT);
            } 
            // fall through
          case 66: break;
          case 15: 
            { System.out.print("comma" + " "); return (TokenDefinitions.COMMA);
            } 
            // fall through
          case 67: break;
          case 16: 
            { System.out.print("semicolon" + " "); return (TokenDefinitions.SEMICOLON);
            } 
            // fall through
          case 68: break;
          case 17: 
            { System.out.print("leftparen" + " "); return (TokenDefinitions.LEFTPAREN);
            } 
            // fall through
          case 69: break;
          case 18: 
            { System.out.print("rightparen" + " "); return (TokenDefinitions.RIGHTPAREN);
            } 
            // fall through
          case 70: break;
          case 19: 
            { System.out.print("leftbracket" + " "); return (TokenDefinitions.LEFTBRACKET);
            } 
            // fall through
          case 71: break;
          case 20: 
            { System.out.print("rightbracket" + " "); return (TokenDefinitions.RIGHTBRACKET);
            } 
            // fall through
          case 72: break;
          case 21: 
            { System.out.print("leftbrace" + " "); return (TokenDefinitions.LEFTBRACE);
            } 
            // fall through
          case 73: break;
          case 22: 
            { System.out.print("rightbrace" + " "); return (TokenDefinitions.RIGHTBRACE);
            } 
            // fall through
          case 74: break;
          case 23: 
            { System.out.print("doubleconstant" + " "); return (TokenDefinitions.DOUBLECONSTANT);
            } 
            // fall through
          case 75: break;
          case 24: 
            { System.out.print("stringconstant" + " "); return (TokenDefinitions.STRINGCONSTANT);
            } 
            // fall through
          case 76: break;
          case 25: 
            { t_flag = IF; System.out.print(yytext() + " "); return (TokenDefinitions.IF);
            } 
            // fall through
          case 77: break;
          case 26: 
            { System.out.print("lessequal" + " "); return (TokenDefinitions.LESSEQUAL);
            } 
            // fall through
          case 78: break;
          case 27: 
            { System.out.print("greaterequal" + " "); return (TokenDefinitions.GREATEREQUAL);
            } 
            // fall through
          case 79: break;
          case 28: 
            { System.out.print("equal" + " "); return (TokenDefinitions.EQUAL);
            } 
            // fall through
          case 80: break;
          case 29: 
            { System.out.print("notequal" + " "); return (TokenDefinitions.NOTEQUAL);
            } 
            // fall through
          case 81: break;
          case 30: 
            { System.out.print("and" + " "); return (TokenDefinitions.AND);
            } 
            // fall through
          case 82: break;
          case 31: 
            { System.out.print("or" + " "); return (TokenDefinitions.OR);
            } 
            // fall through
          case 83: break;
          case 32: 
            { t_flag = FOR; System.out.print(yytext() + " "); return (TokenDefinitions.FOR);
            } 
            // fall through
          case 84: break;
          case 33: 
            { t_flag = NEW; System.out.print(yytext() + " "); return (TokenDefinitions.NEW);
            } 
            // fall through
          case 85: break;
          case 34: 
            { t_flag = INT; System.out.print(yytext() + " "); return (TokenDefinitions.INT);
            } 
            // fall through
          case 86: break;
          case 35: 
            { t_flag = BOOLEANCONSTANT; System.out.print(yytext() + " "); return (TokenDefinitions.BOOLEANCONSTANT);
            } 
            // fall through
          case 87: break;
          case 36: 
            { t_flag = THIS; System.out.print(yytext() + " "); return (TokenDefinitions.THIS);
            } 
            // fall through
          case 88: break;
          case 37: 
            { t_flag = ELSE; System.out.print(yytext() + " "); return (TokenDefinitions.ELSE);
            } 
            // fall through
          case 89: break;
          case 38: 
            { t_flag = NULL; System.out.print(yytext() + " "); return (TokenDefinitions.NULL);
            } 
            // fall through
          case 90: break;
          case 39: 
            { t_flag = VOID; System.out.print(yytext() + " "); return (TokenDefinitions.VOID);
            } 
            // fall through
          case 91: break;
          case 40: 
            { t_flag = BREAK; System.out.print(yytext() + " "); return (TokenDefinitions.BREAK);
            } 
            // fall through
          case 92: break;
          case 41: 
            { t_flag = CLASS; System.out.print(yytext() + " "); return (TokenDefinitions.CLASS);
            } 
            // fall through
          case 93: break;
          case 42: 
            { t_flag = WHILE; System.out.print(yytext() + " "); return (TokenDefinitions.WHILE);
            } 
            // fall through
          case 94: break;
          case 43: 
            { t_flag = RETURN; System.out.print(yytext() + " "); return (TokenDefinitions.RETURN);
            } 
            // fall through
          case 95: break;
          case 44: 
            { t_flag = READLN; System.out.print(yytext() + " "); return (TokenDefinitions.READLN);
            } 
            // fall through
          case 96: break;
          case 45: 
            { t_flag = DOUBLE; System.out.print(yytext() + " "); return (TokenDefinitions.DOUBLE);
            } 
            // fall through
          case 97: break;
          case 46: 
            { t_flag = STRING; System.out.print(yytext() + " "); return (TokenDefinitions.STRING);
            } 
            // fall through
          case 98: break;
          case 47: 
            { t_flag = EXTENDS; System.out.print(yytext() + " "); return (TokenDefinitions.EXTENDS);
            } 
            // fall through
          case 99: break;
          case 48: 
            { t_flag = BOOLEAN; System.out.print(yytext() + " "); return (TokenDefinitions.BOOLEAN);
            } 
            // fall through
          case 100: break;
          case 49: 
            { t_flag = PRINTLN; System.out.print(yytext() + " "); return (TokenDefinitions.PRINTLN);
            } 
            // fall through
          case 101: break;
          case 50: 
            { t_flag = NEWARRAY; System.out.print(yytext() + " "); return (TokenDefinitions.NEWARRAY);
            } 
            // fall through
          case 102: break;
          case 51: 
            { t_flag = INTERFACE; System.out.print(yytext() + " "); return (TokenDefinitions.INTERFACE);
            } 
            // fall through
          case 103: break;
          case 52: 
            { t_flag = IMPLEMENTS; System.out.print(yytext() + " "); return (TokenDefinitions.IMPLEMENTS);
            } 
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
