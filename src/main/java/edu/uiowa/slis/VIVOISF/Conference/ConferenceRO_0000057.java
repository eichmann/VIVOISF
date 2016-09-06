package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRO_0000057Iterator theConferenceRO_0000057Iterator = (ConferenceRO_0000057Iterator)findAncestorWithClass(this, ConferenceRO_0000057Iterator.class);
			pageContext.getOut().print(theConferenceRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

