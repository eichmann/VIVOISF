package edu.uiowa.slis.VIVOISF.OBI_0500000;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0500000TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0500000TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0500000TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0500000TheAbstractIterator theOBI_0500000 = (OBI_0500000TheAbstractIterator)findAncestorWithClass(this, OBI_0500000TheAbstractIterator.class);
			pageContext.getOut().print(theOBI_0500000.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

