package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPageStartIterator theConferencePaper = (ConferencePaperPageStartIterator)findAncestorWithClass(this, ConferencePaperPageStartIterator.class);
			pageContext.getOut().print(theConferencePaper.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

