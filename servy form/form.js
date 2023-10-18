document.getElementById('myForm').addEventListener('submit', function(event) {
    event.preventDefault();


    var gender = document.querySelector('input[name="choice"]:checked').value;
    var firstname = document.getElementById('firstname').value;
    var lastname = document.getElementById('lastname').value;
    var dob = document.getElementById('dob').value;

    var Profession = document.getElementById('Profession').value;
    var email = document.getElementById('email').value;
    var mobilenumber = document.getElementById('mobilenumber').value;
    var select = document.getElementById('country').value;

    if(firstname.trim()===''||lastname.trim()===''||dob.trim()===''||Profession.trim()===''||email.trim()===''||mobilenumber.trim()===''||select.trim()===''||gender.trim()===''){
        alert(
            "please Fill all the fields ..."
        );
            
        
    
    }else(alert('FirstName: ' + firstname + '\nLastName: ' + lastname + '\ndob: '+ dob + '\ngender: ' +gender + '\nProfession: ' +Profession +'\nemail:'+email +'\nmobilenumber:'+mobilenumber +'\nselect:'+select  ));
    
    
    document.getElementById('myForm').reset();


    
});



