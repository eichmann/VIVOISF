package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterLandAreaYearIterator theConferencePoster = (ConferencePosterLandAreaYearIterator)findAncestorWithClass(this, ConferencePosterLandAreaYearIterator.class);
			pageContext.getOut().print(theConferencePoster.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

