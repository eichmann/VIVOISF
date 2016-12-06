package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeISO2Iterator theConferencePoster = (ConferencePosterCodeISO2Iterator)findAncestorWithClass(this, ConferencePosterCodeISO2Iterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

