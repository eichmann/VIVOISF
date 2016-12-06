package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHDITotalIterator theConference = (ConferenceHDITotalIterator)findAncestorWithClass(this, ConferenceHDITotalIterator.class);
			pageContext.getOut().print(theConference.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

