package edu.uiowa.slis.VIVOISF.Related;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelatedRelated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelatedRelated currentInstance = null;
	private static final Log log = LogFactory.getLog(RelatedRelated.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelatedRelatedIterator theRelated = (RelatedRelatedIterator)findAncestorWithClass(this, RelatedRelatedIterator.class);
			pageContext.getOut().print(theRelated.getRelated());
		} catch (Exception e) {
			log.error("Can't find enclosing Related for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for related tag ");
		}
		return SKIP_BODY;
	}
}

