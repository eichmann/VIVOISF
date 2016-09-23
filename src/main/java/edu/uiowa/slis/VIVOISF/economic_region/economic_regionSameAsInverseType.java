package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSameAsInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSameAsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSameAsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionSameAsInverseIterator theeconomic_regionSameAsInverseIterator = (economic_regionSameAsInverseIterator)findAncestorWithClass(this, economic_regionSameAsInverseIterator.class);
			pageContext.getOut().print(theeconomic_regionSameAsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

