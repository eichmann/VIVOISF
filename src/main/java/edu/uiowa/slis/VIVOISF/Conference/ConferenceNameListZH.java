package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameListZHIterator theConference = (ConferenceNameListZHIterator)findAncestorWithClass(this, ConferenceNameListZHIterator.class);
			pageContext.getOut().print(theConference.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

