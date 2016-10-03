package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPagesIterator theConferencePaper = (ConferencePaperPagesIterator)findAncestorWithClass(this, ConferencePaperPagesIterator.class);
			pageContext.getOut().print(theConferencePaper.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for pages tag ");
		}
		return SKIP_BODY;
	}
}

