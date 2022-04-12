# quantcast_coding_task

Most Active Cookie
Given a cookie log file in the following format:
cookie,timestamp
AtY0laUfhglK3lC7,2018-12-09T14:19:00+00:00
SAZuXPGUrfbcn5UA,2018-12-09T10:13:00+00:00
5UAVanZf6UtGyKVS,2018-12-09T07:25:00+00:00
AtY0laUfhglK3lC7,2018-12-09T06:19:00+00:00
SAZuXPGUrfbcn5UA,2018-12-08T22:03:00+00:00
4sMM2LxV07bPJzwf,2018-12-08T21:30:00+00:00
fbcn5UAVanZf6UtG,2018-12-08T09:30:00+00:00
4sMM2LxV07bPJzwf,2018-12-07T23:30:00+00:00


Command line program developed in Java to process the log file and return the most active
cookie for a specific day. 

How to Run- 
1. Executable jar with name "quantcast_coding_task-1.0-SNAPSHOT" is placed inside "Executable" folder.
2. Navigate inside "Executable" folder and open command prompt.
3. Run jar file and kindly pass -f argument followed by filename and -d argument followed by Date from the command line.
-f parameter for the filename to process and a -d parameter to
specify the date.

Sample to run using command line -  java -jar quantcast_coding_task-1.0-SNAPSHOT.jar -f cookie_log.csv -d 2018-12-08

And it would write to stdout:
SAZuXPGUrfbcn5UA
4sMM2LxV07bPJzwf
fbcn5UAVanZf6UtG

Most active cookie is one seen in the log the most times during a given day.

Assumptions:
● If multiple cookies meet that criteria, return all of them on separate lines.
● You can assume -d parameter takes date in UTC time zone.
● You have enough memory to store the contents of the whole file.
● Cookies in the log file are sorted by timestamp (most recent occurrence is the first line of the file).

Implementation :
  - Main to execute.
  - LogFileUtility parses the file and builds data structures to analyze frequency of cookies by date
  - CookieObject class represents a single Cookie as an object.
  - Programmed in Java.
  - Used JUnit as testing framework to create two tests (tests described in coding task for dates: 2018-12-09, 2018-12-08)
