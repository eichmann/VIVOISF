package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptIsbn10Iterator theManuscript = (ManuscriptIsbn10Iterator)findAncestorWithClass(this, ManuscriptIsbn10Iterator.class);
			pageContext.getOut().print(theManuscript.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

