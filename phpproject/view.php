<?php
include("./dbconn.php");  // DB연결을 위한 같은 경로의 dbconn.php를 인클루드합니다.
include("./nologin.php");

$number = $_GET['number'];
$query = "select title, content, date, hit, id from board where number =$number";
$result = mysqli_query($conn, $query);
$rows = mysqli_fetch_assoc($result);

if (empty($rows['title'])) {

    echo "<script>alert('삭제된 게시물 입니다.');</script>";
    echo "<script>location.replace('./board.php');</script>";
    exit;
} else {

    $imagequery = "select * from board_image where imageboardnumber = $number";
    $imageresult = mysqli_query($conn, $imagequery);
}


$commentquery = "select * from reply where board_number=$number order by id";
$commentresult = $conn->query($commentquery);
$commenttotal = mysqli_num_rows($commentresult);


?>


<!DOCTYPE>

<html>
<head>
    <meta charset='utf-8'>
    <link href="./css/view.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/jquery-ui.css"/>
    <link rel="stylesheet" type="text/css" href="/css/board.css"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/viewplus.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/comment.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.js"></script>
    <script src="js/comment.js"></script>


</head>


<body>
<table class="view_table" align=center>
    <tr>
        <td colspan="4" class="view_title">제목 : <?php echo $rows['title'] ?></td>
    </tr>
    <tr>
        <td class="view_id">작성자</td>
        <td class="view_id2"><?php echo $rows['id'] ?></td>
        <td class="view_hit">조회수</td>
        <td class="view_hit2"><?php echo $rows['hit'] ?></td>
    </tr>
    <tr>
        <td colspan="4" class="view_content" valign="top">
            <?php
            echo $rows['content'] . "<br/>";

            while ($imagerows = mysqli_fetch_assoc($imageresult)) {
                echo "<img src='./" . $imagerows['imagepath'] . "'/>" . "<br/>";
                echo $imagerows['imagecontent'] . "<br/>";
            }
            ?>

        </td>
    </tr>

</table>

<!--- 댓글 불러오기 -->
<div class="reply_view">
    <h3>댓글목록</h3>
    <?php
    while ($commentrows = mysqli_fetch_assoc($commentresult)) {
    ?>
    <div class="comment" id="comment">
        <div class="dap_lo">
            <div><b>댓글 작성자 : <?php echo $commentrows['mb_id'];
                    if( $commentrows['mb_id']==$rows['id']){
                        echo "(게시물 작성자)";
                    }?></b></div>
            <div class="dap_to comt_edit">내용 : <?php echo $commentrows['content']; ?></div>
            <div class="rep_me dap_to"><?php echo $commentrows['date']; ?></div>


            <?php
            if ($_SESSION['mb_id'] == $commentrows['mb_id']) {
                ?>
                <div class="rep_me rep_menu">
                    <a class="dat_edit_bt" href="#rep_me rep_menu">수정</a>
                    <a class="dat_delete_bt" href="#rep_me rep_menu">삭제</a>
                    <a class="dat_plus_bt" href="#rep_me rep_menu">답글</a>



                <?php
                $recommentid = $commentrows['id'];
                $requery = "select * from re_reply where board_number=$number AND reply_number=$recommentid order by id";

                $result = mysqli_query($conn, $requery);

                if (mysqli_num_rows($result) > 0) { ?>
                    <a class="dat_viewplus_bt""> 답글보기</a>
               <?php } ?>



                </div>
                <!-- 댓글 수정 폼 dialog -->
                <div class="dat_edit">
                    <form method="post" action="comment_update.php">
                        <input type="hidden" name="boardnumber" class="bno" value="<?php echo $number; ?>">
                        <input type="hidden" name="commentnumber" value="<?php echo $commentrows['id']; ?>"/>
                        <input type="text" name="mb_id" class="dap_sm" readonly
                               value="<?php echo $commentrows['mb_id']; ?>"/>
                        <textarea name="content"
                                  class="dap_edit_t"><?php echo $commentrows['content']; ?></textarea>
                        <input type="submit" value="수정하기" class="re_mo_bt">
                    </form>
                </div>
                <div class='dat_delete'>
                    <form action="reply_delete.php" method="post">
                        <div align="center">정말로 삭제하시겠습니까?</div>
                        <div align="center">
                            <input type="submit" value="확인">
                        </div>
                    </form>
                </div>
                <div class="dat_reply">
                    <form method="post" action="re_comment_ok.php">
                        <input type="hidden" name="boardnumber" class="bno" value="<?php echo $number; ?>">
                        <input type="hidden" name="commentnumber" value="<?php echo $commentrows['id']; ?>"/>
                        <input type="text" name="mb_id" class="dap_sm" readonly
                               value="<?php echo $_SESSION[mb_id]; ?>"/>
                        <textarea name="content" class="dap_edit_t"></textarea>
                        <input type="submit" value="답글쓰기" class="re_mo_bt">
                    </form>
                </div>
            <?php } else {
                ?>

                <div class="rep_me2 rep_menu">
                    <a class="dat_plus_bt" href="#rep_me rep_menu">답글</a>
                    <?php
                    $recommentid = $commentrows['id'];
                    $requery = "select * from re_reply where board_number=$number AND reply_number=$recommentid order by id";

                    $result = mysqli_query($conn, $requery);

                    if (mysqli_num_rows($result) > 0) { ?>
                        <a class="dat_viewplus_bt""> 답글보기</a>
                    <?php } ?>
                </div>
                <div class="dat_reply">
                    <form method="post" action="re_comment_ok.php">
                        <input type="hidden" name="boardnumber" class="bno" value="<?php echo $number; ?>">
                        <input type="hidden" name="commentnumber" value="<?php echo $commentrows['id']; ?>"/>
                        <input type="text" name="mb_id" class="dap_sm" readonly
                               value="<?php echo $_SESSION[mb_id]; ?>"/>
                        <textarea name="content" class="dap_edit_t"></textarea>
                        <input type="submit" value="답글쓰기" class="re_mo_bt">

                    </form>
                </div>
            <?php } ?>

            <!--        답글이 들어가는곳 수정해야함-->
            <div id="recomment" class="recomment" style="display: none">
                <?php
                $commentid = $commentrows['id'];
                $recommentquery = "select * from re_reply where board_number=$number AND reply_number=$commentid order by id";
                $recommentresult = $conn->query($recommentquery);
                while ($recommentrows = mysqli_fetch_assoc($recommentresult)) {
                    ?>

                    <div id="dap_lo2" class="dap_lo2" style="margin-left: 100px">
                        <div><b>→답글 작성자 : <?php echo $recommentrows['mb_id'];
                        if($recommentrows['mb_id']==$rows['id']){
                            echo "(게시물 작성자)";
                        }


                        ?></b></div>
                        <div class="dap_to comt_edit">내용 : <?php echo $recommentrows['content']; ?></div>
                        <div class="rep_me dap_to"><?php echo $recommentrows['date']; ?></div>
                        <?php
                        if ($_SESSION['mb_id'] == $recommentrows['mb_id']) {
                            ?>
                            <div class="rep_me2 rep_menu">
                                <a class="dat_edit_bt2">수정</a>
                                <a class="dat_delete_bt2">삭제</a>
                            </div>
                            <!-- 댓글 수정 폼 dialog -->
                            <div class="dat_edit2">
                                <form method="post" action="re_comment_update.php">
                                    <input type="hidden" name="boardnumber" class="bno" value="<?php echo $number; ?>">
                                    <input type="hidden" name="commentnumber"
                                           value="<?php echo $recommentrows['id']; ?>"/>
                                    <input type="text" name="mb_id" class="dap_sm" readonly
                                           value="<?php echo $recommentrows['mb_id']; ?>"/>
                                    <textarea name="content"
                                              class="dap_edit_t"><?php echo $recommentrows['content']; ?></textarea>
                                    <input type="submit" value="수정하기" class="re_mo_bt">
                                </form>
                            </div>
                            <div class='dat_delete2'>
                                <form action="reply_delete.php" method="post">
                                    <div align="center">정말로 삭제하시겠습니까?</div>
                                    <div align="center">
                                        <input type="submit" value="확인">
                                    </div>
                                </form>
                            </div>

                        <?php } ?>
                    </div>

                <?php } ?>

            </div>
        </div>
        <!--답글여기까지-->
        <?php } ?>
    </div>
</div>
<!--- 댓글 입력 폼 -->
<div id="dap_ins">
    <div id="comment-count">댓글 <span id="count">0</span></div>
    <form method="post" action="comment_ok.php">
        <input type="hidden" name="boardnumber" class="bno" value="<?php echo $number; ?>">
        <input type="hidden" name="mb_id" id="dat_user" class="dat_user" value="<?php echo $_SESSION[mb_id] ?>">
        <input type="hidden" name="commentnumber" value="<?php echo $commentrows['id']; ?>"/>
        <input name="content" class="reply_content" id="re_content" placeholder="댓글을 입력해 주세요.">
        <button id="rep_bt" class="re_bt">등록</button>
    </form>
</div>


<!-- MODIFY & DELETE -->
<div class="view_btn">
    <button class="view_btn1" onclick="location.href='./board.php'">목록으로</button>

    <?php
        if($_SESSION['mb_id']==$rows['id']){
    ?>
    <button class="view_btn1"
            onclick="location.href='./boardmodify.php?number=<?= $number ?>&id=<?= $_SESSION['mb_id'] ?>'">수정
    </button>

    <button class="view_btn1"
            onclick="location.href='./boarddelete.php?number=<?= $number ?>'">삭제
    </button>
    <?php
    }
    ?>
</div>


</body>
</html>








