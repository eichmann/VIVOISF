package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNumPagesIterator theConferencePaper = (ConferencePaperNumPagesIterator)findAncestorWithClass(this, ConferencePaperNumPagesIterator.class);
			pageContext.getOut().print(theConferencePaper.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for numPages tag ");
		}
		return SKIP_BODY;
	}
}

