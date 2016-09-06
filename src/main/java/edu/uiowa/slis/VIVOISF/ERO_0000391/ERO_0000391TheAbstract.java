package edu.uiowa.slis.VIVOISF.ERO_0000391;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000391TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000391TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000391TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000391TheAbstractIterator theERO_0000391 = (ERO_0000391TheAbstractIterator)findAncestorWithClass(this, ERO_0000391TheAbstractIterator.class);
			pageContext.getOut().print(theERO_0000391.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000391 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000391 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

