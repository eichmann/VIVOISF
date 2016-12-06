package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionLandAreaTotalIterator theeconomic_region = (economic_regionLandAreaTotalIterator)findAncestorWithClass(this, economic_regionLandAreaTotalIterator.class);
			pageContext.getOut().print(theeconomic_region.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

