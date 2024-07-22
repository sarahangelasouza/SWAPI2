# DefaultApi

All URIs are relative to *https://swapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPlanets1Get**](DefaultApi.md#apiPlanets1Get) | **GET** /api/planets/1/ | 
[**apiPlanetsGet**](DefaultApi.md#apiPlanetsGet) | **GET** /api/planets/ | 
[**apiPlanetsSchemaGet**](DefaultApi.md#apiPlanetsSchemaGet) | **GET** /api/planets/schema | 
[**apiSpecies3Get**](DefaultApi.md#apiSpecies3Get) | **GET** /api/species/3/ | 
[**apiSpeciesGet**](DefaultApi.md#apiSpeciesGet) | **GET** /api/species/ | 
[**apiSpeciesSchemaGet**](DefaultApi.md#apiSpeciesSchemaGet) | **GET** /api/species/schema | 

<a name="apiPlanets1Get"></a>
# **apiPlanets1Get**
> InlineResponse2001 apiPlanets1Get()



Auto generated using Swagger Inspector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse2001 result = apiInstance.apiPlanets1Get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPlanets1Get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiPlanetsGet"></a>
# **apiPlanetsGet**
> InlineResponse2002 apiPlanetsGet(search)



Auto generated using Swagger Inspector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String search = "search_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.apiPlanetsGet(search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPlanetsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiPlanetsSchemaGet"></a>
# **apiPlanetsSchemaGet**
> InlineResponse200 apiPlanetsSchemaGet()



Auto generated using Swagger Inspector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse200 result = apiInstance.apiPlanetsSchemaGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPlanetsSchemaGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiSpecies3Get"></a>
# **apiSpecies3Get**
> InlineResponse2005 apiSpecies3Get()



Auto generated using Swagger Inspector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse2005 result = apiInstance.apiSpecies3Get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiSpecies3Get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiSpeciesGet"></a>
# **apiSpeciesGet**
> InlineResponse2004 apiSpeciesGet(search)



Auto generated using Swagger Inspector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String search = "search_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.apiSpeciesGet(search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiSpeciesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiSpeciesSchemaGet"></a>
# **apiSpeciesSchemaGet**
> InlineResponse2003 apiSpeciesSchemaGet()



Auto generated using Swagger Inspector

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse2003 result = apiInstance.apiSpeciesSchemaGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiSpeciesSchemaGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

