-- 1
SELECT AVG(cost)
FROM Bookings;

-- 2
SELECT  origin, COUNT(*) as total_origin 
 FROM  FLights
GROUP BY origin;

-- 3
SELECT  destination, COUNT(*) as total_destination
 FROM  FLights
GROUP BY destination;

-- 4
SELECT origin, COUNT(passenger_id) AS "total_passengers"
FROM Bookings
INNER JOIN Flights F ON Bookings.FLIGHT_NUMBER = F.FLIGHT_NUMBER
GROUP BY origin;

-- 5
SELECT origin, AVG(cost) AS "average cost"
FROM Bookings
INNER JOIN Flights F ON Bookings.FLIGHT_NUMBER = F.FLIGHT_NUMBER
GROUP BY orgin;

--6
SELECT origin, cost, COUNT(passenger_id) AS "total_passengers"
FROM Bookings
INNER JOIN Flights F ON Bookings.FLIGHT_NUMBER = F.FLIGHT_NUMBER
GROUP BY origin, cost
HAVING cost < 200

-- 7  
SELECT to_char(booking_date,'mm') AS month,
SUM(cost) AS revenue
FROM Bookings
GROUP BY to_char(booking_date,'mm');

-- 8
SELECT ORIGIN, AVG(PASSENGER_NUMBER)
FROM (
SELECT FLIGHT_NUMBER, COUNT(PASSENGER_ID) AS PASSENGER_NUMBER
FROM BOOKINGS
GROUP BY FLIGHT_NUMBER) AS PASSENGER_PER_FLIGHT
INNER JOIN FLIGHTS F ON PASSENGER_PER_FLIGHT.FLIGHT_NUMBER = F.FLIGHT_NUMBER
GROUP BY ORIGIN
HAVING COUNT(ORIGIN) = 2;

-- 9
SELECT destination, COUNT(passenger_id) AS "total_passengers"
FROM Bookings
INNER JOIN Flights F ON Bookings.FLIGHT_NUMBER = F.FLIGHT_NUMBER
GROUP BY destination
ORDER BY total_passengers DESC
LIMIT 10;





















