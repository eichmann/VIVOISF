package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionSameAsIterator theeconomic_region = (economic_regionSameAsIterator)findAncestorWithClass(this, economic_regionSameAsIterator.class);
			pageContext.getOut().print(theeconomic_region.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

