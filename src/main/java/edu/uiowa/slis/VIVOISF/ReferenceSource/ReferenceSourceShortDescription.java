package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceShortDescriptionIterator theReferenceSource = (ReferenceSourceShortDescriptionIterator)findAncestorWithClass(this, ReferenceSourceShortDescriptionIterator.class);
			pageContext.getOut().print(theReferenceSource.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

