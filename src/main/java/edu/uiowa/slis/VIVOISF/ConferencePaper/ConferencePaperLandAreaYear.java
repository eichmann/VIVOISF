package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperLandAreaYearIterator theConferencePaper = (ConferencePaperLandAreaYearIterator)findAncestorWithClass(this, ConferencePaperLandAreaYearIterator.class);
			pageContext.getOut().print(theConferencePaper.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

