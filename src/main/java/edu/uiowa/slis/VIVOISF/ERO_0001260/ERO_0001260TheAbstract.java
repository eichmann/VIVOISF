package edu.uiowa.slis.VIVOISF.ERO_0001260;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001260TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001260TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001260TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001260TheAbstractIterator theERO_0001260 = (ERO_0001260TheAbstractIterator)findAncestorWithClass(this, ERO_0001260TheAbstractIterator.class);
			pageContext.getOut().print(theERO_0001260.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001260 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001260 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

