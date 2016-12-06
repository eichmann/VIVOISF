package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasURLIterator theConferenceHasURLIterator = (ConferenceHasURLIterator)findAncestorWithClass(this, ConferenceHasURLIterator.class);
			pageContext.getOut().print(theConferenceHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

