package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554TheAbstractIterator theOBI_0001554 = (OBI_0001554TheAbstractIterator)findAncestorWithClass(this, OBI_0001554TheAbstractIterator.class);
			pageContext.getOut().print(theOBI_0001554.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

