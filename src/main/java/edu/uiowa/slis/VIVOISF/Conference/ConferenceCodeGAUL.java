package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeGAULIterator theConference = (ConferenceCodeGAULIterator)findAncestorWithClass(this, ConferenceCodeGAULIterator.class);
			pageContext.getOut().print(theConference.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

