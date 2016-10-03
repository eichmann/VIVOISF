package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceValueInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceValueInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceValueInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceValueInverseIterator theResourceValueInverseIterator = (ResourceValueInverseIterator)findAncestorWithClass(this, ResourceValueInverseIterator.class);
			pageContext.getOut().print(theResourceValueInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for value tag ");
		}
		return SKIP_BODY;
	}
}

