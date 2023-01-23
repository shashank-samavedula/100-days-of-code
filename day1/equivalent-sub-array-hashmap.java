//Problem Statement : https://practice.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1

static int countDistinctSubarray(int a[], int n) 
    { 
       HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)
            s.add(a[i]);
        
        int count = 0;
        
        HashMap<Integer, Integer> h = new HashMap<>();
        
        int i=0,j=0;
        h.put(a[0],1);
        
        while(j<n)
        {
            if(h.size()<s.size())
            {
                j++;
                if(j<n)
                {
                    if(h.isEmpty())
                        h.put(a[j],1);
                    else if(h.containsKey(a[j]))
                        h.put(a[j],h.get(a[j])+1);
                    else
                        h.put(a[j],1);
                }
            }
            else if(h.size()==s.size())
            {
                while(i<=j && h.size()==s.size())
                {
                    count+=n-j;
                    if(h.get(a[i])==1)
                        h.remove(a[i]);
                    else
                        h.put(a[i],h.get(a[i])-1);
                    i++;
                }
            }
        }
        return count;
    }

//Time Complexity : O(n)
//Space Complexity : O(n)
