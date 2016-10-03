package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterNumberIterator theLetter = (LetterNumberIterator)findAncestorWithClass(this, LetterNumberIterator.class);
			pageContext.getOut().print(theLetter.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for number tag ");
		}
		return SKIP_BODY;
	}
}

