package edu.uiowa.slis.VIVOISF.Nickname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NicknameHasNicknameInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NicknameHasNicknameInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NicknameHasNicknameInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NicknameHasNicknameInverseIterator theNicknameHasNicknameInverseIterator = (NicknameHasNicknameInverseIterator)findAncestorWithClass(this, NicknameHasNicknameInverseIterator.class);
			pageContext.getOut().print(theNicknameHasNicknameInverseIterator.getHasNicknameInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for hasNickname tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for hasNickname tag ");
		}
		return SKIP_BODY;
	}
}

