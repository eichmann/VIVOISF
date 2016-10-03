package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterUpcIterator theLetter = (LetterUpcIterator)findAncestorWithClass(this, LetterUpcIterator.class);
			pageContext.getOut().print(theLetter.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for upc tag ");
		}
		return SKIP_BODY;
	}
}

