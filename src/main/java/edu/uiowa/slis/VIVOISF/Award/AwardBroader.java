package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardBroaderIterator theAwardBroaderIterator = (AwardBroaderIterator)findAncestorWithClass(this, AwardBroaderIterator.class);
			pageContext.getOut().print(theAwardBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for broader tag ");
		}
		return SKIP_BODY;
	}
}

