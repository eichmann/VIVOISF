package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRelatesIterator theConferencePaperRelatesIterator = (ConferencePaperRelatesIterator)findAncestorWithClass(this, ConferencePaperRelatesIterator.class);
			pageContext.getOut().print(theConferencePaperRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for relates tag ");
		}
		return SKIP_BODY;
	}
}

