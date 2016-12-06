package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasMaxLongitudeIterator theConference = (ConferenceHasMaxLongitudeIterator)findAncestorWithClass(this, ConferenceHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theConference.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

