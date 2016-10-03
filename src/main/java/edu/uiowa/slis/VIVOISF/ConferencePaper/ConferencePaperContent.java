package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperContentIterator theConferencePaper = (ConferencePaperContentIterator)findAncestorWithClass(this, ConferencePaperContentIterator.class);
			pageContext.getOut().print(theConferencePaper.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for content tag ");
		}
		return SKIP_BODY;
	}
}

