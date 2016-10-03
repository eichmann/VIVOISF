package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterNumPagesIterator theLetter = (LetterNumPagesIterator)findAncestorWithClass(this, LetterNumPagesIterator.class);
			pageContext.getOut().print(theLetter.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for numPages tag ");
		}
		return SKIP_BODY;
	}
}

