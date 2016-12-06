package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameShortZHIterator theConference = (ConferenceNameShortZHIterator)findAncestorWithClass(this, ConferenceNameShortZHIterator.class);
			pageContext.getOut().print(theConference.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

