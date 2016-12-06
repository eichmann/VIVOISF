package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceAgriculturalAreaYearIterator theConference = (ConferenceAgriculturalAreaYearIterator)findAncestorWithClass(this, ConferenceAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theConference.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

