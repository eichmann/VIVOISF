package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceAnnotatesInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceAnnotatesInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceAnnotatesInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceAnnotatesInverseIterator theResourceAnnotatesInverseIterator = (ResourceAnnotatesInverseIterator)findAncestorWithClass(this, ResourceAnnotatesInverseIterator.class);
			pageContext.getOut().print(theResourceAnnotatesInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for annotates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for annotates tag ");
		}
		return SKIP_BODY;
	}
}

