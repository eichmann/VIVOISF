package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardSponsoredBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardSponsoredBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardSponsoredBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardSponsoredByIterator theAwardSponsoredByIterator = (AwardSponsoredByIterator)findAncestorWithClass(this, AwardSponsoredByIterator.class);
			pageContext.getOut().print(theAwardSponsoredByIterator.getSponsoredBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for sponsoredBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for sponsoredBy tag ");
		}
		return SKIP_BODY;
	}
}

