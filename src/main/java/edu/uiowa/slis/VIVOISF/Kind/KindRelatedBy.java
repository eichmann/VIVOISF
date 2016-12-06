package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindRelatedByIterator theKindRelatedByIterator = (KindRelatedByIterator)findAncestorWithClass(this, KindRelatedByIterator.class);
			pageContext.getOut().print(theKindRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

