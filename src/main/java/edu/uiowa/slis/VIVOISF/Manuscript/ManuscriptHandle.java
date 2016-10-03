package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptHandleIterator theManuscript = (ManuscriptHandleIterator)findAncestorWithClass(this, ManuscriptHandleIterator.class);
			pageContext.getOut().print(theManuscript.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for handle tag ");
		}
		return SKIP_BODY;
	}
}

