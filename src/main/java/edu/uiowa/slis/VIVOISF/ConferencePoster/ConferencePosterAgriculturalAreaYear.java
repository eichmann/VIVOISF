package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAgriculturalAreaYearIterator theConferencePoster = (ConferencePosterAgriculturalAreaYearIterator)findAncestorWithClass(this, ConferencePosterAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theConferencePoster.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

