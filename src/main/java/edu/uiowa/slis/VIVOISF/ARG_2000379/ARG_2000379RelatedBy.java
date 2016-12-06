package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379RelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379RelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379RelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379RelatedByIterator theARG_2000379RelatedByIterator = (ARG_2000379RelatedByIterator)findAncestorWithClass(this, ARG_2000379RelatedByIterator.class);
			pageContext.getOut().print(theARG_2000379RelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

