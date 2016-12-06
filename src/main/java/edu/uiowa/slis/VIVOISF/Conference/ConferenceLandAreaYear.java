package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceLandAreaYearIterator theConference = (ConferenceLandAreaYearIterator)findAncestorWithClass(this, ConferenceLandAreaYearIterator.class);
			pageContext.getOut().print(theConference.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

