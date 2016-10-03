package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterOwnerIterator theLetterOwnerIterator = (LetterOwnerIterator)findAncestorWithClass(this, LetterOwnerIterator.class);
			pageContext.getOut().print(theLetterOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for owner tag ");
		}
		return SKIP_BODY;
	}
}

