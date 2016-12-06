package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasMinLatitudeIterator theConference = (ConferenceHasMinLatitudeIterator)findAncestorWithClass(this, ConferenceHasMinLatitudeIterator.class);
			pageContext.getOut().print(theConference.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

