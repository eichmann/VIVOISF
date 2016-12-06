package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasResearchAreaIterator theConferencePaperHasResearchAreaIterator = (ConferencePaperHasResearchAreaIterator)findAncestorWithClass(this, ConferencePaperHasResearchAreaIterator.class);
			pageContext.getOut().print(theConferencePaperHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

