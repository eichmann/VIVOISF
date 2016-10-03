package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptSectionIterator theManuscript = (ManuscriptSectionIterator)findAncestorWithClass(this, ManuscriptSectionIterator.class);
			pageContext.getOut().print(theManuscript.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for section tag ");
		}
		return SKIP_BODY;
	}
}

