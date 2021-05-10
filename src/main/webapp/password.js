const password = document.getElementById('password')
const form = document.getElementById('form')
const errorElement = document.getElementById('error')
form.addEventListener('submit', (e) => {
	let messages = []
	if(password.value.length <= 6) {
		message.push('Password needs to be greater than 6 characters')
	}
	if(password.value.length <= 24) {
		message.push('Password needs to be less than 24 characters')
	}
	if(password.value === 'password') {
		message.push('Password can not be set as password')
	}
	
	if(messages.length > 0){
		e.preventDefault()
		errorElement.innerText = messages.join(',')
	}
})