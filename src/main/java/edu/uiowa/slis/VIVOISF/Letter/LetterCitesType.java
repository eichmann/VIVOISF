package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterCitesIterator theLetterCitesIterator = (LetterCitesIterator)findAncestorWithClass(this, LetterCitesIterator.class);
			pageContext.getOut().print(theLetterCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for cites tag ");
		}
		return SKIP_BODY;
	}
}

