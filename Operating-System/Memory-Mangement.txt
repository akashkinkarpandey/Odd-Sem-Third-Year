#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
#include<math.h>
int mini=INT_MAX;
struct node
{
    char id;//id of process or hole,for hole id is 'Z'
    int sa;//starting address
    int size;//side of process
    struct node* next;//next pointer
};

void traversal(struct node *ptr)
{
    while(ptr!=NULL)
    {
        printf("%c|%d|%d",ptr->id,ptr->sa,ptr->size);
        if(ptr->next!=NULL) printf("-->");
        ptr=ptr->next;
    }
}

void showmenu()
{
    printf("\nChoose the placement algorithm:\n");
    printf("1.First Fit\n2.Best Fit\n3.Worst fit\n");
}

void firstfit(int sz,char idd,struct node* p)
{
    struct node* ptr=p;int flag=1;
    while(ptr!=NULL)
    {
       if(ptr->id=='Z' && ptr->size >= sz)
       {
           ptr->id=idd;
           ptr->size-=sz;
           flag=0;
           break;
       }
       else ptr=ptr->next;
       
    }
    if(flag) printf("\nprocess cannot be accomodated!!");
    
    else traversal(p);
}

void bestfit(int sz,char idd,struct node* p)
    {
    int minDiff = INT_MAX;
	struct node *ptr=p,*place;
	while(ptr!=NULL){
		if(ptr->id=='Z'){
			int diff= ptr->size - sz;
		
			if(diff<minDiff){
				minDiff = diff;	
				place = ptr;
			}
		}
		ptr = ptr->next;
	}
	if(minDiff<0){ printf("Process Can't allocated! [size exceded]\n"); return;}
	place->id=idd;
	place->size-=sz;
	printf("\nThe config remains as:");
	traversal(p);
    }

void worstfit(int sz,char idd,struct node* p)
    {
	int Diff = INT_MIN;
	struct node *place;
	struct node *ptr=p;
	while(ptr!=NULL){
		if(ptr->id=='Z'){
			int diff= ptr->size - sz;
			
			if(diff>Diff){
				Diff = diff;	
				place = ptr;
			}
		}
		ptr = ptr->next;
	}
	if(Diff<0){ printf("Process Can't allocated! [size exceded]\n"); return;}
	place->id=idd;
	place->size-=sz;
	printf("\nThe config remains as:");
	traversal(p);
    }
int main()
{
   int ch,sz;char idd; char cho='y';
   struct node* h=NULL,*n1=NULL,*n2=NULL,*n3=NULL,*n4=NULL,*n5=NULL;
   h= (struct node*)malloc(sizeof(struct node));
   n1= (struct node*)malloc(sizeof(struct node));
   n2= (struct node*)malloc(sizeof(struct node));
   n3= (struct node*)malloc(sizeof(struct node));
   n4= (struct node*)malloc(sizeof(struct node));
   n5= (struct node*)malloc(sizeof(struct node));

   h->id='A'; h->sa=0; h->size=4; h->next=n1;
   n1->id='B'; n1->sa=4; n1->size=5; n1->next=n2;
   n2->id='C'; n2->sa=9; n2->size=2; n2->next=n3;
   n3->id='Z'; n3->sa=11; n3->size=5; n3->next=n4;
   n4->id='E'; n4->sa=16; n4->size=3; n4->next=n5;
   n5->id='Z'; n5->sa=19; n5->size=9; n5->next=NULL;

   printf("The Initial Memory allocation chart:");
   
   traversal(h);

   showmenu();

 do{
   printf("Enter your choice:");
   scanf("%d",&ch);
   
   switch(ch)
   {
    case 1:
	       printf("Enter the process size and id:");
           scanf("%d %c",&sz,&idd);
           firstfit(sz,idd,h); break;
    
    case 2:
	       printf("Enter the process size and id:");
           scanf("%d %c",&sz,&idd);
           bestfit(sz,idd,h); break;
    
    case 3:
	       printf("Enter the process size and id:");
           scanf("%d %c",&sz,&idd);
           worstfit(sz,idd,h); break;
           
    default:printf("Wrong option chosen!!");
    		break;
   }
  
   printf("\nDo you want to continue: if yes press y else n: ");
   scanf("%s",&cho);
 }while(cho=='y' || cho=='Y');
  return 0;
}
