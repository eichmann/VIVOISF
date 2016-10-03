package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceValueInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceValueInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceValueInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceValueInverseIterator theResourceValueInverseIterator = (ResourceValueInverseIterator)findAncestorWithClass(this, ResourceValueInverseIterator.class);
			pageContext.getOut().print(theResourceValueInverseIterator.getValueInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for value tag ");
		}
		return SKIP_BODY;
	}
}

