# Qs-Write a shell script that will display some desired number of lines starting from a specified line of a
# given file. User must interactively supply the file name, starting line number and number of lines to be
# displayed. 

# input-output
# Enter file name help.txt
# Enter starting line number 2
# Enter number of lines 4
# 2BBB25
# 3CCC24
# 4DDD23
# 5EEE22
echo -e "Enter file name \c"
read file
echo -e "Enter starting line number \c"
read line_number
echo -e "Enter number of lines \c"
read number_of_lines

if [ -e $file ] 
then
#--------------- way 1-----------------------
total_lines=$(wc --lines < $file) #finding total lines in a file
# total _lines=$(echo -n "$file" |wc --lines) # this syntax works too for counting lines 
from_which_line=$(($total_lines-$line_number+1))
tail -$from_which_line $file > help1.txt #storing last lines of files in another file
head -$number_of_lines help1.txt #extracting the first few lines from the help1 file
rm -f help1.txt #this file is not required
echo "------------"
#-----------------way 2--------------------
# tail +$line_number help.txt | head -$number_of_lines
else
echo "File not found"
fi