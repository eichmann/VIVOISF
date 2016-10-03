package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Uri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Uri currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Uri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013UriIterator theIAO_0000013 = (IAO_0000013UriIterator)findAncestorWithClass(this, IAO_0000013UriIterator.class);
			pageContext.getOut().print(theIAO_0000013.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for uri tag ");
		}
		return SKIP_BODY;
	}
}

