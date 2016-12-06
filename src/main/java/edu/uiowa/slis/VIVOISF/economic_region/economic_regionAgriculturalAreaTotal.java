package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionAgriculturalAreaTotalIterator theeconomic_region = (economic_regionAgriculturalAreaTotalIterator)findAncestorWithClass(this, economic_regionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theeconomic_region.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

