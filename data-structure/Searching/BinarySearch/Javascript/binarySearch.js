(function(){
	'use strict';
	var a = [1,2,3,4,5,6,7,8,9,10];
	var searchVal = 2;
	var len = a.length;
	var low = 0;
	var high = len - 1;

	while(low <= high) {
		var mid = Math.floor((low + high) / 2);
		
		if(a[mid] === searchVal) {
			console.log("Search Term " + searchVal + " found at " + mid);
			break;
		}

		if (a[mid] > searchVal) {
			high = mid;
		} else {
			low = mid;
		}
	}
	

}());