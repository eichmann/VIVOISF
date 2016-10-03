package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperGtin14Iterator theConferencePaper = (ConferencePaperGtin14Iterator)findAncestorWithClass(this, ConferencePaperGtin14Iterator.class);
			pageContext.getOut().print(theConferencePaper.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

