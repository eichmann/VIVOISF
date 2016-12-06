package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeISO2Iterator theConference = (ConferenceCodeISO2Iterator)findAncestorWithClass(this, ConferenceCodeISO2Iterator.class);
			pageContext.getOut().print(theConference.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

