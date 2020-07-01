# markdown编写代码学习
## 1、markdown标题
这是一级标题
==========
这是二级标题
----------

## 2、markdown段落格式
段落没有特殊格式，段落换行使用的是两个以上空格➕回车  
这样才能开始下一个段落
指回车会出现一个空格

或者使用空行进行下一个段落
## 3、markdown字体
使用星号以及下划线进行字体的设置  
*我是斜体*  
_me too_  
**我是粗体**  
__me too__  
***我是斜体加粗***  
___hello world___

## 4、分割线
三个以上星号、减号  
***
---
___

## 5、删除线
在文字两端加波浪线  
~~hello world~~

## 6、下划线
<u>hello</u>

## 7、脚注
创建相关脚注 [^hello]  
[^hello]: hello world
> ***此处脚注设置未成功原因？***

## 8、列表
### 无序列表
使用星号加号减号➕空格作为标记
* 第一项
+ 第二项
- 第三项

### 有序列表
1. 第一项   
2. 第二项

### 列表嵌套
在子列表前添加四个空格
1. 第一项
    - 一中一

## 9、区块
区块引用使用>➕空格
> hello world
> > 嵌套  

区块中可以嵌套列表，列表中也可以嵌套区块。

## 10、代码
段落中的一个函数或者片段的代码使用反引号  
`printf()` 函数  
代码区块使用4个空格或者一个制表符，或者三个反引号（并指定语言）  
``` 
#CPU
total_physical_CPU_num=$(cat /proc/cpuinfo|grep "physical id"|sort|uniq|wc -l)
cpu_bit=$(getconf LONG_BIT)
core_num_per_physical=$(cat /proc/cpuinfo|grep "core id"|sort|uniq|wc -l)
total_core_num=$(($core_num_per_physical*$total_physical_CPU_num))
total_processor_num=$(cat /proc/cpuinfo|grep "processor"|wc -l)
CPU_name=$(cat /proc/cpuinfo|grep "model name"|uniq|sed 's/^.*://g')
echo "****CPU****"
echo "CPU_Name: $CPU_name"
echo "Total_physical_CPU: $total_physical_CPU_num"
echo "Total_core_num: $total_core_num"
echo "Total_Processor_num: $total_processor_num"
echo "CPU_BIT: $cpu_bit"  
```  

## 11、链接
链接使用名字方括号➕圆括号链接，或者使用尖括号链接。
[百度](www.baidu.com)  
<www.baidu.com>  
> ***此处为何方括号未消失？***  

### 高级链接
这个链接用 1 作为网址变量 [百度][1]  
这个链接用 baidu 作为网址变量 [baidu][baidu]  
然后在文档的结尾为变量赋值（网址）

  [1]: www.baidu.com
  [baidu]: www.baidu.com

## 12、图片
开头一个感叹号 !  
接着一个方括号，里面放上图片的替代文字  
接着一个普通括号，里面放上图片的网址，最后还可以用引号包住并加上选择性的 'title' 属性的文字。  
![多啦A梦 图标](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593611103742&di=cf760b6edd2df15eb7d1b9b164162180&imgtype=0&src=http%3A%2F%2Fimg1.imgtn.bdimg.com%2Fit%2Fu%3D1316020891%2C1362522323%26fm%3D214%26gp%3D0.jpg)  

markdown无法设置图片的高度与宽度，可以使用<img>标签。  
<img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593611103742&di=cf760b6edd2df15eb7d1b9b164162180&imgtype=0&src=http%3A%2F%2Fimg1.imgtn.bdimg.com%2Fit%2Fu%3D1316020891%2C1362522323%26fm%3D214%26gp%3D0.jpg" width="50%">

## 13、表格
使用｜分隔单元格，使用减号来分隔表头和其他行。
|  表头   | 表头  |
|  ----  | ----  |
| 单元格  | 单元格 |
| 单元格  | 单元格 |
### 对齐方式
| 左对齐 | 右对齐 | 居中对齐 |
| :-----| ----: | :----: |
| 单元格 | 单元格 | 单元格 |
| 单元格 | 单元格 | 单元格 |