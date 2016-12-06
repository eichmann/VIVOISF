package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceGeographicFocusIterator theConferenceGeographicFocusIterator = (ConferenceGeographicFocusIterator)findAncestorWithClass(this, ConferenceGeographicFocusIterator.class);
			pageContext.getOut().print(theConferenceGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

