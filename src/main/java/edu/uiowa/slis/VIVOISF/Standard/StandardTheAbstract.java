package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardTheAbstractIterator theStandard = (StandardTheAbstractIterator)findAncestorWithClass(this, StandardTheAbstractIterator.class);
			pageContext.getOut().print(theStandard.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

