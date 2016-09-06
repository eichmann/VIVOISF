package edu.uiowa.slis.VIVOISF.ERO_0001258;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001258Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001258Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001258Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001258DoiIterator theERO_0001258 = (ERO_0001258DoiIterator)findAncestorWithClass(this, ERO_0001258DoiIterator.class);
			pageContext.getOut().print(theERO_0001258.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001258 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001258 for doi tag ");
		}
		return SKIP_BODY;
	}
}

