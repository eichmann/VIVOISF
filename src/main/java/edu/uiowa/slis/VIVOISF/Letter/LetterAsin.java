package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterAsinIterator theLetter = (LetterAsinIterator)findAncestorWithClass(this, LetterAsinIterator.class);
			pageContext.getOut().print(theLetter.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for asin tag ");
		}
		return SKIP_BODY;
	}
}

