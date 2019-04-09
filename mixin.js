var michael = {
    name: 'Michael',
    address: '123 Hope Ln',
    city: 'Apple',
    state: 'NC',
    zipcode: '28216'
}

function getProfileUpdate(address, city) {
    return {
        address: '321 Hot Fire St',
        city: 'Strawberry',
        }
}

function updateProfile() {
    return Object.assign(michael, getProfileUpdate())
}

console.log(michael);

updateProfile();
console.log(michael);