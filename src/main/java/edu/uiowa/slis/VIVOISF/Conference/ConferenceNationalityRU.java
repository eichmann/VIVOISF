package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNationalityRUIterator theConference = (ConferenceNationalityRUIterator)findAncestorWithClass(this, ConferenceNationalityRUIterator.class);
			pageContext.getOut().print(theConference.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

