package edu.uiowa.slis.VIVOISF.ERO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000005Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000005Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000005Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000005DoiIterator theERO_0000005 = (ERO_0000005DoiIterator)findAncestorWithClass(this, ERO_0000005DoiIterator.class);
			pageContext.getOut().print(theERO_0000005.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000005 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000005 for doi tag ");
		}
		return SKIP_BODY;
	}
}

