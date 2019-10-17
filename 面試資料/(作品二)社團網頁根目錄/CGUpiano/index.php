<html>

<head>
    <title>CGU Piano Club</title>
    
    <meta charset="utf-8" />
    <meta http-equiv="content-type" content="index/html ; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />  <!瀏覽器窗口的寬度等於設備的寬度>
    
    <style>
        h1 {color:#FF4500;}
    </style>
    
    <style type="text/css">
        body {
            margin-top: 0px;
            margin-right: 0px;
            margin-bottom: 0px;
            margin-left: 0px;
        }
        #container{
            height:375px;
            background:#fff;
            background:linear-gradient(top,#ffffff,rgba(51,51,51,0)),url("https://www.ct.org.tw/wp-content/uploads/2016/12/3872_%E9%8B%BC%E7%90%B4c.jpg") center bottom no-repeat;
            background:-moz-linear-gradient(top,#ffffff,rgba(51,51,51,0)),url("https://www.ct.org.tw/wp-content/uploads/2016/12/3872_%E9%8B%BC%E7%90%B4c.jpg") center bottom no-repeat;
            background:-webkit-linear-gradient(top,#ffffff,rgba(51,51,51,0)),url("https://www.ct.org.tw/wp-content/uploads/2016/12/3872_%E9%8B%BC%E7%90%B4c.jpg") center bottom no-repeat;
            background-size: cover;
        }
    </style>
    
    
    
    
    
</head>

    
<body background="http://web2.jaes.ntpc.edu.tw/wmv//GIMP/%E5%A5%BD%E5%BA%B7%E7%A6%AE%E7%89%A9/%E8%83%8C%E6%99%AF/%E8%83%8C%E6%99%AF-18.jpg">
    
    
    <?php
        ini_set("display_errors","off");
        session_start();
        if($_SESSION["is_login"] != "true"){
            header("Location:../");
        }
        session_destroy();   
    ?>
    
    
    <div id="container">
    <font size="6" face="monospace">
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        <h1><strong><i> CGU ~ 琴友獨鍾 Piano Club</i> <br/></strong></h1><br/>
        <CENTER>
            <strong>
            <a href="https://www.facebook.com/cgupiano14/" target="_blank" style="text-decoration:none;color:#9400D3;" >✏ Facebook Club(click)</a><br/>
            <a href="https://www.youtube.com/channel/UC2bRiIKut7mST6qQQNEarQA/featured" target="_blank" style="text-decoration:none;color:#9400D3;">✏ Playful Karl youtuber(click)</a><br/>
            <a href="zaizaiPage.html" target="_self" style="text-decoration:none;color:#9400D3;">✏ go to zaizai page~(click)</a><br/><br/><br/><br/><br/>
                <form action="email.php" method="post">
                    Connect us!:<br><textarea name="Context" rows="5" cols="40"></textarea><br><br>
                    <input type="submit" value="send us email~">
                </form><br><br>
            </strong>
        </CENTER>
        
    </font>
    </div>
    

        
</body>

</html>