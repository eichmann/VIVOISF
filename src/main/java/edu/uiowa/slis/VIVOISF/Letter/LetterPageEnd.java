package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterPageEndIterator theLetter = (LetterPageEndIterator)findAncestorWithClass(this, LetterPageEndIterator.class);
			pageContext.getOut().print(theLetter.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

