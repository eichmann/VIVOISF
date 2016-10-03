package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptNumberIterator theManuscript = (ManuscriptNumberIterator)findAncestorWithClass(this, ManuscriptNumberIterator.class);
			pageContext.getOut().print(theManuscript.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for number tag ");
		}
		return SKIP_BODY;
	}
}

