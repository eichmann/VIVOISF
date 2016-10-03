package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisOwnerIterator theThesisOwnerIterator = (ThesisOwnerIterator)findAncestorWithClass(this, ThesisOwnerIterator.class);
			pageContext.getOut().print(theThesisOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for owner tag ");
		}
		return SKIP_BODY;
	}
}

