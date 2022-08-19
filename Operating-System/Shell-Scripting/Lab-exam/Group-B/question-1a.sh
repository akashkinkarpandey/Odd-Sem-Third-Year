# Question
# Find the occurence of every character of string take as input in a file take as input
echo -e "Enter string \c"
read string
echo -e "Enter file \c"
read file
len=${#string}
if [ -e $file ];
    then
    i=1
    while [ $i -le $len ];
    do
        char=`echo -n "$string" | cut -c $i`
        echo -e "$char found \c"
        grep -o "$char" $file | wc -l | tr -d '\n'
        echo " times"
        i=$((i+1))
    done
else
    echo "File Not Found"
fi

# input-output
# Enter string WORLD
# Enter file use-it.txt
# W found 1 times
# O found 2 times
# R found 1 times
# L found 3 times
# D found 1 times
