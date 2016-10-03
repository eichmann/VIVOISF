package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptPageStartIterator theManuscript = (ManuscriptPageStartIterator)findAncestorWithClass(this, ManuscriptPageStartIterator.class);
			pageContext.getOut().print(theManuscript.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

