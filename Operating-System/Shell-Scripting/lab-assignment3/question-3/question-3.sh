# Qs->Write a menu driven shell script for the following options:
#  (i) Number of presently active users
#  (ii) Displaying some desired number of lines from top of a file.
#  (iii) Updating the access time of a given file to current time.

# input-output
# Enter 1 to display number of presently active users
# Enter 2 to display  some desired number of lines from top of a file.
# Enter 3 to update the access time of a given file to current time.
# 1
#  16:38:32 up 3 days, 21:26,  0 users,  load average: 0.00, 0.00, 0.00
# USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT

# Enter 1 to display number of presently active users
# Enter 2 to display  some desired number of lines from top of a file.
# Enter 3 to update the access time of a given file to current time.
# 2
# Enter a file
# just-made1.txt
# Enter number of lines you want to display from top
# 2
# temporary file created to be used in question-3.sh

# Enter 1 to display number of presently active users
# Enter 2 to display  some desired number of lines from top of a file.
# Enter 3 to update the access time of a given file to current time.
# 3
# Enter a file
# just-made1.txt
# -rwxrwxrwx 1 akash-kinkar-pandey akash-kinkar-pandey 74 Aug 10 16:41 just-made1.txt

echo "Enter 1 to display number of presently active users"
echo "Enter 2 to display  some desired number of lines from top of a file."
echo "Enter 3 to update the access time of a given file to current time."

read choice

case $choice in
1) w;;
2)  echo "Enter a file"
    read file
    echo "Enter number of lines you want to display from top"
    read lines
    if [ -e $file ]
    then
    head -$lines $file
    else 
    echo "file does not exist"
    fi;;
3)  echo "Enter a file"
    read file
    if [ -e $file ]
    then
        touch $file
        ls -l $file
    else
        echo "File $file Not found"
    fi;;
*)  echo "Invalid Choice";;
esac