package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingRelatedByIterator thenon_self_governingRelatedByIterator = (non_self_governingRelatedByIterator)findAncestorWithClass(this, non_self_governingRelatedByIterator.class);
			pageContext.getOut().print(thenon_self_governingRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

