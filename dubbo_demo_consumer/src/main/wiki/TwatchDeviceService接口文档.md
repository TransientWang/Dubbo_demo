## TWatchDeviceService接口目录

[1.添加交换机信息](##1.添加专线信息)        
[2.获取全部交换机信息](##2.获取全部专线信息)       
[3.通过交换机ID获取交换机记录](##3.根据交换机ID获取到交换机的信息)       
[4.通过交换机ID更新交换信息](##4.通过专线ID更新专线表的信息)       
[5.通过交换机ID删除交换机记录](##5.)       

## 1.添加交换机信息
> 接口方法：ApiResult &lt;TWatchDevice &gt; &nbsp;  createDevice(TWatchDevice tWatchDevice)
* 输入参数字段：    

| 字段            |可选      |描述          |
| -------------  |------|-------|
|name|可选|设备名称|
|ip|可选|ip地址|
|snmpPort|可选|snmp端口|
|_private|可选|private|
|zabbixServerId|可选|设备所属的zabbix server|
|comment|可选|备注|


* 返回

| 参数     |说明          |
| --------|--------------|
|result       |0 成功, -1 失败 |
|description  | result文本描述 |
|errorCode     | 错误码,为0|
|data|        返回数据，此方法为新创建的交换机信息

*返回值文本描述

|返回状态      |description文本描述   |
|--------|-------------|
|失败|        输入参数为空|
|成功|        添加成功|
|失败|        添加失败|
|失败|        发生异常，添加失败|


*返回交换机信息的字段格式


|字段名称|是否可以为空值|说明|
|------- |-----------|----|
|id|否|主键|
|name|必选|设备名称|
|ip|可选|ip地址|
|snmpPort|可选|snmp端口|
|_private|可选|private|
|zabbixServerId|可选|设备所属的zabbix server|
|comment|可选|备注|
|createTime|可选|创建时间|

* 返回数据JSON格式

```
    { 
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":{
        "id":47,
        "name":"下午测试",
        "ip":null,
        "snmpPort":3544,
        "_private":"1",
        "zabbixServerId":12,
        "comment":null,
        "private":"1",
        "createTime": 1533891436297
    }
    }
```

## 2.获取全部交换机信息
> 接口方法：ApiResult&lt;List&lt;TWatchDevice&gt;&gt;  getAllTWatchDevice(TWatchDevice tWatchDevice)

| 输入参数        |说明 |
| ------------- |------|
|   无          |   无|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode       | 错误码,此方法为0 |
|data|           返回数据，此方法为企业专线信息列表|

data 单条字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|主键|
|name|是|设备名称|
|ip|是|ip地址|
|snmpPort|是|snmp端口|
|_private|是|private|
|zabbixServerId|是|设备所属的zabbix server|
|comment|是|备注|
|createTime|否|创建时间|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|没有记录|  
|失败|-1|发生异常，获取失败|  

* 返回JSON数据格式

```
    { 
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":[
        {
            "id":5,
            "name":"BJ-GHXW_J12_3850",
            "ip":"10.10.253.21",
            "snmpPort":0,
            "_private":null,
            "zabbixServerId":null,
            "comment":null,
            "private":null,
            "createTime": 1533891436297
        },
        {
            "id":6,
            "name":"BJ-GHXW-D17_3560-1A",
            "ip":"10.10.254.33",
            "snmpPort":0,
            "_private":null,
            "zabbixServerId":null,
            "comment":null,
            "private":null,
            "createTime": 1533891436297
        },
        {
            "id":7,
            "name":"BJ-GHXW_D17_3560-2A",
            "ip":"10.10.18.3",
            "snmpPort":0,
            "_private":null,
            "zabbixServerId":null,
            "comment":null,
            "private":null,
            "createTime": 1533891436297
        }
    ]
    }
```

## 3.通过交换机ID获取交换机记录
> 接口方法：ApiResult&lt;TWatchDevice&gt;&nbsp; getTWatchDevice(TWatchDevice tWatchDevice)

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

data 字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|主键|
|name|是|设备名称|
|ip|是|ip地址|
|snmpPort|是|snmp端口|
|_private|是|private|
|zabbixServerId|是|设备所属的zabbix server|
|comment|是|备注|
|createTime|否|创建时间|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|输入参数为空|  
|失败|-1|id为空|  
|失败|-1|没有记录|  
|失败|-1|发生异常，获取失败|  


* 返回JSON数据格式

```
    {
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":{
        "id":5,
        "name":"BJ-GHXW_J12_3850",
        "ip":"10.10.253.21",
        "snmpPort":0,
        "_private":null,
        "zabbixServerId":null,
        "comment":null,
        "private":null,
        "createTime": 1533891436297
    }
    }
```
## 4.通过交换机ID更新专线信息
> 接口方法：ApiResult&lt;TWatchDevice&gt;&nbsp; updateTWatchDevice(TWatchDevice tWatchDevice)

输入参数字段

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id|否|主键|
|name|可选|设备名称|
|ip|可选|ip地址|
|snmpPort|可选|snmp端口|
|_private|可选|private|
|zabbixServerId|可选|设备所属的zabbix server|
|comment|可选|备注|


* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码,此方法为0 |
|data             | 返回数据，在此方法为更新后的交换机记录|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|更新记录条数为0|  
|失败|-1|输入参数为null|  
|失败|-1|ID字段为null|  
|失败|-1|发生异常更新失败|  

返回更新记录字段

| 字段            |是否可以为空      |描述          |
| -------------  |------|-------|
|id|否|主键|
|name|是|设备名称|
|ip|是|ip地址|
|snmpPort|是|snmp端口|
|_private|是|private|
|zabbixServerId|是|设备所属的zabbix server|
|comment|是|备注|
|createTime|否|创建时间|

*  返回JSON数据格式

```
    {
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":{
        "id":5,
        "name":"下午测试",
        "ip":"10.10.253.21",
        "snmpPort":3544,
        "_private":"2",
        "zabbixServerId":12,
        "comment":null,
        "private":"2",
        "createTime": 1533891436297
    }
     }
```
## 5.通过交换机ID删除交换机记录
> 接口方法：ApiResult&nbsp; deleteTWatchDevice(TWatchDevice tWatchDevice)

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

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|删除成功  
|失败|-1|未删除任何记录|  
|失败|-1|发生异常，删除记录失败|  
|失败|-1|输入参数为null|  
|失败|-1|删除条件不能都为空|  


* 返回JSON数据格式
```
     {
      "result":0,
      "description":"删除成功，删除专线数:24 删除企业专线数:1",
      "errorCode":0,
      "data":null
     }
```