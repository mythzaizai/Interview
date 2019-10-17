<html>
<body>

email

<?php

ini_set("SMTP","ssl://smtp.gmail.com");
ini_set("smtp_port","465");
    
        
// The message
$message = "test";

// In case any of our lines are larger than 70 characters, we should use wordwrap()
$message = wordwrap($message, 70);

// Send
if(mail("mythzaizai@gmail.com", 'zaizai Subject', $_POST["Context"])){
    echo "success";
}else{
    echo "fail";
}

    
?>
    
<input type="button" name="Submit" value="返回" onclick="javascript:history.back(1)" />

    
</body>
</html>