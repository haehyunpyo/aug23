package com.phyho.web.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phyho.web.dao.BoardDAO;
import com.phyho.web.dto.BoardDTO;
import com.phyho.web.util.Util;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private Util util;
	
	public List<BoardDTO> boardList() {
		return boardDAO.boardList();
	}

	public BoardDTO detail(int bno) {
		// 읽음수 +1하기
		boardDAO.readUP(bno);
		return boardDAO.detail(bno);
	}

	public BoardDTO detail2(int bno) {
		return boardDAO.detail2(bno);
	}
	
	public int write(BoardDTO dto) {
		// 아이피
		dto.setBip(util.getIp());
		// uuid
		dto.setUuid(UUID.randomUUID().toString());
		
		return boardDAO.write(dto);
		
	}


	
}
