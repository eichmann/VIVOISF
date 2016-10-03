package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptUpcIterator theManuscript = (ManuscriptUpcIterator)findAncestorWithClass(this, ManuscriptUpcIterator.class);
			pageContext.getOut().print(theManuscript.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for upc tag ");
		}
		return SKIP_BODY;
	}
}

