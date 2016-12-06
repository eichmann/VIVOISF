package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityITIterator theeconomic_region = (economic_regionNationalityITIterator)findAncestorWithClass(this, economic_regionNationalityITIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

