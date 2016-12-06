package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameShortARIterator theConference = (ConferenceNameShortARIterator)findAncestorWithClass(this, ConferenceNameShortARIterator.class);
			pageContext.getOut().print(theConference.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

