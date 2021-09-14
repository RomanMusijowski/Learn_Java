package algs;

public class FindBrokenCommit {
    public static void main(String[] args) {
        int[] arr = new int[300];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }

        int result = findBadCommit(arr);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    public static int findBadCommit(int[] commitIds) {
        return search(commitIds, 0, commitIds.length - 1);
    }


    private static int search(int[] arr, int l, int r) {
        int mid, index = -1;

        while (l <= r) {
            mid = (l + r) / 2;

            if (executeTests(arr[mid])) {
                index = mid;
                r = mid - 1;
            }else {
                l = mid+1;
            }
        }
        return arr[index];
    }

    static boolean executeTests(int commitId){
        return commitId >=83;
    }
//Immediately-invoked Function Expression
//    var Wrap = (function() {
//  function User(name) {
//    this.name = name;
//  }
//
//  User.prototype.thankForLoggingIn = function() {
//    return "Thank you coming in " + this.name;
//  };
//
//  return User;
//})();
//
//var user = new Wrap("Guest");
//let welcomeMessage = user.thankForLoggingIn();
//console.log(welcomeMessage);
}
