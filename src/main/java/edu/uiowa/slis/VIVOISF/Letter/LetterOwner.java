package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterOwnerIterator theLetterOwnerIterator = (LetterOwnerIterator)findAncestorWithClass(this, LetterOwnerIterator.class);
			pageContext.getOut().print(theLetterOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for owner tag ");
		}
		return SKIP_BODY;
	}
}

