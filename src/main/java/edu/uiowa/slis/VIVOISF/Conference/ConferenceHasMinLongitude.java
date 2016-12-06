package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasMinLongitudeIterator theConference = (ConferenceHasMinLongitudeIterator)findAncestorWithClass(this, ConferenceHasMinLongitudeIterator.class);
			pageContext.getOut().print(theConference.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

