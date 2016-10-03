package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835DirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835DirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835DirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835DirectorInverseIterator theOBI_0000835DirectorInverseIterator = (OBI_0000835DirectorInverseIterator)findAncestorWithClass(this, OBI_0000835DirectorInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835DirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for director tag ");
		}
		return SKIP_BODY;
	}
}

