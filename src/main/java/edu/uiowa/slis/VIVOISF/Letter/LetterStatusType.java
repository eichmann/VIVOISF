package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterStatusIterator theLetterStatusIterator = (LetterStatusIterator)findAncestorWithClass(this, LetterStatusIterator.class);
			pageContext.getOut().print(theLetterStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for status tag ");
		}
		return SKIP_BODY;
	}
}

