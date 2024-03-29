const mapWith = (array, callback) => {
	let output = [];

	array.forEach((element) => {
		output.push(callback(element));
	});

	return output;
};

const addOne = (number) => {
	return number + 1;
};

const removeSecondLetter = (word) => {
	let result = "";

	for (let i = 0; i < word.length; i++) {
		if (i % 2 === 0) {
			result += word[i];
		}
	}

	return result;
};

console.log(mapWith([1, 2, 3], addOne));

const words = ["map", "reduce", "filter"];
console.log(mapWith(words, removeSecondLetter));
