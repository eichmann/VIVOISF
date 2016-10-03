package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterPagesIterator theLetter = (LetterPagesIterator)findAncestorWithClass(this, LetterPagesIterator.class);
			pageContext.getOut().print(theLetter.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for pages tag ");
		}
		return SKIP_BODY;
	}
}

