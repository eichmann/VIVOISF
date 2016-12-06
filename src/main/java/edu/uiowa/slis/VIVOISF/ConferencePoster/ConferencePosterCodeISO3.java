package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeISO3Iterator theConferencePoster = (ConferencePosterCodeISO3Iterator)findAncestorWithClass(this, ConferencePosterCodeISO3Iterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

