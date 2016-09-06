package edu.uiowa.slis.VIVOISF.ERO_0001262;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001262Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001262Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001262Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001262DoiIterator theERO_0001262 = (ERO_0001262DoiIterator)findAncestorWithClass(this, ERO_0001262DoiIterator.class);
			pageContext.getOut().print(theERO_0001262.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for doi tag ");
		}
		return SKIP_BODY;
	}
}

