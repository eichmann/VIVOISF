package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityFRIterator theeconomic_region = (economic_regionNationalityFRIterator)findAncestorWithClass(this, economic_regionNationalityFRIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

