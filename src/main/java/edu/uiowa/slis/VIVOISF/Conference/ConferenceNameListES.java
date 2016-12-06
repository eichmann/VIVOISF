package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameListESIterator theConference = (ConferenceNameListESIterator)findAncestorWithClass(this, ConferenceNameListESIterator.class);
			pageContext.getOut().print(theConference.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

