package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038RelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038RelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038RelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038RelatedByIterator theBFO_0000038RelatedByIterator = (BFO_0000038RelatedByIterator)findAncestorWithClass(this, BFO_0000038RelatedByIterator.class);
			pageContext.getOut().print(theBFO_0000038RelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

