package edu.uiowa.slis.VIVOISF.IAO_0000027;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000027TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000027TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000027TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000027TheAbstractIterator theIAO_0000027 = (IAO_0000027TheAbstractIterator)findAncestorWithClass(this, IAO_0000027TheAbstractIterator.class);
			pageContext.getOut().print(theIAO_0000027.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000027 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000027 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

