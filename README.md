# 任务列表

**注： 请注意以下所有在 linux 上进行的操作，都使用命令行进行，不要使用图形界面**

## Linux 部分

1. 使用虚拟机软件在自己电脑安装 CentOS 7 （参考 [https://zhuanlan.zhihu.com/p/60408219](https://zhuanlan.zhihu.com/p/60408219)）
2. 给虚拟机配置静态 ip，让虚拟机可以和自己电脑互相 ping 通，并可以 ping 通 baidu.com (参考 [https://blog.csdn.net/wyh9459/article/details/53559993](https://blog.csdn.net/wyh9459/article/details/53559993))
3. 在自己电脑通过 ssh 命令（注意是 cmd 或 powershell 中的 ssh 命令），以 root 身份和密码登录到虚拟机
4. 在虚拟机创建一个普通用户，用户名 user
5. 使用 ssh-keygen 创建一对 rsa 加密的密钥
6. 使用第五步创建的公私钥，配置从自己电脑到虚拟机使用 user 用户免密码登录，请注意同样是使用 ssh 命令
7. 以上六个小任务，请你总结一下，你使用了什么命令？这些命令都是用来做什么的？从哪里能看到自己输入过什么命令？为什么使用了公私钥就能免密登录，公私钥认证的底层流程是什么？有哪些步骤不理解或者遇到了什么困难？
8. 了解一下 ssh_config 文件，这个文件有什么用，它有哪些配置项？如何为不同的机器指定不同的私钥？如何为某个网段的机器指定同一个私钥？
9. 给虚拟机配置为 aliyun 的软件源 （参考 [https://developer.aliyun.com/mirror/](https://developer.aliyun.com/mirror/)）
10. 给虚拟机安装 lshw 命令
11. 编写一个 shell 脚本，运行之后可以列出 cpu 型号、内存大小、硬盘大小
12. 将 shell 脚本使用 python 和 java 重写，实现同样的功能

## git 部分

1. 在 github 注册账号
2. 在 github 添加之前创建的公钥
3. 在自己电脑安装 git
4. 在 github fork [https://github.com/anyUesr/homework](https://github.com/anyUesr/homework) 项目到自己账户下，并使用 ssh 方式 clone 自己账户下的项目到本地
5. 在 git 项目中创建 dev 分支
6. 了解一下 gitignore 文件，它有什么用？
7. 将之前编写的代码分别放到 git 项目中 dev 分支的 src/shell、src/python、src/java 文件夹，并提交到 github
8. 将 dev 分支合并到 master 分支，将 master 分支进行提交
9. 给 git 项目添加一个 tag，tag 名称为 "v0.0.1"，推送到 github
10. 上述任务中，你使用了哪些 git 命令？这些命令的含义是什么？

## 文档部分

1. 学习一下 markdown 语法，可参考 [https://juejin.im/post/5ad6e09e518825557b4d451c](https://juejin.im/post/5ad6e09e518825557b4d451c)，建议使用 vscode + Markdown All in One
 插件
2. 在 git 项目 dev 分支中添加 homework.md 文件，文件中对上述以问号结尾的问题进行解答，要求使用上 markdown 语法，对问题使用引用格式后，再编写答案，如下所示

    1. > 你使用了什么命令？
   
        我使用了 xxxx 命令
    
    2. > 这些命令都是用来做什么的?

        1. xxxx 命令的作用是 xxxxx
        2. xxxx 命令的作用是 xxxxx

3. 完成后将变更提交，并 merge 到 master 分支，推送到 github，提醒我查收，如果过程中遇到问题，不要钻牛角尖，及时问我。