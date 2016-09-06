package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardRelatedType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardRelatedType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardRelatedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardRelatedIterator theAwardRelatedIterator = (AwardRelatedIterator)findAncestorWithClass(this, AwardRelatedIterator.class);
			pageContext.getOut().print(theAwardRelatedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for related tag ");
		}
		return SKIP_BODY;
	}
}

