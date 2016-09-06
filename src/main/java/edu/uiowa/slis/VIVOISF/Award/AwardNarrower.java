package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardNarrower extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardNarrower currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardNarrower.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardNarrowerIterator theAwardNarrowerIterator = (AwardNarrowerIterator)findAncestorWithClass(this, AwardNarrowerIterator.class);
			pageContext.getOut().print(theAwardNarrowerIterator.getNarrower());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for narrower tag ");
		}
		return SKIP_BODY;
	}
}

