package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceRO_0002234Iterator theConferenceRO_0002234Iterator = (ConferenceRO_0002234Iterator)findAncestorWithClass(this, ConferenceRO_0002234Iterator.class);
			pageContext.getOut().print(theConferenceRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

