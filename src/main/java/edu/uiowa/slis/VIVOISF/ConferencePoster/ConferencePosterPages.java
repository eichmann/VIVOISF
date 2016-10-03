package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPagesIterator theConferencePoster = (ConferencePosterPagesIterator)findAncestorWithClass(this, ConferencePosterPagesIterator.class);
			pageContext.getOut().print(theConferencePoster.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for pages tag ");
		}
		return SKIP_BODY;
	}
}

