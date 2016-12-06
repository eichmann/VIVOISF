package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003HasNameIterator theIAO_0000003HasNameIterator = (IAO_0000003HasNameIterator)findAncestorWithClass(this, IAO_0000003HasNameIterator.class);
			pageContext.getOut().print(theIAO_0000003HasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

