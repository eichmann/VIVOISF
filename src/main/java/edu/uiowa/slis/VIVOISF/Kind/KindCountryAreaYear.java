package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCountryAreaYearIterator theKind = (KindCountryAreaYearIterator)findAncestorWithClass(this, KindCountryAreaYearIterator.class);
			pageContext.getOut().print(theKind.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

