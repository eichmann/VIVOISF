package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ReviewOfIterator theIAO_0000013ReviewOfIterator = (IAO_0000013ReviewOfIterator)findAncestorWithClass(this, IAO_0000013ReviewOfIterator.class);
			pageContext.getOut().print(theIAO_0000013ReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

