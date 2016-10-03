package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptShortDescriptionIterator theManuscript = (ManuscriptShortDescriptionIterator)findAncestorWithClass(this, ManuscriptShortDescriptionIterator.class);
			pageContext.getOut().print(theManuscript.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

