const data = null;

const xhr = new XMLHttpRequest();
xhr.withCredentials = true;

xhr.addEventListener('readystatechange', function () {
	if (this.readyState === this.DONE) {
		console.log(this.responseText);
	}
});

xhr.open('GET', 'https://leetcode-api.p.rapidapi.com/leetcode/top-100?skip=3&limit=10');
xhr.setRequestHeader('x-rapidapi-key', 'Sign Up for Key');
xhr.setRequestHeader('x-rapidapi-host', 'leetcode-api.p.rapidapi.com');

xhr.send(data);