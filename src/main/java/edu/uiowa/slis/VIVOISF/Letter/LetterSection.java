package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterSection currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterSectionIterator theLetter = (LetterSectionIterator)findAncestorWithClass(this, LetterSectionIterator.class);
			pageContext.getOut().print(theLetter.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for section tag ");
		}
		return SKIP_BODY;
	}
}

