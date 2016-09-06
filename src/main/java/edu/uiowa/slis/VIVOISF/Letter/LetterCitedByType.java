package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterCitedByIterator theLetterCitedByIterator = (LetterCitedByIterator)findAncestorWithClass(this, LetterCitedByIterator.class);
			pageContext.getOut().print(theLetterCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

