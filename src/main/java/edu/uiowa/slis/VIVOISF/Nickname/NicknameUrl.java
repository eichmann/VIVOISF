package edu.uiowa.slis.VIVOISF.Nickname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NicknameUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NicknameUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(NicknameUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NicknameUrlIterator theNickname = (NicknameUrlIterator)findAncestorWithClass(this, NicknameUrlIterator.class);
			pageContext.getOut().print(theNickname.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for url tag ");
		}
		return SKIP_BODY;
	}
}

