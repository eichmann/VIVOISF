package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001RelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001RelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001RelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001RelatedByIterator theBFO_0000001RelatedByIterator = (BFO_0000001RelatedByIterator)findAncestorWithClass(this, BFO_0000001RelatedByIterator.class);
			pageContext.getOut().print(theBFO_0000001RelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

