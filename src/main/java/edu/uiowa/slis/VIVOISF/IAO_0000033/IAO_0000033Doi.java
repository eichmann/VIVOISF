package edu.uiowa.slis.VIVOISF.IAO_0000033;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000033Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000033Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000033Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000033DoiIterator theIAO_0000033 = (IAO_0000033DoiIterator)findAncestorWithClass(this, IAO_0000033DoiIterator.class);
			pageContext.getOut().print(theIAO_0000033.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000033 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000033 for doi tag ");
		}
		return SKIP_BODY;
	}
}

