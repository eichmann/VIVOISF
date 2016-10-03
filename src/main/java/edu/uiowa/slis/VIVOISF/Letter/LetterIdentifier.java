package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterIdentifierIterator theLetter = (LetterIdentifierIterator)findAncestorWithClass(this, LetterIdentifierIterator.class);
			pageContext.getOut().print(theLetter.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for identifier tag ");
		}
		return SKIP_BODY;
	}
}

