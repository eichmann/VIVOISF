package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptStatusIterator theManuscriptStatusIterator = (ManuscriptStatusIterator)findAncestorWithClass(this, ManuscriptStatusIterator.class);
			pageContext.getOut().print(theManuscriptStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for status tag ");
		}
		return SKIP_BODY;
	}
}

