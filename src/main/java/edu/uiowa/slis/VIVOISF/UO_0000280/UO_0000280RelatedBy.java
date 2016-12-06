package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280RelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280RelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280RelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280RelatedByIterator theUO_0000280RelatedByIterator = (UO_0000280RelatedByIterator)findAncestorWithClass(this, UO_0000280RelatedByIterator.class);
			pageContext.getOut().print(theUO_0000280RelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

