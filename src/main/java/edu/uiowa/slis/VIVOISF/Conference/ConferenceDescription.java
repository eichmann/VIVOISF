package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceDescriptionIterator theConference = (ConferenceDescriptionIterator)findAncestorWithClass(this, ConferenceDescriptionIterator.class);
			pageContext.getOut().print(theConference.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for description tag ");
		}
		return SKIP_BODY;
	}
}

