/**
 * 
 */
 
 //1. �迭
 // ������ �ִ� ����Ʈ
let students = ["������","�����", "�����"];
console.log(students[1]);//�ε����� 0���� ���� !!!

//�迭�� ���ڻӸ� �ƴ϶�, ����, ��ü, �Լ�, ... ������ �� ����
let arr = [
	"���",
	3,
	false,
	{
		name:"����",
		age: 7,
	},
	function(){
		console.log("TEST");
	},	
]
console.log(arr);

// length : �迭�� ����
console.log(students.length);

let days = ["��", "ȭ", "��"];
console.log(days);

//push() : �迭 ���� �߰�(������ ����)
days.push("��");
console.log(days);

//pop() : �迭 ���� ��� ����
days.pop();
console.log(days);

//shift(), unshift() : �迭�� ���� �տ� �ִ� ��� ���� / �߰�
days.unshift("��");
console.log(days);
//unshift()�� ������ ��ҵ��� �߰��� �� ����!
days.unshift("��","��","��");


days.shift();
console.log(days);

//�迭�� ���� ���� ū ���� �� �ϳ��� => �ݺ����� ����ϱ� ���ؼ�...
for(let i = 0; i < days.length; i++){
	console.log(days[i]);
}

//for..of (Java�� for-each)
for(let day of days){
	console.log(day);
}

//for ...in // ��ü ��ȯ
//for ...of // �迭 �� ��ȯ























