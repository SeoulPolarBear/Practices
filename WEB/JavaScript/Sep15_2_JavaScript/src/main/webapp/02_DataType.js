/**
 * 
 */
//2. �ڷ���
//String
 
let name1 = "polarbear";
let name2 = 'polarbear';
let name3 = `polarbear`;// backtick�̶�� �Ѵ�.

let message1 = "I'm a boy.";
let message2 = 'I\'m a boy.';// ���� ����ǥ�� ���� \ �������ø� ������
							// '�� Ư�����ڷ� �ν���
							
//���ڿ� ���ο� ������ ǥ���� �� ����ϸ� ���� backtick !!
//	${������}�� �־ ǥ���� (backtick���� �ۿ� ����� �� ����.)
let message3 = `My name is ${name1}`;
let message4 = "My name is ${name1}";
document.write(message3 + `<br>`);
//${name1�� �״�� ���� ��}
document.write(message4 + '<br>');

//��� (ǥ����)�� ��밡�� O
document.write(`9 + 10 = ${9 + 10}<br>`);


//������ Number (���� / �Ǽ�)
let age = 100;
let height = 187.3;

//���ó� ��Ģ������ ���� O
document.write(1 + 2 + "<br>");
document.write(1 - 2 + "<br>");
document.write(1 * 2 + "<br>");
document.write(1 / 2 + "<br>");
document.write(1 % 2 + "<br>");

let a = 1 / 0;
document.write(a + "<br>");
// ��� : Infinity


let b = name1 / 2;
document.write(b + "<br>");
// ��� : NaN(Not a Number)

//���ڳ��� �̾��ֱ⵵ ���� O
let aa = "����" ;
let bb = "�Դϴ�.";

document.write(aa + name1 + bb + "<br>");
document.write(aa + name1 + "��" + bb + "<br>");

// ������ Boolean
let c = true;	//��
let d = false;	//����

document.write((name1 == "polarbear") + "<br>");
document.write((age < 20) + "<br>");

//null, undefined
let e;
let f =null;
document.write(e + "<br>");// undefined : ���� �״���� ���� ����
document.write(f + "<br>");// null : �������� �ʴ� ��

//typeof ������ : ������ �ڷ����� �˾Ƴ� �� ���
//���� �ڵ带 ®���� �翬�� �� �����ڴ� ���� X
//�ٸ� �����ڰ� �ڵ带 ®�� ��, ������ ���� ������Ÿ��(�ڷ���)��
//�˾ƾ� �� ��
// or API�� ���ؼ� �޾ƿ� �������� �ڷ����� �˾Ƴ��� �ٸ� �������
//ó���ؾ� �� �� ���� ���

document.write(typeof name1 + "<br>");
document.write(typeof age + "<br>");
document.write(typeof c + "<br>");
document.write(typeof e + "<br>");
document.write(typeof f + "<br>");// ��� : Object ���� ����















