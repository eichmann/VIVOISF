package edu.uiowa.slis.VIVOISF.Nickname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NicknameNickName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NicknameNickName currentInstance = null;
	private static final Log log = LogFactory.getLog(NicknameNickName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NicknameNickNameIterator theNickname = (NicknameNickNameIterator)findAncestorWithClass(this, NicknameNickNameIterator.class);
			pageContext.getOut().print(theNickname.getNickName());
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for nickName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for nickName tag ");
		}
		return SKIP_BODY;
	}
}

