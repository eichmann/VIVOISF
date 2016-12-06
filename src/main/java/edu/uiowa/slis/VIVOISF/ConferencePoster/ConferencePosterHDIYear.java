package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHDIYearIterator theConferencePoster = (ConferencePosterHDIYearIterator)findAncestorWithClass(this, ConferencePosterHDIYearIterator.class);
			pageContext.getOut().print(theConferencePoster.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

