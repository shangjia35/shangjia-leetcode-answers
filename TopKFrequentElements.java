class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        // create a HashMap to count each unique element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // store map as a list
        List<int[]> mapList = new ArrayList<>();
        for (int key : map.keySet()) {
            int[] entry = new int[2];
            entry[0] = key;
            entry[1] = map.get(key);

            mapList.add(entry);
        }

        for (int i = 0; i < mapList.size(); i++) {
            System.out.print(mapList.get(i)[0] + ":" + mapList.get(i)[1] + " ");
        }
        System.out.println();

        // quick sort/partition values in mapList to select top k values in map
        quickSort(mapList, 0, mapList.size() - 1, k - 1);

        for (int i = 0; i < k; i++) {
            ans[i] = mapList.get(i)[0];
        }

        return ans;
    }

    public void quickSort(List<int[]> mapList, int start, int end, int k) {
        if (start < end) {
            int pivot = partition(mapList, start, end);
            System.out.println("pivot:" + pivot + " k: " + k);
            for (int i = 0; i < mapList.size(); i++) {
                System.out.print(mapList.get(i)[0] + ":" + mapList.get(i)[1] + " ");
            }
            System.out.println();

            if (pivot == k) {
                return;
            } else if (pivot < k) {
                quickSort(mapList, pivot + 1, mapList.size() - 1, k);
            } else {
                quickSort(mapList, 0, pivot - 1, k);
            }
        }
    }

    public int partition(List<int[]> mapList, int low, int high) {
        // choose the pivot
        int pivot = mapList.get(high)[1];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            // if the current element is greater than the pivot
            if (mapList.get(j)[1] > pivot) {
                // increment index of smaller element
                i++;
                // swap i j
                int[] temp = mapList.get(i);
                mapList.set(i, mapList.get(j));
                mapList.set(j, temp);
            }
        }
        // swap i+1, high
        int[] temp = mapList.get(i + 1);
        mapList.set(i + 1, mapList.get(high));
        mapList.set(high, temp);

        return i + 1;
    }
}
