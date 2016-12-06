package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038HasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038HasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038HasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038HasEmailIterator theBFO_0000038HasEmailIterator = (BFO_0000038HasEmailIterator)findAncestorWithClass(this, BFO_0000038HasEmailIterator.class);
			pageContext.getOut().print(theBFO_0000038HasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

