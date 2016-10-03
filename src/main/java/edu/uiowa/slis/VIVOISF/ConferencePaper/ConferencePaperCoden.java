package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodenIterator theConferencePaper = (ConferencePaperCodenIterator)findAncestorWithClass(this, ConferencePaperCodenIterator.class);
			pageContext.getOut().print(theConferencePaper.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for coden tag ");
		}
		return SKIP_BODY;
	}
}

