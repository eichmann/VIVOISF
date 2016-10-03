package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionBottomObjectPropertyIterator theeconomic_regionBottomObjectPropertyIterator = (economic_regionBottomObjectPropertyIterator)findAncestorWithClass(this, economic_regionBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theeconomic_regionBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

