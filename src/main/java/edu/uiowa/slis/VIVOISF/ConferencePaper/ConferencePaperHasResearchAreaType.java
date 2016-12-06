package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasResearchAreaIterator theConferencePaperHasResearchAreaIterator = (ConferencePaperHasResearchAreaIterator)findAncestorWithClass(this, ConferencePaperHasResearchAreaIterator.class);
			pageContext.getOut().print(theConferencePaperHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

