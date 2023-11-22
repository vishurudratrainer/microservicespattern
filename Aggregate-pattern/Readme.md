Internal Details
The Aggregator pattern can add an extra layer for request/response management, enabling optimizations like response caching, parallel calls, and more. It also decouples consumers from the details of internal microservices, making the architecture more flexible.

Best Practices, Dos and Don'ts, Optimization Strategies
Caching: Cache common queries in the aggregator.
Asynchronous Calls: Use async mechanisms for calling services to reduce the overall time.
Bulk API: Where possible, use bulk APIs to retrieve data.
Error Handling: Handle errors gracefully; a failure in one service should not lead to a complete failure in the aggregator.
Monitoring: Monitor aggregators carefully as they are a common point of failure.
Rate Limiting: Implement rate limiting to prevent misuse.
Decoupling: Keep the aggregator decoupled from business logic; it should only be responsible for data gathering.