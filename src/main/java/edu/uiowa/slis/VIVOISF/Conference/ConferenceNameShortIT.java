package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameShortITIterator theConference = (ConferenceNameShortITIterator)findAncestorWithClass(this, ConferenceNameShortITIterator.class);
			pageContext.getOut().print(theConference.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

