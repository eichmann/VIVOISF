package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperDescriptionIterator theConferencePaper = (ConferencePaperDescriptionIterator)findAncestorWithClass(this, ConferencePaperDescriptionIterator.class);
			pageContext.getOut().print(theConferencePaper.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for description tag ");
		}
		return SKIP_BODY;
	}
}

