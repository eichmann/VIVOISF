package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCountryAreaYearIterator theConferencePaper = (ConferencePaperCountryAreaYearIterator)findAncestorWithClass(this, ConferencePaperCountryAreaYearIterator.class);
			pageContext.getOut().print(theConferencePaper.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

