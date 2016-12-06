package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityENIterator theeconomic_region = (economic_regionNationalityENIterator)findAncestorWithClass(this, economic_regionNationalityENIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

