package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeISO2Iterator theConferencePaper = (ConferencePaperCodeISO2Iterator)findAncestorWithClass(this, ConferencePaperCodeISO2Iterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

