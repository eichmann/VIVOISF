package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingRelatedByIterator theself_governingRelatedByIterator = (self_governingRelatedByIterator)findAncestorWithClass(this, self_governingRelatedByIterator.class);
			pageContext.getOut().print(theself_governingRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

