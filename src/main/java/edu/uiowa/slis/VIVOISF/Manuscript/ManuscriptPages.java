package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptPagesIterator theManuscript = (ManuscriptPagesIterator)findAncestorWithClass(this, ManuscriptPagesIterator.class);
			pageContext.getOut().print(theManuscript.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for pages tag ");
		}
		return SKIP_BODY;
	}
}

