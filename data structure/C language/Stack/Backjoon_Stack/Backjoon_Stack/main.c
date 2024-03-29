#include<stdio.h>
#include<stdlib.h>
#define INS 8

typedef int element;
typedef struct Node {
    element data;
    struct Node* next;
} Node;

typedef struct Stack {
    Node* top;
    int size;
    Node* first;
} Stack;

void init_stack(Stack* Q) {
    Q->top = NULL;
    Q->first = NULL;
    Q->size = 0;
}

int EMPTY(Stack* Q) {
    if (Q->size == 0) return 1;
    else return 0;
}

void PUSH(Stack* Q, element Data) {
    Node* new_node = (Node*)malloc(sizeof(Node));
    new_node->data = Data;
    new_node->next = NULL;
    if (EMPTY(Q)) {
        Q->top = new_node;
        Q->first = new_node;
    }
    else {
        Q->top->next = new_node;
        Q->top = Q->top->next;
    }
    Q->size++;
}
element POP(Stack* Q) {
    element pop;

    if (Q->size == 0) pop = -1;
    else {
        Node* temp = (Node*)malloc(sizeof(Node));
        pop = Q->top->data;
        temp = Q->first;
        while (temp->next == Q->top) {
            temp = temp->next;
        }
        free(Q->top);
        Q->top = temp;
        temp = NULL;
        free(temp);
        Q->size--;
    }
    return pop;
}
int SIZE(Stack* Q) {
    return Q->size;
}

element TOP(Stack* Q) {
    element Back;
    if (EMPTY(Q)) Back = -1;
    else Back = Q->top->data;
    return Back;
}

int main() {
    element num;//ins 명령어 num 정수 X, NUM 명령어 개수
    int NUM;
    char ins[6];
    Stack q;
    init_stack(&q);

    scanf("%d\n", &NUM);

    while (NUM--) {
        scanf("%s", ins);
        if (!strcmp(ins, "push")) {
            scanf("%d", &num);
            PUSH(&q, num);
        }
        else if (!strcmp(ins, "pop"))  printf("%d\n", POP(&q));

        else if (!strcmp(ins, "size"))printf("%d\n", SIZE(&q));

        else if (!strcmp(ins, "empty"))printf("%d\n", EMPTY(&q));

        else if (!strcmp(ins, "top")) printf("%d\n", TOP(&q));

    }
return 0;
}