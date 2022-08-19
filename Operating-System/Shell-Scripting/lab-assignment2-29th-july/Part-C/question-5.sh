# Qs-> Write shell script to generate non fibonacci series upto ‘n’.
# input-output
# Enter value of n for non-Fibo Series
# 5
# Non Fibo Series for 5 numbers:-
# 4 6 7 9 10
echo -e "Enter value of n for non-Fibo Series"
read n
a=2
b=3
infinite=1000
echo "Non Fibo Series for $n numbers:-"
while [ $infinite -gt 0 ]
do
 i=$((a+1))
#  i=`expr $a+1`
 j=$((b-1))
 flag=0
#  while ((i<=j))
 while [ $i -le $j ] 
 do
  n=$((n-1))
  echo -e "$i \c"
#   if (( $n==0 ))
  if [ $n -eq 0 ];
  then 
   flag=1
   break
  fi
  i=$((i+1))
 done
 if [ $flag -eq 1 ];
 then
  break
 fi
 c=`expr $a+$b`
 a=$b
 b=$c
done
echo # prints extra line 

# corresponding C++ program
# #include<iostream>
# using namespace std;
# int main()
# {
# int n;
# cin>>n;
# int a=2;int b=3;
# while(1)
# {
#     for(int i=a+1;i<=b-1;i++)
#     {
#         n--;
#         cout<<i<<" ";
#         if(n==0)
#         {
#             return 0;
#         }
#     }
#     int c=a+b;
#     a=b;
#     b=c;
# }
# }
