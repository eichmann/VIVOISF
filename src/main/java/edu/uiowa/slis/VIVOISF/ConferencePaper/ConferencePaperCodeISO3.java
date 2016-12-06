package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeISO3Iterator theConferencePaper = (ConferencePaperCodeISO3Iterator)findAncestorWithClass(this, ConferencePaperCodeISO3Iterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

