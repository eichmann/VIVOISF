package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityARIterator theeconomic_region = (economic_regionNationalityARIterator)findAncestorWithClass(this, economic_regionNationalityARIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

