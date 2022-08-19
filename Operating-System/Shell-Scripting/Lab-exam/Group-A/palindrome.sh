echo -e "Enter a number \c"
read n
len=${#n}
i=1
flag=0
while [ $i -lt $len ]
do
    c1=`echo -n "$n" | cut -c $i`
    c2=`echo -n "$n" | cut -c $len`
    if [ $c1 != $c2 ]; 
    then
        flag=1
        break
    fi
    i=$((i+1))
    len=$((len-1))
done
if [ $flag -eq 0 ];
then
    echo "$n is palindrome"
else 
    echo "$n is not palindrome"
fi

