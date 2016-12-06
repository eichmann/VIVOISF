package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRO_0002353Iterator theConferenceRO_0002353Iterator = (ConferenceRO_0002353Iterator)findAncestorWithClass(this, ConferenceRO_0002353Iterator.class);
			pageContext.getOut().print(theConferenceRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

