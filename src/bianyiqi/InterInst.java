package bianyiqi;
//���м��������ݽṹ����
public class InterInst {

	String label;
	Operator op;
	var result;
	var arg1;
	var arg2;
	Fun fun;
	InterInst target;
	
	InterInst(Operator opt,var lval,var rval)//˫Ŀ������м����
	{
		op =opt;
		arg1 = lval;
		arg2 = rval;
	}
	
	InterInst(Operator opt,var val)//��Ŀ������м����
	{
		op = opt;
		arg1 = val;
		arg2 = null;
	}
	String print()
	{
		String s = "";
		s+=op.toString();
		//System.out.println("��������"+op.toString());
		s+=',';
		if(arg1!=null)
		{
			if(arg1.iscl==false)
			s+=arg1.name;
			//System.out.println("��ֵ��"+arg1.toString());
			else
				s+=arg1.initval;
			s+=' ';
		}
		if(arg2!=null)
		{
			if(arg2.iscl==false)
				s+=arg2.name;
				//System.out.println("��ֵ��"+arg1.toString());
				else
					s+=arg2.initval;
		//	System.out.println("��ֵ��"+arg2.toString());
			s+=' ';
		}
		return s;
	}
}
