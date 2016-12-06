package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020HasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020HasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020HasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020HasEmailIterator theBFO_0000020HasEmailIterator = (BFO_0000020HasEmailIterator)findAncestorWithClass(this, BFO_0000020HasEmailIterator.class);
			pageContext.getOut().print(theBFO_0000020HasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

