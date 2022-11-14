import requests as req
from requests.exceptions import HTTPError as h

url_in_while = True
urls = []

while url_in_while:
    url_in = input("Url or type [done]: ")
    if url_in != "done":
        urls.append(url_in)
    else:
        url_in_while = False
        

for url in urls:
    try:
        r = req.get(url)
        
        r.raise_for_status()
    except h as http:
        print(f"HTTP error occured: {http}")
    except Exception as err:
        print(f"Python Error: {err}")
    else:
        print(f"Good!, HTTP code {r.status_code}")
