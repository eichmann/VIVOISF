package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptOwnerIterator theManuscriptOwnerIterator = (ManuscriptOwnerIterator)findAncestorWithClass(this, ManuscriptOwnerIterator.class);
			pageContext.getOut().print(theManuscriptOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for owner tag ");
		}
		return SKIP_BODY;
	}
}

