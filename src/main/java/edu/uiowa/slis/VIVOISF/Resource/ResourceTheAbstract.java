package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResourceTheAbstractIterator theResource = (ResourceTheAbstractIterator)findAncestorWithClass(this, ResourceTheAbstractIterator.class);
			pageContext.getOut().print(theResource.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

