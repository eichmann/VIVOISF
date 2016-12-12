package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030TheAbstractIterator theIAO_0000030 = (IAO_0000030TheAbstractIterator)findAncestorWithClass(this, IAO_0000030TheAbstractIterator.class);
			pageContext.getOut().print(theIAO_0000030.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

