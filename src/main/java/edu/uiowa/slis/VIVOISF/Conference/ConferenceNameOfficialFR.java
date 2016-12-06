package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialFRIterator theConference = (ConferenceNameOfficialFRIterator)findAncestorWithClass(this, ConferenceNameOfficialFRIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

