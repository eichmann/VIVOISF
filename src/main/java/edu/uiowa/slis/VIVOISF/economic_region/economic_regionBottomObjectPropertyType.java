package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionBottomObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionBottomObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionBottomObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionBottomObjectPropertyIterator theeconomic_regionBottomObjectPropertyIterator = (economic_regionBottomObjectPropertyIterator)findAncestorWithClass(this, economic_regionBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theeconomic_regionBottomObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

