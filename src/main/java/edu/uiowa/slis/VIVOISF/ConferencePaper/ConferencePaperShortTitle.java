package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperShortTitleIterator theConferencePaper = (ConferencePaperShortTitleIterator)findAncestorWithClass(this, ConferencePaperShortTitleIterator.class);
			pageContext.getOut().print(theConferencePaper.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

