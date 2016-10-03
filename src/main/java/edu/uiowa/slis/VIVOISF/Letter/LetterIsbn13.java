package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterIsbn13Iterator theLetter = (LetterIsbn13Iterator)findAncestorWithClass(this, LetterIsbn13Iterator.class);
			pageContext.getOut().print(theLetter.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

