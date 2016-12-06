package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasEmailIterator theConferenceHasEmailIterator = (ConferenceHasEmailIterator)findAncestorWithClass(this, ConferenceHasEmailIterator.class);
			pageContext.getOut().print(theConferenceHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}
