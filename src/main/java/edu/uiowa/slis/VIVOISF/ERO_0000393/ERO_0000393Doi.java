package edu.uiowa.slis.VIVOISF.ERO_0000393;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000393Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000393Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000393Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000393DoiIterator theERO_0000393 = (ERO_0000393DoiIterator)findAncestorWithClass(this, ERO_0000393DoiIterator.class);
			pageContext.getOut().print(theERO_0000393.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000393 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000393 for doi tag ");
		}
		return SKIP_BODY;
	}
}

