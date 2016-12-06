package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHDIYearIterator theConference = (ConferenceHDIYearIterator)findAncestorWithClass(this, ConferenceHDIYearIterator.class);
			pageContext.getOut().print(theConference.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

