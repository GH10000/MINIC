package bianyiqi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

//�﷨�Ƶ��������õķ��ű� 
public class fhb {
	
	public  HashMap<String, LinkedList<var>> vartab = new HashMap<String,LinkedList<var>>();
	public  HashMap<String, String> strtab = new HashMap<String,String>();
	public  HashMap<String, Fun> funtab = new HashMap<String,Fun>();
	public LinkedList<String> varname = new LinkedList<String>();
	Fun curfun;//���ڷ����ĺ���
	int zyyID;//��������
	ArrayList<Integer> zyylj = new ArrayList<Integer>();//������ ·�� 
	fhb()
	{
		zyyID = 0;
		zyylj.add(0);
	}
	//��ӱ�������
	void addVar(var v)
	{
		varname.add(v.name);
		if(vartab.get(v.name)==null)
		{	LinkedList<var>  varlist= new LinkedList<var>();
		     varlist.add(v);
			vartab.put(v.name,varlist);
		}
		else
		{
			vartab.get(v.name).add(v);
		}
	}
	var getvar(String name)
	{
		//System.out.println(name);
		var select = null;
		if(vartab.get(name)!=null)
		{
			LinkedList<var> list = vartab.get(name);
//			int path = zyylj.size();
//			int maxlen = 0;
//			for(int i = 0; i < list.size();i++)
//			{
//				int len = list.get(i).zyylj.size();
//				if(len<=path)
//				{
//					if(len>maxlen)
//					{
//						maxlen = len;
//						select = list.get(i);
//					}
//				}
//			}
			select = list.get(0);
		}
		if(select==null)
		{
	
		//	System.exit(0);
		}
		return select;
	}
	//��Ӻ���������֮��������
	void decFun(Fun fun)
	{
		if(funtab.get(fun.name)==null)//����������δ�д˺���
		{
			funtab.put(fun.name,fun);
		}
		else
		{
			System.out.println("����ͬ������ ");
			System.exit(0);
		}
			
	}
	//��Ӻ���������֮��������
	void defFun(Fun fun)
	{
		if(funtab.get(fun.name)==null)//����������δ�д˺���
		{
			funtab.put(fun.name,fun);
		}
		curfun=fun;
		
		//����������� δ���
		
	}
	void enddefFun()
	{
		//������������δ���
		curfun=null;
	}
	
	
	//����������ɶ�������Ĺ���
	void enter()//����ֲ�������
	{
		zyyID++;
		zyylj.add(zyyID);
		if(curfun!=null)
		curfun.enterZyy();
			
		//���뺯��
	}
    void leave()//�뿪
    {
    	zyylj.remove(zyylj.size()-1);
    	//δ��ɣ��뿪����
    	if(curfun!=null)
    	curfun.leaveZyy();
    	
    }
}
