package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentOwnerIterator thePatentOwnerIterator = (PatentOwnerIterator)findAncestorWithClass(this, PatentOwnerIterator.class);
			pageContext.getOut().print(thePatentOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for owner tag ");
		}
		return SKIP_BODY;
	}
}

