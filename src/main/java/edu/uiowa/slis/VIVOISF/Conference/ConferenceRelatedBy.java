package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRelatedByIterator theConferenceRelatedByIterator = (ConferenceRelatedByIterator)findAncestorWithClass(this, ConferenceRelatedByIterator.class);
			pageContext.getOut().print(theConferenceRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

