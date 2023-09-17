package com.spring.seminar4.controller;

import com.spring.seminar4.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@Controller
public class RestBoardController {

    @Autowired
    private BoardService boardService;

    /**
     * 메인화면 get
     * @param
     * @return main
     */
    @GetMapping("/main")
    public String boardMain() {

//        Pageable

        return "main";
    }

    /**
     * 글 보기 get
     * @param
     * @return detail
     */
    @GetMapping("/detail")
    public String boardDetail() {
        return "detail";
    }

    /**
     * 글 작성화면 get
     * @param
     * @return board/form
     */
    @GetMapping("/form")
    public String boardForm() {
        return "form";
    }

    /**
     * 글 작성 post
     * @param
     * @return
     */

    /**
     * 글 수정 post
     * @param
     * @return
     */

    /**
     * 글 삭제 post
     * @param
     * @return
     */

    /**
     * 페이지네이션 post
     * @param
     * @return
     */

}
