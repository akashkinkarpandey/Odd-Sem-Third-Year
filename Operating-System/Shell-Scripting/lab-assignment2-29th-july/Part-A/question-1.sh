# Qs-> Read a file from command line. Check whether it exists. If it does not create it. Print the
# permissions associated with the file.

# input-output
# ./question-1.sh (type this in your shell)
# Enter filename hello.txt
# hello.txt not found
# hello.txt was created
# Permissions of file hello.txt are:-
# -rwxrwxrwx 1 akash-kinkar-pandey akash-kinkar-pandey 0 Aug 10 09:28 file

# ./question-1.sh
# Enter filename hello.txt
# File Found
echo -e "Enter filename \c"
read file
if [ -e $file ]
then
    echo "File Found"
else
    echo "$file not found"
    touch $file
    echo "$file was created"
    echo "Permissions of file $file are:-"
    ls -l $file
fi


