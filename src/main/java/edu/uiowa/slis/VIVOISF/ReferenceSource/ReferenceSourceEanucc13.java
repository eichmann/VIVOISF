package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceEanucc13Iterator theReferenceSource = (ReferenceSourceEanucc13Iterator)findAncestorWithClass(this, ReferenceSourceEanucc13Iterator.class);
			pageContext.getOut().print(theReferenceSource.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

