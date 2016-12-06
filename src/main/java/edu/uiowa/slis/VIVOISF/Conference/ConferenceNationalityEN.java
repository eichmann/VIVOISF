package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNationalityENIterator theConference = (ConferenceNationalityENIterator)findAncestorWithClass(this, ConferenceNationalityENIterator.class);
			pageContext.getOut().print(theConference.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

