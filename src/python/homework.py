from subprocess import Popen, PIPE
 
 
def run_cmd(cmd):
    # Popen call wrapper.return (code, stdout, stderr)
    child = Popen(cmd, stdin=PIPE, stdout=PIPE, stderr=PIPE, shell=True)
    out, err = child.communicate()
    ret = child.wait()
    return (ret, out, err)
 
if __name__ == '__main__':
    CPU=run_cmd("cat /proc/cpuinfo | grep name | cut -f2 -d: |uniq -c")
    print("CPU model:")
    print(CPU[1].decode("gbk"))
    Memory=run_cmd("cat /proc/meminfo | grep MemTotal")
    print(Memory[1].decode("gbk"))
    Disk=run_cmd("fdisk -l | grep Disk")
    print("disk:")
    print(Disk[1].decode("gbk"))
