package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperShortDescriptionIterator theConferencePaper = (ConferencePaperShortDescriptionIterator)findAncestorWithClass(this, ConferencePaperShortDescriptionIterator.class);
			pageContext.getOut().print(theConferencePaper.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

