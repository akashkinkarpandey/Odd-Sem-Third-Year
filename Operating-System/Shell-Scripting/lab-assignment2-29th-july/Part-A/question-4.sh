# Qs -> Check whether a number is odd or even
# input-output
# Enter a number -2
# -2 is even
# Enter a number -1
# -1 is odd
# Enter a number 1
# 1 is odd
# Enter a number 2
# 2 is even
echo -e "Enter a number \c"
read n
flag=0
if (( n<0 ))
then
    n=$((-n))
    flag=1
fi

if (( n%2 ==1 ))
then
    if (( flag==0 ))
    then
    echo "$n is odd"
    else
    echo "-$n is odd"
    fi
else
    if(( flag ==0 ))
    then
    echo "$n is even"
    else
    echo "-$n is even"
    fi
fi