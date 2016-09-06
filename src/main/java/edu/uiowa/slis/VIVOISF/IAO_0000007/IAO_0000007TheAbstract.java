package edu.uiowa.slis.VIVOISF.IAO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000007TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000007TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000007TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000007TheAbstractIterator theIAO_0000007 = (IAO_0000007TheAbstractIterator)findAncestorWithClass(this, IAO_0000007TheAbstractIterator.class);
			pageContext.getOut().print(theIAO_0000007.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000007 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000007 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

