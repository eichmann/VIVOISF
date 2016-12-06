package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialITIterator theConference = (ConferenceNameOfficialITIterator)findAncestorWithClass(this, ConferenceNameOfficialITIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

