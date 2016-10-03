package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptShortTitleIterator theManuscript = (ManuscriptShortTitleIterator)findAncestorWithClass(this, ManuscriptShortTitleIterator.class);
			pageContext.getOut().print(theManuscript.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

