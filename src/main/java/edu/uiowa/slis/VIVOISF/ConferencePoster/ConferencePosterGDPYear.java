package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterGDPYearIterator theConferencePoster = (ConferencePosterGDPYearIterator)findAncestorWithClass(this, ConferencePosterGDPYearIterator.class);
			pageContext.getOut().print(theConferencePoster.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

