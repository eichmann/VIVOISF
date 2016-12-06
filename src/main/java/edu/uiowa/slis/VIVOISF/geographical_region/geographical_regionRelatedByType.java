package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionRelatedByIterator thegeographical_regionRelatedByIterator = (geographical_regionRelatedByIterator)findAncestorWithClass(this, geographical_regionRelatedByIterator.class);
			pageContext.getOut().print(thegeographical_regionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

