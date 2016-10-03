package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperSectionIterator theConferencePaper = (ConferencePaperSectionIterator)findAncestorWithClass(this, ConferencePaperSectionIterator.class);
			pageContext.getOut().print(theConferencePaper.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for section tag ");
		}
		return SKIP_BODY;
	}
}

