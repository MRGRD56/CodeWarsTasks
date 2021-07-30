export class Challenge {
    public static solution(number: number) {
        if (number < 0) return 0;

        let result = 0;
        for (let i = number - 1; i >= 3; i--) {
            result += (i % 3 === 0 || i % 5 === 0) ? i : 0;
        }

        return result;
    }
}