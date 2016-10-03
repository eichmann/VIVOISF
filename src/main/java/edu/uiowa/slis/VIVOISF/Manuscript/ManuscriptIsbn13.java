package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptIsbn13Iterator theManuscript = (ManuscriptIsbn13Iterator)findAncestorWithClass(this, ManuscriptIsbn13Iterator.class);
			pageContext.getOut().print(theManuscript.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

