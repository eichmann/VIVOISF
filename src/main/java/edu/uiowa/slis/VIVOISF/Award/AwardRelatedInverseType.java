package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardRelatedInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardRelatedInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardRelatedInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardRelatedInverseIterator theAwardRelatedInverseIterator = (AwardRelatedInverseIterator)findAncestorWithClass(this, AwardRelatedInverseIterator.class);
			pageContext.getOut().print(theAwardRelatedInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for related tag ");
		}
		return SKIP_BODY;
	}
}

