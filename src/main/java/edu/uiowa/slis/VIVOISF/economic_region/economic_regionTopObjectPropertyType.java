package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionTopObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionTopObjectPropertyIterator theeconomic_regionTopObjectPropertyIterator = (economic_regionTopObjectPropertyIterator)findAncestorWithClass(this, economic_regionTopObjectPropertyIterator.class);
			pageContext.getOut().print(theeconomic_regionTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

