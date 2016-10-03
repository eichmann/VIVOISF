package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardEanucc13Iterator theStandard = (StandardEanucc13Iterator)findAncestorWithClass(this, StandardEanucc13Iterator.class);
			pageContext.getOut().print(theStandard.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

