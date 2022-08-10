# Write shell script to generate fibonacci series upto ‘n’.
# Enter number of fibonacci numbers you want to print 10
# 1: 0
# 2: 1
# 3: 1
# 4: 2
# 5: 3
# 6: 5
# 7: 8
# 8: 13
# 9: 21
# 10: 34
a=0
b=1
c=1
echo -e "Enter number of fibonacci numbers you want to print \c"
read n
for((i=1;i<=n;i++))
do
echo "$i: $a"
c=$((a+b))
a=$b
b=$c
done
