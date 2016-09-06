package edu.uiowa.slis.VIVOISF.ERO_0001257;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001257TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001257TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001257TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001257TheAbstractIterator theERO_0001257 = (ERO_0001257TheAbstractIterator)findAncestorWithClass(this, ERO_0001257TheAbstractIterator.class);
			pageContext.getOut().print(theERO_0001257.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001257 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001257 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

