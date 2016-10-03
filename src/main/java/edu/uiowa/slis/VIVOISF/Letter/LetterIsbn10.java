package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterIsbn10Iterator theLetter = (LetterIsbn10Iterator)findAncestorWithClass(this, LetterIsbn10Iterator.class);
			pageContext.getOut().print(theLetter.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

