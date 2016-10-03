package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentUriIterator thePatent = (PatentUriIterator)findAncestorWithClass(this, PatentUriIterator.class);
			pageContext.getOut().print(thePatent.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for uri tag ");
		}
		return SKIP_BODY;
	}
}

