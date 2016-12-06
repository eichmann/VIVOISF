package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialESIterator theConference = (ConferenceNameOfficialESIterator)findAncestorWithClass(this, ConferenceNameOfficialESIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

