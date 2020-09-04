let btn = document.getElementById('buttonB');

btn.addEventListener('click',() =>{
    let numbers = document.getElementById('numbers').value;
    //url = 'http://localhost:36000/calculate';
    url = 'https://parcial-alejandrobohorquez.herokuapp.com/calculate';
    axios.post(url, numbers)
        .then(res => {
            doPost(res);
        })
        .catch( error =>{
            console.log(error);
        })
    function doPost(res) {
        $('.list').html('');
        $('.average').html('');
        $('.sum').html('');
        let data = JSON.parse(res.data);
        $(".list").append( "Ordered numbers: " + data.numbers );
        $(".average").append( "Average :" + data.mean);
        $(".sum").append( "Sum :" + data.sum);
    }
});