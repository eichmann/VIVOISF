package edu.uiowa.slis.VIVOISF.Nickname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NicknameRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NicknameRank currentInstance = null;
	private static final Log log = LogFactory.getLog(NicknameRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NicknameRankIterator theNickname = (NicknameRankIterator)findAncestorWithClass(this, NicknameRankIterator.class);
			pageContext.getOut().print(theNickname.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for rank tag ");
		}
		return SKIP_BODY;
	}
}

