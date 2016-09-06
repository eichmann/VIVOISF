package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardNarrowerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardNarrowerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardNarrowerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardNarrowerIterator theAwardNarrowerIterator = (AwardNarrowerIterator)findAncestorWithClass(this, AwardNarrowerIterator.class);
			pageContext.getOut().print(theAwardNarrowerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for narrower tag ");
		}
		return SKIP_BODY;
	}
}

