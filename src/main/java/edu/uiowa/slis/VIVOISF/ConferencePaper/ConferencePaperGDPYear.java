package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperGDPYearIterator theConferencePaper = (ConferencePaperGDPYearIterator)findAncestorWithClass(this, ConferencePaperGDPYearIterator.class);
			pageContext.getOut().print(theConferencePaper.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

