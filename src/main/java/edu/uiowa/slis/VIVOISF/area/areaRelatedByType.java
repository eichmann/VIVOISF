package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaRelatedByIterator theareaRelatedByIterator = (areaRelatedByIterator)findAncestorWithClass(this, areaRelatedByIterator.class);
			pageContext.getOut().print(theareaRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

