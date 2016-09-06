package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterDoiIterator theLetter = (LetterDoiIterator)findAncestorWithClass(this, LetterDoiIterator.class);
			pageContext.getOut().print(theLetter.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for doi tag ");
		}
		return SKIP_BODY;
	}
}

