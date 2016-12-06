package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNationalityESIterator theConference = (ConferenceNationalityESIterator)findAncestorWithClass(this, ConferenceNationalityESIterator.class);
			pageContext.getOut().print(theConference.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

