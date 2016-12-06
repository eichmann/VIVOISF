package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCountryAreaYearIterator theConferencePoster = (ConferencePosterCountryAreaYearIterator)findAncestorWithClass(this, ConferencePosterCountryAreaYearIterator.class);
			pageContext.getOut().print(theConferencePoster.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

