------------REHLATI------------
This project have some points for integration with public SOAP services,
from www.webservicex.net

	-SunSetRiseServiceSoapProxy : getSunSetRiseTime
	-CCCheckerSoapProxy: 	    : validateCardNumber
	-AirportSoapProxy           : getAirportInformationByCountry
	-GlobalWeatherSoapProxy     : getWeather
	
And ther is also an integration point ( from the old task ) call expedia website to get the hotels.
The same code no change


while browsing the website you will find the home page with some offers 
click in anyone to be ridirected to the payment page, (that will cal validateCardNumber service).

Then the second menu tab have the search hotel page that returnt hotels from rest service, same code, new desgin.

The third tab have the other services:
-Weather: this service always return no data found form there side.
-Sunset - SunRise: this service needs Latitude Longitude ab TimeZone, I used Jordan by default due to time 
	intead of adding a list of countires and the value in a lookup
-Airport Info: this service return the airports by country as xml string inside the envelope, so we need to unmarshal the response.


The images in the website are from my trips around the world :)


