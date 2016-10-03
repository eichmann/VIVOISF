package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterCodenIterator theLetter = (LetterCodenIterator)findAncestorWithClass(this, LetterCodenIterator.class);
			pageContext.getOut().print(theLetter.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for coden tag ");
		}
		return SKIP_BODY;
	}
}

