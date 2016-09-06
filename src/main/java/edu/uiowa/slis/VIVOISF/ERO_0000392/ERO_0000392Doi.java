package edu.uiowa.slis.VIVOISF.ERO_0000392;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000392Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000392Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000392Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000392DoiIterator theERO_0000392 = (ERO_0000392DoiIterator)findAncestorWithClass(this, ERO_0000392DoiIterator.class);
			pageContext.getOut().print(theERO_0000392.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000392 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000392 for doi tag ");
		}
		return SKIP_BODY;
	}
}

