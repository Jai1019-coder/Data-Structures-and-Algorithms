package FindItinearyFromTickets;

import java.util.HashMap;

public class Solution {
    public static String getStartPt(HashMap<String,String> ticketsMap){
        HashMap<String,String> revTicketsMap = new HashMap<>();
        for(String city : ticketsMap.keySet()){
            revTicketsMap.put(ticketsMap.get(city),city);
        }
        for(String i : ticketsMap.keySet()){
            if(!revTicketsMap.containsKey(i))
                return i;
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String startCity = getStartPt(tickets);
        for (String _ : tickets.keySet()) {
            System.out.print(startCity+"->");
            startCity = tickets.get(startCity);
        }
        System.out.print(startCity);
    }
}
