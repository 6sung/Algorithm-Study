class Solution {
  public int solution(int n) {
      int answer = 0;
      int i = 3;
      int minus2 = 1;
      int minus1 = 2;
      while (i < n) {
          answer = (minus2 + minus1) % 1000000007;
          minus2 = minus1;
          minus1 = answer;
          i++;
      }
      answer = (minus2 + minus1) % 1000000007;
      return answer;
  }
    public int sub_solution(int n) {
        if (n <= 2)
            return n;
        return (sub_solution(n - 1) + sub_solution(n - 2)) % 1000000007;
    }
}
