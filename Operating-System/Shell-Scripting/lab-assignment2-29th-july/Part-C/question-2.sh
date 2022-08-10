# Qs->Write a shell script to check for an Armstrong number.
# input-output
# ./question-2.sh
# Enter a number 153
# Number 153 is armstrong
echo -e "Enter a number \c"
read n
t=$n
s=0
while (( n>0 ))
do
    d=$(( n%10 ))
    d=$(( d*d*d ))
    s=$(($s+$d))
    n=$(( n/10 ))
done

if (( s==t ))
then
    echo "Number $t is armstrong"
else 
    echo "Number $t is not armstrong"
fi
