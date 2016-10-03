package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptContentIterator theManuscript = (ManuscriptContentIterator)findAncestorWithClass(this, ManuscriptContentIterator.class);
			pageContext.getOut().print(theManuscript.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for content tag ");
		}
		return SKIP_BODY;
	}
}

