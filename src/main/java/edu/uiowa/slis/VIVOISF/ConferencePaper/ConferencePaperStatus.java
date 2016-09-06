package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperStatusIterator theConferencePaperStatusIterator = (ConferencePaperStatusIterator)findAncestorWithClass(this, ConferencePaperStatusIterator.class);
			pageContext.getOut().print(theConferencePaperStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for status tag ");
		}
		return SKIP_BODY;
	}
}

