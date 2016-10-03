package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardMemberInverseIterator theAwardMemberInverseIterator = (AwardMemberInverseIterator)findAncestorWithClass(this, AwardMemberInverseIterator.class);
			pageContext.getOut().print(theAwardMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for member tag ");
		}
		return SKIP_BODY;
	}
}

