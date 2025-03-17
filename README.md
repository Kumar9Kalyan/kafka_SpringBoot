# Project using kafka dependency in spring boot
1. The customer subscribes to the publisher, the subscriber produces the coordinates and writes it into the topic.
2. The coordiantes here are actually generated using radom method of Math class.
3. The zookeeper was run on port 9092, which managed the publisher application(cab-book-driver).
4. When put request was sent by  cab-book-customer microservice, the publiser publishes the location coordinates and it is printed on the console
