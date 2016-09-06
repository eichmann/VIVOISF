package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourcePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourcePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourcePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourcePresentedAtIterator theReferenceSourcePresentedAtIterator = (ReferenceSourcePresentedAtIterator)findAncestorWithClass(this, ReferenceSourcePresentedAtIterator.class);
			pageContext.getOut().print(theReferenceSourcePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

