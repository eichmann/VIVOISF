package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRO_0001015Iterator theConferenceRO_0001015Iterator = (ConferenceRO_0001015Iterator)findAncestorWithClass(this, ConferenceRO_0001015Iterator.class);
			pageContext.getOut().print(theConferenceRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

