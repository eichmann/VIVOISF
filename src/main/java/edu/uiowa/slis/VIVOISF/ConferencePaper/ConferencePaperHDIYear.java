package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHDIYearIterator theConferencePaper = (ConferencePaperHDIYearIterator)findAncestorWithClass(this, ConferencePaperHDIYearIterator.class);
			pageContext.getOut().print(theConferencePaper.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

