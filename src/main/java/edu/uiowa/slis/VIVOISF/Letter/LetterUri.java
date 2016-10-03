package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterUri currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterUriIterator theLetter = (LetterUriIterator)findAncestorWithClass(this, LetterUriIterator.class);
			pageContext.getOut().print(theLetter.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for uri tag ");
		}
		return SKIP_BODY;
	}
}

