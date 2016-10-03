package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptEditionIterator theManuscript = (ManuscriptEditionIterator)findAncestorWithClass(this, ManuscriptEditionIterator.class);
			pageContext.getOut().print(theManuscript.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for edition tag ");
		}
		return SKIP_BODY;
	}
}

