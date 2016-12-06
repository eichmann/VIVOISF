package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameListITIterator theConference = (ConferenceNameListITIterator)findAncestorWithClass(this, ConferenceNameListITIterator.class);
			pageContext.getOut().print(theConference.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

