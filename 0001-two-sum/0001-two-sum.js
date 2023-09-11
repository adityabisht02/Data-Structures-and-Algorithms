/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    map={}
    ans=[]
   
    for(let i=0;i<nums.length;i++){
        if(target-nums[i] in map){
            ans.push(map[target-nums[i]])
            ans.push(i)
       //     return [map[target-nums[i]],i];
            break
        }
        else{
      
            map[nums[i]]=i
        }
    }
    return ans
};