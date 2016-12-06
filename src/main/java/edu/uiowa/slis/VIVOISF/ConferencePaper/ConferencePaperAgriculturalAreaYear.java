package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAgriculturalAreaYearIterator theConferencePaper = (ConferencePaperAgriculturalAreaYearIterator)findAncestorWithClass(this, ConferencePaperAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theConferencePaper.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

