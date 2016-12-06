package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNationalityARIterator theConference = (ConferenceNationalityARIterator)findAncestorWithClass(this, ConferenceNationalityARIterator.class);
			pageContext.getOut().print(theConference.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

