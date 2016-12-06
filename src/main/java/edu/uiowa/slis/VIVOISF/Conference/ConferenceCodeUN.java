package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeUNIterator theConference = (ConferenceCodeUNIterator)findAncestorWithClass(this, ConferenceCodeUNIterator.class);
			pageContext.getOut().print(theConference.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

