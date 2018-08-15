<span id"top"></span>

[TOC]

# Day_05--数组

## lesson 1 -- 一个字符串数组操作实例

### 需求：将数组{34,12,67}中的元素转成字符串“[34,12,67]”

	明确1：结果？char
	明确2：参数？数组  

### 思路：
    1.将数从数组中读出来  
    2.用连字符将读出的数加起来：字符串与任何数据相加都是相连接”5+5=“+5+5  
    
### 步骤：
    1.定义字符串变量  
    2.定义循环遍历数组，将每个数组元素与字符串相连接  
    3.将连接后的字符串返回  

### 代码实现
	public static void main(String[] args)
	    {
	        int[] arr = {34,12,67,90};
	        String str = toString(arr);
	        System.out.println(str);
	    }


    public static String toString(int[] arr)//注意这里返回值类型使用的是String，而不是char
    {
        //1.定义字符串变量
        String temp = "[";
        //2.定义循环遍历数组，将每个数组元素与字符串相连接
        for(int x=0 ; x<arr.length ; x++)
        {
            //判断是否是最后一个元素，不是的话加","，是的话不加
            if(x!=(arr.length - 1))
                temp = temp + arr[x] + ",";
            else
            temp = temp + arr[x] + "]";
        }
        //3.将连接后的字符串返回
        return temp;
    }

[back](#top)
***

## lesson 2 -- 一个字符串数组操作实例

### 数组使用的核心思想  
* 容器特点：  
	1.固定长度  
	2.元素都有索引  

* 什么时候使用容器？  
	1.数据多了，必须先存储，然后再操作


* 什么时候使用数组容器?
	1. 数据多
	2. **个数确定**
	3. 有对应关系--数据特征（分析需求时，使用数组的条件）
		1. 需求数据本身之间是否存在对应的有序编号？星期一~星期日。
		2. 需求数据之间是否需要有序编号？  
		不是有序编号不能用数组。

***

#### 例1
>一组数：34 89 12 78 45，对其进行操作（本身没有编号，数据间也没有规律，但是有编号操作起来更方便，因此**需要编号**）


#### 例2
>根据用户输入的数据，显示对应的星期  

**思路：**  
1. 星期有多个，而且个数固定  
2. 星期有对应的有序编号，该编号可以作为索引。如：角标1 - Monday，不用if和switch那么笨了  
**因此，可以使用数组（多学思维，少在意代码）**  

* **注：函数中的以下两条语句**：
	* `return num+"没有对应的星期";` -- 结束当前函数/功能
	* `throw new RuntimeException(num+"没有对应的星期");` -- 结束整个程序（后期开发用这个多）

* **查表法：数据间存在对应关系，通过关系的一方查询另一方（将对应关系都存起来）。**
	* 日后需要将这种对应关系都存起来
	* **有对应关系**就可以用查表法，**但查询一方不是有序编号**，使用另一个容器**`map`**，使用频率很高
```
    public static void main(String[] args)
    {
        System.out.println(getWeek(6));
    }

    public static String getWeek(int num)
    {
        if(num>7 || num<1)
            //以下两条语句任选其一
            return num+"没有对应的星期";
            //throw new RuntimeException(num+"没有对应的星期");
            
        //1.定义一个数组，存储固定星期数，“”这个思想很重要，正常人输入1-7，输入0返回空，还往后顺延了一个位置
        String[] weeks = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //上面称之为表：存储了对应关系的表。
        
        return weeks[num];
        //以上操作为：根据指定索引查表（类似于ASCII）
    }
```  


[back](#top)
