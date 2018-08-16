## TWatchEnterpriseLeasedLineService接口目录

[1.添加企业专线信息](##1.添加专线信息)        
[2.获取全部企业专线信息或者根据企业ID获得符合调条件的所有信息](##2.获取全部专线信息)       
[3.通过企业专线表ID获取企业专线记录](##3.根据交换机ID获取到交换机的信息)       
[4.通过企业专线表ID更新专线信息](##4.通过专线ID更新专线表的信息)       
[5.根据企业专线表的ID](##5.)       

## 1.添加企业专线信息
> 接口方法：ApiResult<TWatchEnterpriseLeasedLine> createEnterpriseLeasedLine(TWatchEnterpriseLeasedLine tWatchEnterpriseLeasedLine)
* 输入参数字段：    

| 字段            |可选      |描述          |
| -------------  |------|-------|
|enterpriseId|必选|交换机id|
|leasedLineId|必选|名称|
|comment|可选|备注|


* 返回

| 参数     |说明          |
| --------|--------------|
|result       |0 成功, -1 失败 |
|description  | result文本描述 |
|errorCode     | 错误码,为0|
|data|        返回数据，此方法为新创建的企业专线记录信息|

*返回值文本描述

|返回状态      |description文本描述   |
|--------|-------------|
|成功|        添加成功|
|失败|        参数为空|
|失败|        专线id不能重复|
|失败|        企业ID与专线ID不能为空值|
|失败|        添加失败|
|失败|        发生异常，添加失败|


*返回企业专线信息的字段格式


|字段名称|是否可以为空值|说明|
|------- |-----------|----|
|id|否|主键|
|enterpriseId|否|交换机id|
|leasedLineId|否|名称|
|comment|是|备注|
|createTime|否|添加时间|



*返回JSON数据格式
```
    {
        "result":0,
        "description":"成功",
        "errorCode":0,
        "data":{
            "id":600000,
            "enterpriseId":600000,
            "leasedLineId":1236,
            "comment":"2",
            "createTime":"2018-08-10 09:33:39.019"
        }
    }
```
    
## 2.获取全部企业专线信息或者根据企业ID获得符合调条件的所有信息
> 接口方法：ApiResult&lt;List&lt;TWatchEnterpriseLeasedLine&gt;&gt;  getAllTwatchEnterpriseLeasedLine(TwatchEnterpriseLeasedLine twatchEnterpriseLeasedLine)

| 输入参数        |说明 |
| ------------- |------|
|twatchEnterpriseLeasedLine | 查询条件|

|查询条件字段| 是否支持查询条件|
|------|----|
|id/不支持|
|enterpriseId|支持|
|LeasedLine|不支持|
|comment|不支持|
|createTime|不支持|



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
|id|否|id表示|
|enterpriseId|否|交换机id|
|leasedLineId|否|名称|
|comment|是|备注|
|createTime|否|创建时间|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|没有记录|  
|失败|-1|发生异常，获取失败|  


* 返回JSON格式

```
{
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":[
        {
            "id":69,
            "enterpriseId":600000,
            "leasedLineId":2222,
            "comment":null,
            "createTime":"2018-08-15 16:31:07"
        },
        {
            "id":69,
            "enterpriseId":600000,
            "leasedLineId":2222,
            "comment":null,
            "createTime":"2018-08-15 16:31:07"
        },
        {
            "id":69,
            "enterpriseId":600000,
            "leasedLineId":2222,
            "comment":null,
            "createTime":"2018-08-15 16:31:07"
        },
        {
            "id":69,
            "enterpriseId":600000,
            "leasedLineId":2222,
            "comment":null,
            "createTime":"2018-08-15 16:31:07"
        }
    ]
}
```


## 3.根据企业专线表ID获取到企业专线的信息
> 接口方法：ApiResult&lt;TWatchEnterpriseLeasedLine&gt;&nbsp; getTWatchEnterpriseLeasedLine(TWatchEnterpriseLeasedLine tWatchEnterpriseLeasedLine)

| 输入参数    | 可以为空   |说明 |
| ------------- |------|--------|
|   id    |不可以      |   企业专线id|

* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode       | 错误码,此方法为0 |
|data|           返回数据，单条专线信息|

data 单条字段格式：    

| 字段            |是否可以为空值      |描述          |
| -------------  |------ |-------|
|id|否|id表示|
|enterpriseId|否|交换机id|
|leasedLineId|否|名称|
|comment|是|备注|
|createTime|否|创建时间|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|成功|  
|失败|-1|参数为空|  
|失败|-1|没有记录|  
|失败|-1|发生异常，获取失败|  

* JSON数据格式

```
{
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":{
        "id":69,
        "enterpriseId":600000,
        "leasedLineId":2222,
        "createTime":1534321867658
    }
}
```
## 4.根据ID更新专线的信息
> 接口方法：ApiResult&lt;TWatchEnterpriseLeasedLine&gt;&nbsp; updateEnterpriseLeasedLine(TWatchEnterpriseLeasedLine tWatchEnterpriseLeasedLine)

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id|必选|id表示|
|enterpriseId|可选|交换机id|
|leasedLineId|可选|名称|
|comment|可选|备注|


* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码,此方法为0 |
|data             | 返回数据，此方法为更新后的企业专线记录|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|更新成功|  
|失败|-1|未更新任何记录|  
|失败|-1|参数为空|  
|失败|-1|ID字段为空|  
|失败|-1|发生异常，更新失败|  

返回更新记录字段

| 字段            |是否可以为空      |描述          |
| -------------  |------|-------|
|id|否|id表示|
|enterpriseId|否|交换机id|
|leasedLineId|否|名称|
|comment|是|备注|
|createTime|否|创建时间|

* JSON数据格式

```
{
    "result":0,
    "description":"成功",
    "errorCode":0,
    "data":{
        "id":69,
        "enterpriseId":600000,
        "leasedLineId":2222,
        "comment":"修改",
        "createTime":1534321867658
    }
}
```
## 5.根据企业专线表的ID删除企业专线信息
> 接口方法：ApiResult&nbsp; deleteTWatchEnterpriseLeasedLine(TWatchEnterpriseLeasedLine tWatchEnterpriseLeasedLine)

* 输入参数字段

| 字段            |可选      |描述          |
| -------------  |------|-------|
|id| 必选|id主键|


* 返回

| 参数        |说明          |
| ------------- |------|
|result  |0成功, -1失败 |
|description      | 返回状态文本描述 |
|errorCode        | 错误码,此方法为0 |
|data             | 此方法为空|

返回文本描述：

|返回状态|result值|description文本描述|
|-------|----------|-----------------|       
|成功|0|删除成功，删除企业专线记录条数：x  
|失败|-1|未删除任何记录|  
|失败|-1|发生异常，删除记录失败|  
|失败|-1|输入参数为空|  
|失败|-1|ID不能都为空|  

*  JSON数据格式
```
 {
    "result":0,
    "errorCode":0,
    "description":"删除成功，删除企业专线数:1"
 }
```