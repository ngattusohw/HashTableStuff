#ifndef _HASH_TABLE_
#define _HASH_TABLE_

typedef struct List{
	node* head;
	node* tail;
	int size;
}list;

typedef struct Node
{
	int val;
	struct Node* next;
}node;

typedef struct Bucket
{
	list* head;
}bucket;

typedef struct Table
{
	bucket* theBucket;
}table;


//list
void initialize_List(list** theList);
void list_pushFront(list* theList, int val);
void list_pushBack(list* theList, int val);
void list_insertAtIndex(list* theList, int val, int index);
int list_getSize(list* theList);
int list_isEmpty(list* theList);
void list_printVal(list* theList);

//bucket
void initialize_Bucket(bucket** theBucket);

//table





#endif

