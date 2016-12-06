package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCountryAreaUnitIterator thegroup = (groupCountryAreaUnitIterator)findAncestorWithClass(this, groupCountryAreaUnitIterator.class);
			pageContext.getOut().print(thegroup.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing group for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

