package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCountryAreaYearIterator theSelf_governing = (Self_governingCountryAreaYearIterator)findAncestorWithClass(this, Self_governingCountryAreaYearIterator.class);
			pageContext.getOut().print(theSelf_governing.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

