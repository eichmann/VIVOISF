package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptNumPagesIterator theManuscript = (ManuscriptNumPagesIterator)findAncestorWithClass(this, ManuscriptNumPagesIterator.class);
			pageContext.getOut().print(theManuscript.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for numPages tag ");
		}
		return SKIP_BODY;
	}
}

