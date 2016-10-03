package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionTopObjectPropertyInverseIterator theeconomic_regionTopObjectPropertyInverseIterator = (economic_regionTopObjectPropertyInverseIterator)findAncestorWithClass(this, economic_regionTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theeconomic_regionTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

