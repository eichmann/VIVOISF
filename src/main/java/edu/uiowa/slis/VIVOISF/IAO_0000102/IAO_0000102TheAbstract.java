package edu.uiowa.slis.VIVOISF.IAO_0000102;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000102TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000102TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000102TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000102TheAbstractIterator theIAO_0000102 = (IAO_0000102TheAbstractIterator)findAncestorWithClass(this, IAO_0000102TheAbstractIterator.class);
			pageContext.getOut().print(theIAO_0000102.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000102 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000102 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

