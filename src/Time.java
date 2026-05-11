void main() {
    int hour = 19 * 3600;
    int minute = 60;
    int second = 0;
    int currenttimeinseconds = hour + minute + second;
    System.out.println(currenttimeinseconds);
    int maxhour = 24 * 3600;
    int maxtimeinseconds = maxhour;
    System.out.println(maxtimeinseconds);
    int timeleftuntilmidnight = maxtimeinseconds - currenttimeinseconds;
    System.out.println(timeleftuntilmidnight);

}