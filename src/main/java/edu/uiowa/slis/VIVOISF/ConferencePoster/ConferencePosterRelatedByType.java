package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRelatedByIterator theConferencePosterRelatedByIterator = (ConferencePosterRelatedByIterator)findAncestorWithClass(this, ConferencePosterRelatedByIterator.class);
			pageContext.getOut().print(theConferencePosterRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

