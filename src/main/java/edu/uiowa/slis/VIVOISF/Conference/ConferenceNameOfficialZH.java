package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialZHIterator theConference = (ConferenceNameOfficialZHIterator)findAncestorWithClass(this, ConferenceNameOfficialZHIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

