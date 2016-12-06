package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionPublisherIterator theeconomic_regionPublisherIterator = (economic_regionPublisherIterator)findAncestorWithClass(this, economic_regionPublisherIterator.class);
			pageContext.getOut().print(theeconomic_regionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for publisher tag ");
		}
		return SKIP_BODY;
	}
}

