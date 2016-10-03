package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterShortDescriptionIterator theLetter = (LetterShortDescriptionIterator)findAncestorWithClass(this, LetterShortDescriptionIterator.class);
			pageContext.getOut().print(theLetter.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

