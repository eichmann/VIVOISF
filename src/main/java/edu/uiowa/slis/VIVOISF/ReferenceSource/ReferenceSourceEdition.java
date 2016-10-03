package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceEditionIterator theReferenceSource = (ReferenceSourceEditionIterator)findAncestorWithClass(this, ReferenceSourceEditionIterator.class);
			pageContext.getOut().print(theReferenceSource.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for edition tag ");
		}
		return SKIP_BODY;
	}
}

