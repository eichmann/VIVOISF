package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterPmidIterator theLetter = (LetterPmidIterator)findAncestorWithClass(this, LetterPmidIterator.class);
			pageContext.getOut().print(theLetter.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for pmid tag ");
		}
		return SKIP_BODY;
	}
}

