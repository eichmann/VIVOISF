package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterShortTitleIterator theLetter = (LetterShortTitleIterator)findAncestorWithClass(this, LetterShortTitleIterator.class);
			pageContext.getOut().print(theLetter.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

