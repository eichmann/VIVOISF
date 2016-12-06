package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityESIterator theeconomic_region = (economic_regionNationalityESIterator)findAncestorWithClass(this, economic_regionNationalityESIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

