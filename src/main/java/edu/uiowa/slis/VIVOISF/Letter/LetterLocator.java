package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterLocatorIterator theLetter = (LetterLocatorIterator)findAncestorWithClass(this, LetterLocatorIterator.class);
			pageContext.getOut().print(theLetter.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for locator tag ");
		}
		return SKIP_BODY;
	}
}

