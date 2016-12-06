package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNationalityFRIterator theConference = (ConferenceNationalityFRIterator)findAncestorWithClass(this, ConferenceNationalityFRIterator.class);
			pageContext.getOut().print(theConference.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

