package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPageEndIterator theConferencePaper = (ConferencePaperPageEndIterator)findAncestorWithClass(this, ConferencePaperPageEndIterator.class);
			pageContext.getOut().print(theConferencePaper.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

