package bianyiqi;

import java.util.LinkedList;
import java.util.ArrayList;
//�������� 
public class var {
boolean iscl = false;//�Ƿ���
ArrayList<Integer> zyylj  = new ArrayList<Integer>();
Tag type;//����
String name;//����
boolean isarry = false;//�Ƿ�����
int arraySize;//���鳤��
boolean isleft = true;//�Ƿ������Ϊ��ֵ

//��ֵ
boolean isinit = false;//�Ƿ��ʼ��
int initval;//�������ͱ�����ֵ
char initchar;
String initstr;
int size;//������С
int offset;//ջ֡ƫ��
 static int x = 0;//�ж����ַ���
//���캯��
 var()
 {
	
	 
 }
 var(int a)
 {
	  iscl = true;
	  type = Tag.KW_INT;
	  isleft = false;
	  initval = a;
 }
 var(String name,int a)
 {
	  this.name  = name;
	  iscl = true;
	  type = Tag.KW_INT;
	  isleft = false;
	  initval = a;
 }
 var(Token t)
{
	iscl=true;
	isleft=false;
	isinit = true;
	switch(t.tag)
	{
	case NUM:
		type = Tag.KW_INT;
		name ="<int>";
		initval = t.val;
		break;
	case CH:
		type = Tag.KW_CHAR;
		name ="<char>";
		initchar = t.ch;
		break;
	case STR:
		type = Tag.KW_STRING;
		name ="string"+String.valueOf(x);
		isarry = true;
		arraySize = t.s.length();
		initstr = t.s;
		break;
		default:
			
	}
	
}

}
