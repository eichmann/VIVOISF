package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptAuthorListIterator theManuscriptAuthorListIterator = (ManuscriptAuthorListIterator)findAncestorWithClass(this, ManuscriptAuthorListIterator.class);
			pageContext.getOut().print(theManuscriptAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for authorList tag ");
		}
		return SKIP_BODY;
	}
}

