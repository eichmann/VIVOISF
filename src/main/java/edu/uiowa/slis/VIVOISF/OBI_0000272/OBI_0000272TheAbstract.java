package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272TheAbstractIterator theOBI_0000272 = (OBI_0000272TheAbstractIterator)findAncestorWithClass(this, OBI_0000272TheAbstractIterator.class);
			pageContext.getOut().print(theOBI_0000272.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

