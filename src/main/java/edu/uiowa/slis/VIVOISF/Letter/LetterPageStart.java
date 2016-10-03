package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterPageStartIterator theLetter = (LetterPageStartIterator)findAncestorWithClass(this, LetterPageStartIterator.class);
			pageContext.getOut().print(theLetter.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

