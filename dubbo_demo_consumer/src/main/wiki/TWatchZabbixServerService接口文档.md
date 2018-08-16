## TWatchDeviceService接口目录

[1.添加zabbix server信息](##1.添加专线信息)        
[2.获取全部zabbix server信息](##2.获取全部专线信息)       
[3.通过zabbix serverID获取zabbix server记录](##3.根据交换机ID获取到交换机的信息)       
[4.通过zabbix serverID更新zabbix server信息](##4.通过专线ID更新专线表的信息)       
[5.通过zabbix serverID删除zabbix server记录](##5.)       

## 1.添加zabbix server信息
> 接口方法：ApiResult &lt;TWatchZabbixServer &gt; &nbsp;  createTWatchZabbixServer(TWatchZabbixServer tWatchZabbixServer)
* 输入参数字段：    

| 字段            |可选      |描述          |
| -------------  |------|-------|
|name|可选|名称|
|url|可选|api地址|
|user|可选|用户名|
|password|可选|密码|


* 返回

| 参数     |说明          |
| --------|--------------|
|result       |0 成功, -1 失败 |
|description  | result文本描述 |
|errorCode     | 错误码,为0|
|data|        返回数据，此方法为新创建的zabbix server信息

* 返回值文本描述

|返回状态      |description文本描述   |
|--------|-------------|
|成功|        成功|
|失败|        添加失败|
|失败|        发生异常，添加失败|
|失败|        参数为空|



* 返回zabbix server信息的字段格式


|字段名称|是否可以为空值|说明|
|------- |-----------|----|
|id|否|主键|
|name|可选|名称|
|url|可选|api地址|
|user|可选|用户名|
|password|可选|密码|
|createTime|否|创建时间|

*返回JSON数据格式

    { 
        "result":0,
        "description":"成功",
        "errorCode":0,
        "data":{
            {
                "id": 2,
                "name": "weq",
                "url": "www",
                "user": "3",
                "password": "fsdf",
                "createTime": 1533622581000
              }
        }
        }

## 2.获取全部交换机信息
> 接口方法：ApiResult&lt;List&lt;TWatchZabbixServer&gt;&gt;  getAllTWatchZabbixServer(TWatchZabbixServer tWatchZabbixServer)

| 输入参数        |说明 |
| ------------- |------|
|   无          |   无|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode       | 错误码,此方法为0 |
|data|           返回数据，此方法为zabbix server信息列表|

* data 单条字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|主键|
|name|是|名称|
|url|是|api地址|
|user|是|用户名|
|password|是|密码|
|createTime|否|创建时间|

* 返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|没有记录|  
|失败|-1|发生异常，获取失败|  


* 返回JSON数据格式


    { 
            "result":0,
            "description":"成功",
            "errorCode":0,
            "data":{
                {
                    "id": 2,
                    "name": "weq",
                    "url": "www",
                    "user": "3",
                    "password": "fsdf",
                    "createTime": 1533622581000
                  }，{
                      "id": 4,
                      "name": "你好",
                      "url": "你好.你好.你好",
                      "user": "你好",
                      "password": "你好",
                      "createTime": 1533807880791
                    }
            }
            }
## 3.通过交换机ID获取交换机记录
> 接口方法：ApiResult&lt;TWatchZabbixServer&gt;&nbsp; getTWatchZabbixServer(TWatchZabbixServert tWatchZabbixServer)

| 输入参数    | 可以为空   |说明 |
| ------------- |------|--------|
|   id    |不可以      |   交换机id|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode       | 错误码,此方法为0 |
|data|           返回数据，单条专线信息|

* data 字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|主键|
|name|可选|名称|
|url|可选|api地址|
|user|可选|用户名|
|password|可选|密码|
|createTime|否|创建时间|

* 返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|输入参数为空|  
|失败|-1|ID为空|  
|失败|-1|没有记录|  
|失败|-1|发生异常，获取失败|  


*返回JSON数据格式

    {
        "result":0,
        "description":"成功",
        "errorCode":0,
        "data":[
            {
                "id":2,
                "name":"weq",
                "url":"www",
                "user":"3",
                "password":"fsdf",
                "createTime":1533622581000
            }
        ]
    }


## 4.通过zabbix serverID更新专线信息
> 接口方法：ApiResult&lt;TWatchZabbixServer&gt;&nbsp; updateTWatchZabbixServer(TWatchZabbixServer TWatchZabbixServer)

* 输入参数字段

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id|否|主键|
|name|可选|名称|
|url|可选|api地址|
|user|可选|用户名|
|password|可选|密码|




* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码,此方法为0 |
|data             | 返回数据，在此方法为更新后的交换机记录|

* 返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|未更新任何记录|  
|失败|-1|参数为空|  
|失败|-1|id为空|  
|失败|-1|发生异常更新失败|  

*返回更新记录字段

| 字段            |是否可以为空      |描述          |
| -------------  |------|-------|
|id|否|主键|
|name|是|名称|
|url|是|api地址|
|user|是|用户名|
|password|是|密码|
|createTime|否|创建时间|


* 返回JSON数据格式

        {
            "result":0,
            "description":"成功",
            "errorCode":0,
            "data":
                {
                    "id":2,
                    "name":"weq",
                    "url":"www",
                    "user":"3",
                    "password":"fsdf",
                    "createTime":1533622581000
                }
        }
## 5.通过交换机ID删除交换机记录
> 接口方法：ApiResult&nbsp; deleteTWatchZabbixServer(TWatchZabbixServer tWatchZabbixServer)

* 输入参数字段

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id| 必选|id主键|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码,此方法没有作用，为0 |
|data             | 此方法为空|

* 返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|删除成功  
|失败|-1|未删除任何记录|  
|失败|-1|发生异常，删除记录失败|  
|失败|-1|id值为空|  

* 返回JSON数据格式
    
      {
          "result":0,
          "description":"删除成功",
          "errorCode":0,
          "data":null
          }