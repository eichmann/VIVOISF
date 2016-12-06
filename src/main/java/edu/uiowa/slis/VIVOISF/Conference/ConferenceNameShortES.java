package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameShortESIterator theConference = (ConferenceNameShortESIterator)findAncestorWithClass(this, ConferenceNameShortESIterator.class);
			pageContext.getOut().print(theConference.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

