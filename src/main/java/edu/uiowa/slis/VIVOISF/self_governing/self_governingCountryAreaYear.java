package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCountryAreaYearIterator theself_governing = (self_governingCountryAreaYearIterator)findAncestorWithClass(this, self_governingCountryAreaYearIterator.class);
			pageContext.getOut().print(theself_governing.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

