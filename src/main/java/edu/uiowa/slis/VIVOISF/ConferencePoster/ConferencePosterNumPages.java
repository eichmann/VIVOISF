package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNumPagesIterator theConferencePoster = (ConferencePosterNumPagesIterator)findAncestorWithClass(this, ConferencePosterNumPagesIterator.class);
			pageContext.getOut().print(theConferencePoster.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for numPages tag ");
		}
		return SKIP_BODY;
	}
}

