package bianyiqi;
//�м�����е������
public enum Operator {

	OP_NOP,  // ��ָ��
	OP_DEC,   //����
	OP_ENTRY,OP_EXIT,//���������
	OP_AS,//��ֵ
	OP_ADD,OP_SUB,OP_MUL,OP_DIV,OP_MOD,//��������
	OP_NEG,//ȡ��
	OP_GT,OP_GE,OP_LT,OP_LE,OP_EQU,OP_NE,//��ϵ����
	OP_NOT,//��
	OP_AND,OP_OR,//���
	OP_INC,OP_DE,
	OP_LEA,//ȡַ
	OP_SET,OP_GET,//���õ�  ָ������
	OP_JMP,//������ת
	OP_JT,OP_JF,OP_JNE,//��������
	OP_CALL,//ֱ�ӷ���
	OP_RET,OP_RETV,//�з���ֵ�ķ���
	OP_PRINTF
}
