package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013PresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013PresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013PresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013PresentedAtIterator theIAO_0000013PresentedAtIterator = (IAO_0000013PresentedAtIterator)findAncestorWithClass(this, IAO_0000013PresentedAtIterator.class);
			pageContext.getOut().print(theIAO_0000013PresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

