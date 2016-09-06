package edu.uiowa.slis.VIVOISF.ERO_0001716;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001716TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001716TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001716TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001716TheAbstractIterator theERO_0001716 = (ERO_0001716TheAbstractIterator)findAncestorWithClass(this, ERO_0001716TheAbstractIterator.class);
			pageContext.getOut().print(theERO_0001716.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001716 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

