#!/bin/bash
Line='==========='
#cpu型号
CPU=$(grep 'model name' /proc/cpuinfo |uniq |awk -F : '{print $2}' |sed 's/^[ \t]*//g' |sed 's/ \+/ /g')
echo -e "CPU model:\n${CPU}\n${Line}"
#Memtotal 内存总大小
Total=$(cat /proc/meminfo |grep 'MemTotal' |awk -F : '{print $2}' |sed 's/^[ \t]*//g')
echo -e "Total Memory:\n${Total}\n${Line}"
#显示硬盘，以及大小
Disk=$(fdisk -l |grep 'Disk' |awk -F , '{print $1}' | sed 's/Disk identifier.*//g' | sed '/^$/d')
echo -e "Amount Of Disks:\n${Disk}\n${Line}"