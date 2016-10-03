package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterEditionIterator theLetter = (LetterEditionIterator)findAncestorWithClass(this, LetterEditionIterator.class);
			pageContext.getOut().print(theLetter.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for edition tag ");
		}
		return SKIP_BODY;
	}
}

