package bianyiqi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fun {
Tag type;//��������
String name;//��������
LinkedList<var> paraVar;//�β��б�
int maxdeep;//ջ��������
int curEsp; //esp����ָ���λ��
ArrayList<Integer> zyyEsp  = new ArrayList<Integer>();//������ ָ��λ��

LinkedList<InterInst> interCode = new LinkedList<InterInst>();//�м����
InterInst returnPoint;//���ص�

//���캯��
Fun(Tag t,String name,LinkedList<var> paraList)
{
	type = t;
	this.name  = name;
	paraVar = paraList;
	curEsp = 0;
	maxdeep = 0;
	for(int i = 0,argoff=8;i<paraList.size();i++,argoff+=4)
	{
		paraVar.get(i).offset = argoff;
	}
		//Ϊÿһ��ʵ�ʲ�������ƫ�Ƶ�ַ�Եõ�  
}


//Ŀ������മ
//���ص�
public void enterZyy()
{
	zyyEsp.add(0);
}
public void leaveZyy()
{
	if(curEsp> maxdeep)
		maxdeep = curEsp;
        curEsp = curEsp -zyyEsp.get(zyyEsp.size()-1);
        zyyEsp.remove(zyyEsp.size()-1);
		
}
}
