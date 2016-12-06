package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCountryAreaYearIterator thespecial_group = (special_groupCountryAreaYearIterator)findAncestorWithClass(this, special_groupCountryAreaYearIterator.class);
			pageContext.getOut().print(thespecial_group.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

