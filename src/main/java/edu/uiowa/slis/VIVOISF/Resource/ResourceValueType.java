package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceValueIterator theResourceValueIterator = (ResourceValueIterator)findAncestorWithClass(this, ResourceValueIterator.class);
			pageContext.getOut().print(theResourceValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for value tag ");
		}
		return SKIP_BODY;
	}
}

