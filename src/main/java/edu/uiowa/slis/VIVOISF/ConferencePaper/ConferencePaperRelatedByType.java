package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperRelatedByIterator theConferencePaperRelatedByIterator = (ConferencePaperRelatedByIterator)findAncestorWithClass(this, ConferencePaperRelatedByIterator.class);
			pageContext.getOut().print(theConferencePaperRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

