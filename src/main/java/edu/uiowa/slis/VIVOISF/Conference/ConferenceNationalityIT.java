package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNationalityITIterator theConference = (ConferenceNationalityITIterator)findAncestorWithClass(this, ConferenceNationalityITIterator.class);
			pageContext.getOut().print(theConference.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

