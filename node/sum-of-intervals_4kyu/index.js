//https://www.codewars.com/kata/52b7ed099cdc285c300001cd/train/javascript
//[FAILED]

function sumIntervals(intervals) {
  const array = [...intervals]
    .sort((a, b) => a[1] - b[0])
    .reduce((result, value, index, arr) => {
      const previousValue = arr[index - 1];
      if (previousValue !== undefined && previousValue[1] >= value[0]) {
        result.splice(index - 1, 1);
        result.push([
          Math.min(previousValue[0], value[0]), 
          Math.max(previousValue[1], value[1])
        ]);
        return result;
      }
      
      result.push(value);
      return result;
    }, []);
  
  console.log({intervals, array});
  
  return array.reduce((result, value) => {
    return result + Math.abs(value[1] - value[0]);
  }, 0);
}
