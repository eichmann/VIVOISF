package edu.uiowa.slis.VIVOISF.IAO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000005Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000005Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000005Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000005DoiIterator theIAO_0000005 = (IAO_0000005DoiIterator)findAncestorWithClass(this, IAO_0000005DoiIterator.class);
			pageContext.getOut().print(theIAO_0000005.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000005 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000005 for doi tag ");
		}
		return SKIP_BODY;
	}
}

