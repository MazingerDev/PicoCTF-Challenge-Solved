#!/bin/bash

dir=${PWD##*/}

Help()
{
    echo "command :"
    echo 
    echo "-d      to mark folder as done"
    echo "-u      to mark folder as unsolve"
    echo

}



while true; do 
    case $1 in 
        -d) 
            cd ..
            mv $dir ${dir}_DONE
            git add ${dir}_DONE
            git commit -m "$dir"
            break
            ;;
        
        -u) 
            cd ..
            mv $dir ${dir}_UNSOLVE
            git add ${dir}_UNSOLVE
            git commit -m "$dir"
            break
            ;;
        -h|*)
            Help
            break
    esac
done

        