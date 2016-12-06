package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRelatedByIterator theGeopoliticalEntityRelatedByIterator = (GeopoliticalEntityRelatedByIterator)findAncestorWithClass(this, GeopoliticalEntityRelatedByIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

