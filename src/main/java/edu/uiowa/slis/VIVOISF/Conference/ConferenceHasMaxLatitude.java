package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasMaxLatitudeIterator theConference = (ConferenceHasMaxLatitudeIterator)findAncestorWithClass(this, ConferenceHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theConference.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

