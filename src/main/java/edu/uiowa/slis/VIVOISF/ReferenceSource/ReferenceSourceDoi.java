package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceDoiIterator theReferenceSource = (ReferenceSourceDoiIterator)findAncestorWithClass(this, ReferenceSourceDoiIterator.class);
			pageContext.getOut().print(theReferenceSource.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for doi tag ");
		}
		return SKIP_BODY;
	}
}

