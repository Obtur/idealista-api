# Idealista Search API client
Java client for Idealista Search API.
Current version 0.1.0 features:
  - request and response binding to Java classes;
  - reuqest validation;
  - search operations for all types of properties;
  - API requests-per-second limitation implementation;
  - sample API key provided for testing.

TODO:
  - cover with more tests;
  - add another ways for location specification;
  - add user token support if possible.

Usage:
```
Idealista idealista = new Idealista(apiKey);

BedroomSearchRequest request = new BedroomSearchRequest();
request.setOperationType(OperationType.RENT);
request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
IdealistaSearchResponse response = idealista.search(request);
```
