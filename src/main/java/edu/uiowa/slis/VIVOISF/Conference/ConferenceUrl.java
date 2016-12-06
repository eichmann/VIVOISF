package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceUrlIterator theConference = (ConferenceUrlIterator)findAncestorWithClass(this, ConferenceUrlIterator.class);
			pageContext.getOut().print(theConference.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for url tag ");
		}
		return SKIP_BODY;
	}
}

