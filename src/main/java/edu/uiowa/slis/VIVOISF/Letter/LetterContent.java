package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterContent currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterContentIterator theLetter = (LetterContentIterator)findAncestorWithClass(this, LetterContentIterator.class);
			pageContext.getOut().print(theLetter.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for content tag ");
		}
		return SKIP_BODY;
	}
}

