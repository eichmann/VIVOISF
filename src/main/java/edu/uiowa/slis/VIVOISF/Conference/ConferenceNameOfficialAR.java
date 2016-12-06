package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialARIterator theConference = (ConferenceNameOfficialARIterator)findAncestorWithClass(this, ConferenceNameOfficialARIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

