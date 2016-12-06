package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCountryAreaTotalIterator thegroup = (groupCountryAreaTotalIterator)findAncestorWithClass(this, groupCountryAreaTotalIterator.class);
			pageContext.getOut().print(thegroup.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing group for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

