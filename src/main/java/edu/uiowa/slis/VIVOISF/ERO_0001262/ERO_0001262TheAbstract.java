package edu.uiowa.slis.VIVOISF.ERO_0001262;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001262TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001262TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001262TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001262TheAbstractIterator theERO_0001262 = (ERO_0001262TheAbstractIterator)findAncestorWithClass(this, ERO_0001262TheAbstractIterator.class);
			pageContext.getOut().print(theERO_0001262.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

