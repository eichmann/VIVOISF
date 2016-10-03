package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterGtin14Iterator theLetter = (LetterGtin14Iterator)findAncestorWithClass(this, LetterGtin14Iterator.class);
			pageContext.getOut().print(theLetter.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

