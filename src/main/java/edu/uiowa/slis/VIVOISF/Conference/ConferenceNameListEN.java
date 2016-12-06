package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameListENIterator theConference = (ConferenceNameListENIterator)findAncestorWithClass(this, ConferenceNameListENIterator.class);
			pageContext.getOut().print(theConference.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

