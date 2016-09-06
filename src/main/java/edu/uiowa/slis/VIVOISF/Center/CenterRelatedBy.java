package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterRelatedByIterator theCenterRelatedByIterator = (CenterRelatedByIterator)findAncestorWithClass(this, CenterRelatedByIterator.class);
			pageContext.getOut().print(theCenterRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

