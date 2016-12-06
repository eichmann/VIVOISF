package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceGDPYearIterator theConference = (ConferenceGDPYearIterator)findAncestorWithClass(this, ConferenceGDPYearIterator.class);
			pageContext.getOut().print(theConference.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

