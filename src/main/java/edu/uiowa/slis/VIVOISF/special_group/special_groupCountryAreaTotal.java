package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCountryAreaTotalIterator thespecial_group = (special_groupCountryAreaTotalIterator)findAncestorWithClass(this, special_groupCountryAreaTotalIterator.class);
			pageContext.getOut().print(thespecial_group.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

