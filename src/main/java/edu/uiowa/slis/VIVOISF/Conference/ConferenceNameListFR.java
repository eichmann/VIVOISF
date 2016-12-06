package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameListFRIterator theConference = (ConferenceNameListFRIterator)findAncestorWithClass(this, ConferenceNameListFRIterator.class);
			pageContext.getOut().print(theConference.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

