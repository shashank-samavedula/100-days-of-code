// Problem Statement : https://practice.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1


static int countDistinctSubarray(int arr[], int n) 
    { 
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)
            s.add(arr[i]);
        
        int count = 0;
        
        
        for(int i=0;i<n;i++)
        {
            Set<Integer> x = new HashSet<>();
            for(int j=i;j<n;j++) {
                x.add(arr[j]);
            if(x.size() == s.size())
                count++;
            }
        }
         return count;
    }
    
//Time Complexity : O(n^2)
//Space Complexity : O(n^2)
