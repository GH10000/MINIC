package bianyiqi;
//�ַ��ͳ���
public class STR extends Token{
	STR(String s)
	{
		inline = cffxq.line;
		this.tag = Tag.STR;
		this.s = s;
	}
	public String output ()
	{
		return s;
	}
}
