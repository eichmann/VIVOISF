package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameOfficialENIterator theConference = (ConferenceNameOfficialENIterator)findAncestorWithClass(this, ConferenceNameOfficialENIterator.class);
			pageContext.getOut().print(theConference.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

