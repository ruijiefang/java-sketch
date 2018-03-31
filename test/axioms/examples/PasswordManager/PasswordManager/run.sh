pwd=`pwd`
cd ../../../../../

if [ "$1" == "1" ]
then
    shift
    ./jsk.sh $@ "${pwd}/noax/Cryptographer.java ${pwd}/noax/PasswordManager.java ${pwd}/noax/PasswordMap.java ${pwd}/noax/PasswordManagerTest.java model/ -o ${pwd}/../result_noax"

    # 
elif [ "$1" == "2" ]
then
    shift
    ./jsk.sh $@ "${pwd}/ax/PasswordManagerTest.java ${pwd}/ax/PasswordManager.java ${pwd}/ax/PasswordMap.java ${pwd}/ax/Cryptographer.java ${pwd}/../libs/ -o ${pwd}/../result_ax --no-lib"
elif [ "$1" == "3" ]
then
    shift
    ./jsk.sh $@ "${pwd}/noax/Cryptographer_syn.java ${pwd}/noax/PasswordManager_syn.java ${pwd}/noax/PasswordMap.java ${pwd}/noax/PasswordManagerTest.java model/ -o ${pwd}/../result_noax"
elif [ "$1" == "4" ]
then
    shift
    ./jsk.sh $@ "${pwd}/ax/PasswordManagerTest.java ${pwd}/ax/PasswordManager.java ${pwd}/ax/PasswordMap.java ${pwd}/ax/Cryptographer_syn.java ${pwd}/../libs/ -o ${pwd}/../result_ax --no-lib"
fi



