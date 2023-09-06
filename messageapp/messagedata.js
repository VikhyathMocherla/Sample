function loadData()
{
    var xhtp=new XMLHttpRequest()
    xhtp.onreadystatechange=function()
    {
        if(this.readyState==4 && this.status==200)
        {
            console.log("status ready")
            var rest=this.responseText
            var data=JSON.parse(rest)
            for(d of data)
            {
                console.log(d)
                document.getElementById("messages").innerHTML+=d.sender+" "+d.receiver+" "+d.messageText+"<br/>"
            }
            //console.log(this.responseText)
        }
    }
    xhtp.open("GET","http://localhost:8080/messages",true)
    xhtp.getResponseHeader("Content-Type","application/json")
    xhtp.send()
}
