package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialRUIterator theConference = (ConferenceNameOfficialRUIterator)findAncestorWithClass(this, ConferenceNameOfficialRUIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

