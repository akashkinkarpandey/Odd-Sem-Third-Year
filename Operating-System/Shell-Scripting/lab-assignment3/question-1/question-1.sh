# Qs-> Write a menu driven shell script for the following options:
#  (i) Merging the contents of two files into another.
#  (ii) Searching a pattern from a file.
#  If the user gives some invalid choice, it will prompt “Invalid option” message.

# input-output
#  ./question-1.sh
# Enter 1 to merge contents of 2 files
# Enter 2 to search pattern from file
# 1
# Enter 1st filename hello.txt
# Enter 2nd filename hi.txt
# hello was here  hi was here

# Enter 1 to merge contents of 2 files
# Enter 2 to search pattern from file
# 2
# Enter a pattern to be searched program
# Enter a file to be searched file-to-be-searched-in.py
# Pattern program found at line numbers 3:#in this program

# Enter 1 to merge contents of 2 files
# Enter 2 to search pattern from file
# 2
# Enter a pattern to be searched universe
# Enter a file to be searched file-to-be-searched-in.py
# Pattern universe not found in file file-to-be-searched-in.py
echo "Enter 1 to merge contents of 2 files"
echo "Enter 2 to search pattern from file"
read choice

case $choice in
    1)  echo -e "Enter 1st filename \c"
        read a
        echo -e "Enter 2nd filename \c"
        read b
        if [ -e $a ] #checking if file a exists
        then
            if [ -e $b ] #checking if file b exists
            then
            paste $a $b | tee c.txt
            # we can use cat instead of paste here also
            # file c.txt will be over written if already present
            # if c.txt was absent it will be created and contents of a,b put into it
            # tee displays output on screen as well as puts the output inside c.txt
            fi
        else
            echo "all files do not exist"
        fi;;
    2)  echo -e "Enter a pattern to be searched \c"
        read pattern
        echo -e "Enter a file to be searched \c"
        read file
        if [ -e $file ]
        then
            grep -n $pattern $file >> store-output.txt #-n flag also gives the line number along with the line
            if [ -s store-output.txt ] #-s flag checks if file is not empty
            then
                echo -e "Pattern $pattern found at line numbers \c"
                cat store-output.txt
            else #if store-output.txt is empty ,it means pattern is not found, then else block is entered
                echo "Pattern $pattern not found in file $file"
            fi
            rm -f store-output.txt #deleting store-output.txt ,as it has no use
        else
            echo "File not found"
        fi;;
    *) echo "Wrong choice";;
esac


