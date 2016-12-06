package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCountryAreaYearIterator thegroup = (groupCountryAreaYearIterator)findAncestorWithClass(this, groupCountryAreaYearIterator.class);
			pageContext.getOut().print(thegroup.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing group for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

