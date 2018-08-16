## TWatchLeasedLineService接口目录

[1.添加专线信息](##1.添加专线信息)        
[2.获取全部专线信息](##2.获取全部专线信息)       
[3.通过专线ID获取到专线的信息](##3.根据交换机ID获取到交换机的信息)       
[4.通过专线ID更新专线信息](##4.通过专线ID更新专线表的信息)       
[5.通过专线ID或者交换机ID删除专线信息（专线ID优先，并且删除企业专线表里相应的信息）](##5.通过专线ID或者交换机ID删除专线信息（专线ID优先）)       
[6.通过专线ID的set集合查询出所有符合条件的专线信息](##通过专线ID的set集合查询出所有符合条件的专线信息)
## 1.添加专线信息
> 接口方法：ApiResult &lt; TWatchLeasedLine &gt;  &nbsp; createLeasedLine(TWatchLeasedLine &nbsp;tWatchLeasedLine)
* 输入参数字段：    

| 字段            |可选      |描述          |
| -------------  |------|-------|
|deviceId|必选|交换机id|
|name|可选|名称|
|port|可选|端口|
|targetIp|可选|目标ip|
|comment|可选|备注|


* 返回

| 参数     |说明          |
| --------|--------------|
|result       |0 成功, -1 失败 |
|description  | result文本描述 |
|errorCode     | 错误码，为0，此处不起作用|
|data|        返回数据，此方法为添加成功的专线信息|

*返回值文本描述

|返回状态      |description文本描述   |
|--------|-------------|
|成功|        成功|
|失败|        输入参数为空|
|失败|        添加失败|
|失败|        同一交换机下的端口号重复|
|失败|        交换机名称不能重复|
|失败|        发生异常，添加数据失败|

*返回专线信息的字段格式


|字段名称|是否可以为空值|说明|
|------- |-----------|----|
|id|否|主键|
|deviceId|否|交换机id|
|name|是|名称|
|port|是|端口|
|targetIp|是|目标ip|
|comment|是|备注|
|createTime|否|添加时间|

 * 返回值JSON串
 


      {
            "result":0,
            "description":"成功",
            "errorCode":0,
            "data":{
                "id":22,
                "deviceId":23,
                "name":"测试",
                "port":10200,
                "targetIp":"192.168.1.1",
                "comment":"这是一条测试数据",
                "createTime":"2018-08-10 07:19:37.802"
               }
           }
  

## 2.获取全部专线信息
> 接口方法： &nbsp; ApiResult&lt;List&lt;TwatchLeasedLine&gt;&gt; getAllTwatchLeasedLine(TwatchLeasedLine twatchLeasedLine)

| 输入参数        |说明 |
| ------------- |------|
|   无          |   无|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode       | 错误码,此方法不起作用，为0 |
|data|           返回数据，此方法为专线信息列表|

data 单条字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|id|
|deviceId|否|交换机id|
|name|是|名称|
|port|是|端口|
|targetIp|是|目标ip|
|comment|是|备注|
|createTime|是|创建时间|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|没有记录|  
|失败|-1|发生异常,获取列表失败|  

* 返回数据JSON格式


      {
        "result":0,
        "description":"成功",
        "errorCode":0,
        "data":[
            {
                "id":1203,
                "deviceId":1,
                "name":"蜜牙宝贝",
                "port":-1,
                "targetIp":"10.10.108.110",
                "comment":"蜜牙宝贝",
                "createTime":"2018-08-10 07:43:04.000"
            },
            {
                "id":1204,
                "deviceId":1,
                "name":"北京承启1",
                "port":-1,
                "targetIp":"10.10.108.130",
                "comment":"北京承启通(山东通服)济南专线/必要商城",
                "createTime":"2018-08-10 07:43:04.000"
            },
            {
                "id":1205,
                "deviceId":1,
                "name":"北京承启2",
                "port":-1,
                "targetIp":"10.10.108.134",
                "comment":"北京承启通(山东通服)青岛专线/必要商城",
                "createTime":"2018-08-10 07:43:04.000"
            },
            {
                "id":1206,
                "deviceId":1,
                "name":"秦皇岛万1",
                "port":-1,
                "targetIp":"10.10.108.163",
                "comment":"秦皇岛万维渠达职场",
                "createTime":"2018-08-10 07:43:04.000"
            },
            {
                "id":1207,
                "deviceId":1,
                "name":"秦皇岛万2",
                "port":-1,
                "targetIp":"10.10.104.130",
                "comment":"秦皇岛万维新天地职场A 20M",
                "createTime":"2018-08-10 07:43:04.000"
            }
            ]}
    

## 3.根据专线ID获取到专线的信息
> 接口方法：ApiResult&lt;TWatchLeasedLine&gt;&nbsp; getLeasedLine(String switchID)

| 输入参数    | 可以为空   |说明 |
| ------------- |------|--------|
|   leasedLineID    |不可以      |   专线id|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode       | 错误码,此方法不起作用,为0 |
|data|           返回数据，单条专线信息|

data 单条字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|id|
|deviceId|否|交换机id|
|name|是|名称|
|port|是|端口|
|targetIp|是|目标ip|
|comment|是|备注|
|createTime|否|创建时间|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|查询参数为空|  
|失败|-1|没有记录|  

* 返回JSON格式


    {
         "result":0,
         "description":"成功",
         "errorCode":0,
         "data":{
             "id":120,
             "deviceId":1,
             "name":"瓜子二手车",
             "port":-1,
             "targetIp":"10.240.7.5",
             "comment":"瓜子二手车合肥职场专线",
             "createTime":"2018-08-10 07:43:04.000"
         }
     }



## 4.根据ID更新专线的信息
> 接口方法：ApiResult&lt;TWatchLeasedLine&gt;&nbsp; updataLeasedLineByPrimaryKey(TWatchLeasedLine tWatchLeasedLine)

*参数

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id| 必选|id主键|
|deviceId|可选|交换机id|
|name|可选|名称|
|port|可选|端口|
|targetIp|可选|目标ip|
|comment|可选|备注|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码,此方法不起作用，为0 |
|data             | 返回数据，此方法为更新后的专线信息记录|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|输入参数为空|  
|失败|-1|ID字段为空|  
|失败|-1|交换机名称不能重复|  
|失败|-1|同一交换机下的端口号不能重复|  
|失败|-1|未更新任何记录|  
|失败|-1|发生异常，更新失败|  

data 字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|id|
|deviceId|否|交换机id|
|name|是|名称|
|port|是|端口|
|targetIp|是|目标ip|
|comment|是|备注|
|createTime|否|创建时间|


* 返回数据JSON格式


     {
        "result":0,
        "description":"成功",
        "errorCode":0,
        "data":{
            "id":1196,
            "deviceId":231,
            "name":"瓜子二手1",
            "port":3544,
            "targetIp":"下午测试",
            "comment":"瓜子二手车合肥职场联通专线",
            "createTime":"2018-08-10 07:43:04.000"
              }
      }


## 5.通过专线ID删除专线信息
> 接口方法：ApiResult&nbsp; deleteLeasedLineByID(TWatchLeasedLine tWatchLeasedLine)

* 输入参数字段

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id| 必选|id主键|


* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码，此方法不起作用，为0 |
|data             | 返回参数，此方法为空|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|删除成功，删除专线数:x ，删除企业专线数:y" |  
|失败|-1|未删除任何记录|  
|失败|-1|输入参数为空|  
|失败|-1|发生异常，删除失败|  
|失败|-1|ID字段为空|  

* 返回JSON数据格式


    {
        "result":0,
        "description":"删除成功，删除专线数:1 删除企业专线数:0",
        "errorCode":0,
        "data":null
        }


 ## 6.通过专线ID的set集合查询出所有符合条件的专线信息
 > 接口方法： public&nbsp; ApiResult<List\<TWatchLeasedLine>>&nbsp; getLeadedLineByIdSet(Set<Integer> idSet)
 
 * 输入参数
 
 |参数名|意义|
 |---|---|
 |idset|专线表的id的Set集合|
 
 * 返回
 
 |参数|说明|
 |---|---|
 |result  |0成功, -1失败 |
 |description      | 返回状态文本描述 |
 |errorCode        | 错误码，此方法不起作用，为0 |
 |data             | 查询出的专线集合|

* 返回文本描述

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功" |  
|失败|-1|发生异常查询失败|  
|失败|-1|输入参数为空|  
|失败|-1|未查询到记录|  

* 返回JSON数据格式


    {
        "result":0,
        "description":"成功",
        "errorCode":0,
        "data":[
            {
                "id":1203,
                "deviceId":1,
                "name":"蜜牙宝贝",
                "port":-1,
                "targetIp":"10.10.108.110",
                "comment":"蜜牙宝贝",
                "createTime":"2018-08-10 07:43:04.000"
            },
            {
                "id":1204,
                "deviceId":1,
                "name":"北京承启1",
                "port":-1,
                "targetIp":"10.10.108.130",
                "comment":"北京承启通(山东通服)济南专线/必要商城",
                "createTime":"2018-08-10 07:43:04.000"
            }
        ]} 