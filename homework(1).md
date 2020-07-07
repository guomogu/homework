# homework
## Linux部分
1. > 完成Linux部分前五个任务时使用了什么命令？  
   
   1. ifconfig 
   2. yum -y install net-tools
   3. ping
   4. useradd
   5. shutdown
   6. ssh-keygen -r rsa
   7. cd 
   8. ls
   9. ssh
   10. rm -f
   11. touch
   12. chomod
   13. cat
   14. mv
   15. mkdir
   16. mount
   17. cp
   18. tar
   19. vim
   20. curl
   21. rpm
   22. reboot

2. > 这些命令都是用来做什么的？
   1. ifconfig   
      显示或设置网络设备。
   2. yum [选项] [命令] [包]  
      该命令提供了查找、安装、删除某人，多个甚至全部完全的命令。选项主要有-h(帮助)、-y(安装过程提示全部选择"yes")、-q(不显示安装过程)等，命令主要有update(更新)，install(安装),list(列出所有可安装软件清单)，remove(删除)，search(查找),clean(清除缓存)
   3. ping  
      网络诊断工具，测试目的站是否可达及了解其有关状态。
   4. useradd  
      添加新的用户账号。
   5. shutdown  
      关机指令
   6. ssh-keygen -r rsa  
      生成rsa密钥
   7. cd  
      进入目录
   8. ls  
      查看目录下文件
   9.  ssh  
      用于远程登录
   10. rm  
      用于删除文件
   11. touch  
      用于修改文件或者目录的时间属性，包括存取时间和更改时间。若文件不存在，系统会建立一个新的文件
   12. chomod  
      更改文件权限
   13. cat  
      用于连接文件并打印到标准输出设备上
   14. mv  
      用来为文件或目录改名、或将文件或目录移入其它位置
   15. mkdir  
      用于建立子目录
   16. cp  
      用于复制文件或者目录
   17. tar  
      用于建立、还原备份文件
   18. vim/vi  
       vi是老式的字处理器，不过功能已经很齐全了，但是还是有可以进步的地方。vim则可以说是程序开发者的一项很好用的工具。
   19. curl  
      利用URL规则在命令行下工作的文件传输工具，可以说是一款很强大的http命令行工具
   20. reboot  
      用于重新启动计算机。

3. > 从哪里能看到自己输入过什么命令？  
   
   命令行使用`history`能够在页面上查看之前自己输入过的命令，如果想要将命令输出输入`hietory > test.txt`输出历史输入的命令到test.txt文件中。  
   ___历史命令保存在每个用户的`.bash_history`文件中，保存该用户上次退出保留的命令，如果需要同步本次的缓存需要执行`history -w`写入，或者使用`history -c`命令清除。  
   执行命令中，`"!"+字符串`表示为搜索以该字符串开头的最近命令执行；`!!`执行上一条命令；`!n`执行第n条历史命令。___


4. > 为什么使用了公私钥可以免密登陆。公钥按键认证的流程是什么？  
   
   #### 公私钥认证流程  
   1. 客户端生成RSA公钥和私钥  
   2. 客户端将自己的公钥存放到服务器  
   3. 客户端请求连接服务器，服务器将一个 ___经过公钥加密后的___ 随机字符串发送给客户端  
   4. 客户端根据自己的私钥加密这个随机字符串之后再发送给服务器  
   5. 服务器接受到加密后的字符串之后用公钥解密，如果正确就让客户端登录，否则拒绝。这样就不用使用密码了。  
   
    #### 为何可以免密登陆
    因为在C/S模式中将密码登录的步骤换成了一个由服务器发出的随机数，使用私钥对随机数加密并用公钥解密进行认证过程，因此不需要使用密码进行登录了。
    
5. > 有哪些步骤不理解或者遇到了什么困难？  
   
    1. 对磁盘大小进行查询时，使用脚本以及命令行都会出现一个问题，在虚拟机本地使用能够读取到磁盘大小的信息，但是在xshell，主机cmd中对该命令进行执行的时候并不能得到相关信息。

6. > ssh_config文件有什么用，有什么配置项？  
   
   ssh_config指的是客户端系统配置文件，能够使用多个ssh私钥配置不同的git账号。  
   `Host \*`：只对能够匹配后面字串的计算机有效。\* 表示所有的计算机  
   `HostName `:主机地址  
   `User `:设置用户名  
   `IdentityFile 文件名`:指定读取的认证文件路径  
   `ForwardAgent no | yes`:设置连接是否经过验证代理（如果存在）转发给远程计算机  
   `ForwardX11 no | yes`:设置X11连接是否被自动重定向到安全的通道和显示集（DISPLAY set）  
   `RhostsAuthentication no | yes`:设置是否使用基于rhosts的安全验证  
   `RhostsRSAAuthentication no | yes`:设置是否使用用RSA算法的基于rhosts的安全验证  
   `RSAAuthentication yes | no`:设置是否使用RSA算法进行安全验证  
   `PasswordAuthentication yes | no`:设置是否使用口令验证  
   `FallBackToRsh no | yes`:设置如果用ssh连接出现错误是否自动使用rsh  
   `UseRsh no | yes`:设置是否在这台计算机上使用"rlogin/rsh"  
   `BatchMode no | yes`:如果设为 yes，passphrase/password（交互式输入口令）的提示将被禁止。当不能交互式输入口令的时候，这个选项对脚本文件和批处理任务十分有用  
   `CheckHostIP yes | no`:设置ssh是否查看连接到服务器的主机的IP地址以防止DNS欺骗。建议设置为 yes  
   `StrictHostKeyChecking no | yes`:如果设置成 yes，ssh就不会自动把计算机的密匙加入 $HOME/.ssh/known_hosts 文件，并且一旦计算机的密匙发生了变化，就拒绝连接  
   `IdentityFile ~/.ssh/identity`:设置从哪个文件读取用户的RSA安全验证标识  
   `Port 22`:设置连接到远程主机的端口  
   `Cipher blowfish`:设置加密用的密码  
   `EscapeChar ~`:设置escape字符

7. > 为何为不同的机器指定不同的私钥？  
   
   不同的机器如果使用同一私钥，那么在不同的机器之间也能够实现免密登录，会影响不同机器之前的安全性。

8. > 为何为某一网段的机器指定同一个私钥？  

   同一网段的机器属于存在于同一局域网之内，不存在相互间不能通信的问题，且同一网段设置一个私钥可以减少服务器的公钥存储数量。

## git部分
1.  > 了解gitignore文件，它有什么用？  
    
    .gitignore文件告诉git哪些文件不需要添加到版本管理中，它能决定本地哪些文件不会提交到github中，而仅在本地存在。  
    忽略的原则是：  
    1. 忽略操作系统自动生成的文件，比如缩略图等；  
    2. 忽略编译生成的中间文件、可执行文件等，也就是如果一个文件是通过另一个文件自动生成的，那自动生成的文件就没必要放进版本库，比如Java编译产生的.class文件；  
    3. 忽略你自己的带有敏感信息的配置文件，比如存放口令的配置文件。

2. > 使用了什么git命令？  
   1. git config --global user.name  "用户名"
   2. git config --global user.email "邮箱地址"  
   3. git clone 网址  
   4. git add .  
   5. git commit -m "说明"
   6. git push -u origin master
   7. git checkout dev
   8. git branch -a
   9. git pull
   10. git merge dev
   11. git log
   12. git tag -a v0.0.1
   13. git push origin --tags
   14. git rm --cached 文件名

3. > 这些命令的含义是什么？  
    1. git config --global user.name  "用户名"  
     设置用户名
    2. git config --global user.email "邮箱地址"  
     设置邮箱
   1. git clone 网址  
     将github上仓库克隆至本地
   2. git add .   
     将当前目录所有文件提交本地git仓库。
   3. git commit -m "说明"  
     提交版本信息到本地git仓库
   4. git push -u origin master  
     上传代码到github远程仓库
   5. git checkout dev  
     切换分支
   6. git branch -a  
     查看远程分支
   7. git pull  
     拉取当前分支的最新代码
   8.  git merge dev  
     合并dev分支到当前分支
   9.  git log  
     查看历史提交记录
   10. git tag -a v0.0.1  
     创建附注标签
   11. git push origin --tags  
     将标签上传至远程仓库
   12. git rm --cached 文件名  
     删除远程文件