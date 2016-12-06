package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryRelatedByIterator theExplanatoryRelatedByIterator = (ExplanatoryRelatedByIterator)findAncestorWithClass(this, ExplanatoryRelatedByIterator.class);
			pageContext.getOut().print(theExplanatoryRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

