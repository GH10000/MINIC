package bianyiqi;
//ö����  �г������еĴʷ��Ǻ�
public enum Tag {
  ERR ,//default
  END,//����
  ID,//��ʶ��
  KW_INT,KW_CHAR,KW_STRING,KW_VOID,//����
  NUM,CH,STR,//����  ���ͺ��ַ��� 
  NOT,LEA,//�� &
  ADD,SUB,MUL,DIV,MOD,//+��-��*��/��%
  INC,DEC,//++,--
  GT,GE,LT,LE,EQU,NEQU,//>,>=,<,<=,==,!=
  AND,OR,//�߼����� 
  LPRAEN,RPAREN,//()
  LBRACK,RBRACK,//[]
  LBRACE,RBRACE,//{}
  COMMA,COLON,SEMICON,//,,:,;
  ASSIGN,//��ֵ
  KW_IF,KW_ELSE,//�ж�
  KW_WHILE,KW_DO,KW_FOR,//ѭ��
  KW_BREAK,KW_CONTINUE,KW_RETURN,//����
  KW_READ,KW_PRINTF//��д
  
}
