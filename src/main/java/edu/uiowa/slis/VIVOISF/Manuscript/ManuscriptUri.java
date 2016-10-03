package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptUriIterator theManuscript = (ManuscriptUriIterator)findAncestorWithClass(this, ManuscriptUriIterator.class);
			pageContext.getOut().print(theManuscript.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for uri tag ");
		}
		return SKIP_BODY;
	}
}

