package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterStatusIterator theLetterStatusIterator = (LetterStatusIterator)findAncestorWithClass(this, LetterStatusIterator.class);
			pageContext.getOut().print(theLetterStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for status tag ");
		}
		return SKIP_BODY;
	}
}

