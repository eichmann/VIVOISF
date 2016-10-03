package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionBottomDataPropertyIterator theeconomic_region = (economic_regionBottomDataPropertyIterator)findAncestorWithClass(this, economic_regionBottomDataPropertyIterator.class);
			pageContext.getOut().print(theeconomic_region.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

