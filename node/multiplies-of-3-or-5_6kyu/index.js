"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Challenge = void 0;
var Challenge = /** @class */ (function () {
    function Challenge() {
    }
    Challenge.solution = function (number) {
        if (number < 0)
            return 0;
        var result = 0;
        for (var i = number - 1; i >= 3; i--) {
            result += (i % 3 === 0 || i % 5 === 0) ? i : 0;
        }
        return result;
    };
    return Challenge;
}());
exports.Challenge = Challenge;
console.log(Challenge.solution(10));
;
//# sourceMappingURL=index.js.map