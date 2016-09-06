package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumRelatedByIterator theConsortiumRelatedByIterator = (ConsortiumRelatedByIterator)findAncestorWithClass(this, ConsortiumRelatedByIterator.class);
			pageContext.getOut().print(theConsortiumRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

