package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameShortRUIterator theConference = (ConferenceNameShortRUIterator)findAncestorWithClass(this, ConferenceNameShortRUIterator.class);
			pageContext.getOut().print(theConference.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

