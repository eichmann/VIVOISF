package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisIdentifierIterator theThesis = (ThesisIdentifierIterator)findAncestorWithClass(this, ThesisIdentifierIterator.class);
			pageContext.getOut().print(theThesis.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for identifier tag ");
		}
		return SKIP_BODY;
	}
}

