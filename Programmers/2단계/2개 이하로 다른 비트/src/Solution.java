class Solution {
    public long[] solutionA(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            long two = 0b11;
            while ((numbers[i] ^ two) < numbers[i]) {
                two <<= 1;
            }

            long one = 0b1;
            while ((numbers[i] ^ one) < numbers[i]) {
                one <<= 1;
            }

            answer[i] = Math.min((numbers[i] ^ two), (numbers[i] ^ one));
        }
        
        return answer;
    }

    public long[] solutionB(long[] numbers) {
        for(int i = 0; i< numbers.length; i++){
            long mask = ~numbers[i] & (numbers[i] + 1); 
            numbers[i] = (numbers[i] | mask) & ~(mask >> 1);
        }
        return numbers;
    }

    public long[] solution(long[] numbers) {
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = numbers[i] + 1 + ((numbers[i] ^ (numbers[i] + 1))>>>2);
        }
        return numbers;
    }
}