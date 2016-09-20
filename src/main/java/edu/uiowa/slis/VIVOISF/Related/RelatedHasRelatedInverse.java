package edu.uiowa.slis.VIVOISF.Related;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelatedHasRelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelatedHasRelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RelatedHasRelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelatedHasRelatedInverseIterator theRelatedHasRelatedInverseIterator = (RelatedHasRelatedInverseIterator)findAncestorWithClass(this, RelatedHasRelatedInverseIterator.class);
			pageContext.getOut().print(theRelatedHasRelatedInverseIterator.getHasRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Related for hasRelated tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for hasRelated tag ");
		}
		return SKIP_BODY;
	}
}

