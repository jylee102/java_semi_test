const data = {
   name: '흰둥이',
   owner: '신짱구',
   age: 1,
   arr: [1, 2, 3, 4], //배열
   walk: function (str) {
      console.log(str)
      console.log('산책중')
   },
}

console.log(data.name)

console.log(data.owner)
data.owner = '훈이'
console.log(data.owner)