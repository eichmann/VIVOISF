package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeISO3Iterator theConference = (ConferenceCodeISO3Iterator)findAncestorWithClass(this, ConferenceCodeISO3Iterator.class);
			pageContext.getOut().print(theConference.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

